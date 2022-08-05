<template>
 <div>
    <best-sellers-list></best-sellers-list>
    <new-releases-list></new-releases-list>
 </div>

</template>

<script>

import BestSellersList from '@/components/BestsellerList.vue';
import NewReleasesList from '@/components/NewReleasesList.vue';

export default {

    components: {
        BestSellersList, NewReleasesList
    }

};
</script>

<style>

</style>