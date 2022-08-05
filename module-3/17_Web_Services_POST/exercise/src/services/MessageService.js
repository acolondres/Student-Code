import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

  get(id) {
    return http.get(`/messages/${id}`);
  },

  create(message) {
    const url= '/messages'
    return http.post(url, message);
  },

  update(id, message) {
    return http.put(`/messages/${id}`, message);
  },

  delete(id) {
    return http.delete(`/messages/${id}`);
  },

}
