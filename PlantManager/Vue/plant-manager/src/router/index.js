import Vue from 'vue'
import Router from 'vue-router'
import store from '@/store/index.js'
import GardenView from '@/views/GardenView.vue'
import PlantList from '@/views/PlantList.vue'
import Login from '@/views/Login.vue'
Vue.use(Router)

/**
 * The Vue Router is used to "direct" the browser to render a specific view component
 * inside of App.vue depending on the URL.
 *
 * It also is used to detect whether or not a route requires the user to have first authenticated.
 * If the user has not yet authenticated (and needs to) they are redirected to /login
 * If they have (or don't need to) they're allowed to go about their way.
 */

const router = new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
        path: '/myGarden',
        name: 'GardenView',
        component: GardenView
    },
    {
        path: '/myPlants',
        name: 'PlantList',
        component: PlantList
    },
    {
      path: '/login',
      name: 'Login',
      component: Login
    }
  ]})

  router.beforeEach((to, from, next) => {
    // Determine if the route requires Authentication
    const requiresAuth = to.matched.some(x => x.meta.requiresAuth);
  
    // If it does and they are not logged in, send the user to "/login"
    if (requiresAuth && store.state.token === '') {
      next("/login");
    } else {
      // Else let them go to their next destination
      next();
    }
  });
  
  export default router;