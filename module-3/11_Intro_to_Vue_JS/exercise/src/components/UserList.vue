<template>
  <table id="tblUsers">
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Username</th>
        <th>Email Address</th>
        <th>Status</th>
    </tr>
    </thead>
    <tbody>
       <tr>
        <td><input type="text" id="firstNameFilter"  v-model="filter.firstName"/></td>
        <td><input id="lastNameFilter" v-model="filter.lastName" type="text"/></td>
        <td><input id="usernameFilter" v-model="filter.username" type="text"/></td>
        <td><input id="emailFilter" v-model="filter.emailAddress" type="text"/></td>
        <td>
          <select v-model="filter.status" id="statusFilter">
            <option value="">Show All</option>
            <option value="Active">Active</option>
            <option value="Disabled">Disabled</option>
            <td><input v-model="filter.status" type="text"/></td>
          </select>
        </td>
      </tr>
      <!-- user listing goes here -->
      <tr v-for="user in filteredList" v-bind:key="user.emailAddress">
        <td>{{user.firstName}}</td>
        <td>{{user.lastName}}</td>
        <td>{{user.username}}</td>
        <td>{{user.emailAddress}}</td>
        <td>{{user.status}}</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  name: 'user-list',
  data() {
    return{
      users: [
        { firstName: 'John', lastName: 'Smith', username: 'jsmith', emailAddress: 'jsmith@gmail.com', status: 'Active' },
        { firstName: 'Anna', lastName: 'Bell', username: 'abell', emailAddress: 'abell@yahoo.com', status: 'Active' },
        { firstName: 'George', lastName: 'Best', username: 'gbest', emailAddress: 'gbest@gmail.com', status: 'Disabled' },
        { firstName: 'Ben', lastName: 'Carter', username: 'bcarter', emailAddress: 'bcarter@gmail.com', status: 'Active' },
        { firstName: 'Katie', lastName: 'Jackson', username: 'kjackson', emailAddress: 'kjackson@yahoo.com', status: 'Active' },
        { firstName: 'Mark', lastName: 'Smith', username: 'msmith', emailAddress: 'msmith@foo.com', status: 'Disabled' }
      ],
      filter: {
        firstName: "",
        lastName:"",
        username:"",
        emailAddress: '',
        status: ''
      }
    }
  },
 computed:{
    filteredList(){
      let filteredUsers = this.users.filter(
        (x) => {
          return x.firstName.toLowerCase()
          .includes(this.filter.firstName.toLowerCase());
        }
      )
      return filteredUsers;
    }
  }
}
</script>

<style scoped>
table {
  margin-top: 20px;
  font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif
}
th {
  text-transform: uppercase
}
td {
  padding: 10px;
}
tr.disabled {
  color: red;
}
input, select {
  font-size: 16px;
}
</style>
