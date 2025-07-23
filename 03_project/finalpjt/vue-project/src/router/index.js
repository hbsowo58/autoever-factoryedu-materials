import { createRouter, createWebHistory } from "vue-router";

// 페이지 컴포넌트 import
import DashboardPage from "../pages/DashboardPage.vue";
import VehicleDetailPage from "../pages/VehicleDetailPage.vue";
import AlertLogPage from "../pages/AlertLogPage.vue";
import NotFoundPage from "../pages/NotFoundPage.vue";
import AddVehiclePage from "../pages/AddVehiclePage.vue"; // 차량 등록 페이지 추가

// 라우터 설정
const routes = [
  {
    path: "/",
    name: "Dashboard",
    component: DashboardPage,
  },
  {
    path: "/vehicle/:id",
    name: "VehicleDetail",
    component: VehicleDetailPage,
    props: true,
  },
  {
    path: "/alerts",
    name: "AlertLog",
    component: AlertLogPage,
  },
  {
    path: "/add-vehicle", // 차량 등록 경로 추가
    name: "AddVehicle",
    component: AddVehiclePage,
  },
  {
    path: "/:pathMatch(.*)*",
    name: "NotFound",
    component: NotFoundPage,
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
