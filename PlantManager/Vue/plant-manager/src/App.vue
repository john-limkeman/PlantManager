<template>
  <div id="app">
  <router-view />
   <nav>
   <router-link v-bind:to='{name: "GardenView"}' class='navlink'>My Garden</router-link> &nbsp;|&nbsp;
   <router-link v-bind:to='{name: "PlantList"}' class='navlink'>My Plants</router-link> &nbsp;|&nbsp;
   <router-link v-bind:to='{name: "Login"}' class='navlink'>Logout</router-link>
   </nav>
  </div>
</template>

<script>

export default {
  name: 'App',
  components: {
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
nav{
display: block;
position: fixed;
right: 0px;
top: 0px;
width: 100%;
border: solid black 2px;
background-color: lightgreen;
}
</style>
