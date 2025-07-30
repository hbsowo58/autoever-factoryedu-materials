<template>
  <div>
    <h1>HomeChild</h1>
    <div>{{ name }}</div>
    <div>{{ age }}</div>
    <button @click="$emit('changeName')">이름 변경</button>
    <GrandChild :name="name" @setAgeOne="$emit('setAgeOne')" />
  </div>
</template>

<script setup>
import GrandChild from "./GrandChild.vue";
defineProps(["name", "age"]);
defineEmits(["changeName", "setAgeOne"]);
</script> 