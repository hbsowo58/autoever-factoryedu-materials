<template>
  <div style="border: 2px solid black; padding: 10px; width: 350px">
    <h1>HomeView</h1>
    <div>{{ name }}</div>
    <div>{{ age }}</div>
    <button @click="age--">나이를 줄이자</button>
    <HomeChild
      :name="name"
      :age="age"
      @changeName="changeName"
      @setAgeOne="setAgeOne"
    />
  </div>
</template>

<script setup>
import { ref } from "vue";
import HomeChild from "./HomeChild.vue";

const name = ref("david");
const age = ref(10);

function changeName() {
  name.value = "홍길동";
}
function setAgeOne() {
  age.value = 1;
}
</script> 