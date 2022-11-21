<template>

    <v-data-table
        :headers="headers"
        :items="orderspec"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'OrderspecView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "state", value: "state" },
            ],
            orderspec : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/orderspecs'))

            temp.data._embedded.orderspecs.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.orderspec = temp.data._embedded.orderspecs;
        },
        methods: {
        }
    }
</script>

