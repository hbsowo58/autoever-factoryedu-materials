import { createRouter, createWebHistory } from "vue-router";

// 라우터 설정
const routes = [
  {
    path: "/",
    name: "Dashboard",
    component: () => import("../pages/DashboardPage.vue"),
  },
  {
    path: "/vehicle/:id",
    name: "VehicleDetail",
    component: () => import("../pages/VehicleDetailPage.vue"),
    props: true,
  },
  {
    path: "/alerts",
    name: "AlertLog",
    component: () => import("../pages/AlertLogPage.vue"),
  },
  {
    path: "/add-vehicle", // 차량 등록 경로 추가
    name: "AddVehicle",
    component: () => import("../pages/AddVehiclePage.vue"),
  },
  {
    path: "/:pathMatch(.*)*",
    name: "NotFound",
    component: () => import("../pages/NotFoundPage.vue"),
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
