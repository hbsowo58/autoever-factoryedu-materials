<template>
  <div>
    <h1>GrandChild</h1>
    <div>{{ name }}</div>
    <button @click="$emit('setAgeOne')">나이를 1로 변경</button>
  </div>
</template>

<script setup>
defineProps(["name"]);
defineEmits(["setAgeOne"]);
</script> 