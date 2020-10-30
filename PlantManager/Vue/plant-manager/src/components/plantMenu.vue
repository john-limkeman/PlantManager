<template>
  <div>
    <div v-if="isOpen" v-on:hover='togglePanel()'>
      <h2>Tools</h2>
      <div>
        <h4>Add Plant</h4>
      </div>
    </div>
    <div id='ClosedPanel' v-else></div>
  </div>
</template>

<script>
export default {
    data(){
        return{
            isOpen : false
        }
    },
    methods:{
        togglePanel(){
            if (isOpen){
                isOpen = false;
            } else {
                isOpen = true;
            }
        }
    }
}
</script>

<style>
</style>