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

    </div>
  </div>
</template>

<script>
export default {

  data(){
    return{
      rowNum : 0,
      columnNum: 0
    }
  },
  methods:{
    ChangeGrid(){
     document.documentElement.style.setProperty("--rowNum", this.rowNum);
      document.documentElement.style.setProperty("--columnNum", this.columnNum);
    }
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
    grid-template-columns: repeat(var(--columnNum), 20px);
    grid-template-rows: repeat(var(--rowNum), 20px);
    grid-gap: 3px;
    max-width: 60%;
    max-height: 60%;
    background-color: #462214;
}
</style>