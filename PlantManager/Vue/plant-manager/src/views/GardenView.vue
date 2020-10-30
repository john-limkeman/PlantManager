<template>
  <div>
    <h1>MY GARDEN</h1>
    <!--<form v-on:submit.prevent='ChangeGrid()'>
    <label for="rows">Rows</label>
      <input type="number" name='rows' v-model="rowNum"> 
      <label for="columns">Columns</label>
      <input type="number" name='columns' v-model="columnNum">
      <button>Update</button>
    </form> -->
    <div id="gardenBox">
      <div
        v-for="plot in plots"
        v-bind:key="plot.id"
        :id="'plot' + plot.id"
        v-on:click.prevent="toggleColor(plot)"
        class="plotBox"
        @drop='onDrop($event, plot)' 
        @dragover.prevent
        @dragenter.prevent
      >
      <div v-for='plant in plantPlots(plot.id)' v-bind:key='plant.id' draggable @dragstart='startDrag($event, plant)'>
        <p>{{plant.name}}</p>
      </div>
    
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      rowNum: 0,
      columnNum: 0,
      plants: [
        {
          id: 1,
          name: "tomato",
          img:
            "https://www.alimentarium.org/en/system/files/thumbnails/image/AL027-01_pomme_de_terre_0.jpg",
          plot: 1,
        },
        {
          id: 2,
          name: "potato",
          img:
            "https://www.alimentarium.org/en/system/files/thumbnails/image/AL027-01_pomme_de_terre_0.jpg",
          plot: 5,
        },
      ],
    };
  },
  methods: {
    /*  ChangeGrid(){
      document.documentElement.style.setProperty("--rowNum", this.rowNum);
      document.documentElement.style.setProperty("--columnNum", this.columnNum);
    }, */
    plantPlots(x) {
      let chosen =[];
      this.plants.forEach((plant) => {
        if (plant.plot == x) {
          chosen.push(plant);
        }
      });
      return chosen;
    },
    toggleColor(plot) {
      let item = document.getElementById("plot" + plot.id).style
        .backgroundColor;
      if (item == "green" || item == "lightgreen") {
        document.getElementById("plot" + plot.id).style.backgroundColor =
          "#462214";
      } else {
        document.getElementById("plot" + plot.id).style.backgroundColor =
          "green";
      }
    },
    startDrag: (evt, plant) => {
      evt.dataTransfer.dropEffect = 'move'
      evt.dataTransfer.effectAllowed = 'move'
      evt.dataTransfer.setData('id', plant.id)
    },
    onDrop (evt, plot) {
      const id = evt.dataTransfer.getData('id')
      const item = this.plants.find(plant => plant.id == id)
      item.plot = plot.id
    },
  },
  computed: {
    plots() {
      let plots = [];
      for (let i = 1; i < 101; i++) {
        plots.push({ id: i, type: "plot" });
      }
      return plots;
    },
    plantByPlot(plotId){
      let chosen = [];
      this.plants.forEach((plant) => {
        if (plant.plot == plotId) {
          chosen = plant;
        }
      });
      return chosen;
    }
  },
  created() {},
};
</script>

<style scoped>
:root {
  --rowNum: 4;
  --columnNum: 4;
}
#gardenBox {
  display: grid;
  border: solid black 2px;
  /*grid-template-columns: repeat(var(--columnNum), 1fr);
    grid-template-rows: repeat(var(--rowNum), 1fr);*/
  grid-template-columns: 1fr 1fr 1fr 1fr 1fr 1fr 1fr 1fr 1fr 1fr;
  grid-template-areas:
    "1 2 3 4 5 6 7 8 9 10"
    "11 12 13 14 15 16 17 18 19 20"
    "21 22 23 24 25 26 27 28 29 30"
    "31 32 33 34 35 36 37 38 38 40"
    "41 42 43 44 45 46 47 48 49 50"
    "51 52 53 54 55 56 57 58 59 60"
    "61 62 63 64 65 66 67 68 69 70"
    "71 72 73 74 75 76 77 78 79 80"
    "81 82 83 84 85 86 87 88 89 90"
    "91 92 93 94 95 96 97 98 99 100";
  grid-gap: 3px;
  width: 700px;
  height: 700px;
}
p{
  background-color:yellow;
}
.plotBox {
  background-color: green;
  border: solid, black, 2px;
}
/* .plotBox:hover{
  transition-duration: 1s;
  transition-property: background-color;
  background-color: lightgreen;
} */
#plotBox1 {
}
</style>