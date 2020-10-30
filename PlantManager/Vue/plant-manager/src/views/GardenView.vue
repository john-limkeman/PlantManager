<template>
  <div>
    <h1>MY GARDEN</h1>
    <form v-on:submit.prevent='ChangeGrid()'>
    <label for="rows">Rows</label>
      <input type="number" name='rows' v-model="rowNum"> 
      <label for="columns">Columns</label>
      <input type="number" name='columns' v-model="columnNum">
      <button>Update</button>
    </form>
    <div id='gardenBox'>
      <div v-for="plot in plots" v-bind:key="plot.id" :id='"plot" + plot.id' v-on:click.prevent='toggleColor(plot)' class='plotBox'> 
      DIG
      </div>
    </div>
  </div>
</template>

<script>
export default {

  data(){
    return{
      rowNum : 0,
      columnNum: 0,
    }
  },
  methods:{
    ChangeGrid(){
     document.documentElement.style.setProperty("--rowNum", this.rowNum);
      document.documentElement.style.setProperty("--columnNum", this.columnNum);
    },
    toggleColor(plot){
      document.getElementById("plot" + plot.id).style.backgroundColor = 'black';
      // let item = document.getElementById("plot" + plot.id).style.background-color;
      // if(item == 'green'){
      //   item = 'brown';
      // } else {
      //   item = 'green';
      // }
    }
  },
  computed: {
    plots(){
      let plots = [];
     for (let i = 1; i < 101; i++ ){
      plots.push({id: i, type: 'plot'});
    }
    return plots;
    }
  },
  created(){
  }
};
</script>

<style scoped>
:root {
  --rowNum: 4;
  --columnNum: 4;
}
#gardenBox{
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

.plotBox{
 background-color:green;
 border: solid, black, 2px;
}
.plotBox:hover{
  background-color: lightgreen;
}
</style>