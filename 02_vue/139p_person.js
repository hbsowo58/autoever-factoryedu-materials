import { defineStore } from "pinia";

export const usePersonStore = defineStore("person", {
  state: () => ({
    name: "david",
    age: 10,
  }),
});
