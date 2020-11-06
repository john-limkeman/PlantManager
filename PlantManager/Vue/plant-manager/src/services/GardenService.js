// all api calls concerning user gardens go here.

import axios from 'axios';

export default {

    getPlantsByUser(id){
        return axios.get(`/${id}/plants`);
    },
    getPlantById(id){
        return axios.get(`/plant/${id}`)
    }
}