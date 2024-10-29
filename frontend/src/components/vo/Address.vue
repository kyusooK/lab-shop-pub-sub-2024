<template>
    <div style="margin: 0 -15px 0 -15px;">
        <v-card-title  v-if="editMode">
            {{label}}
        </v-card-title>
        <v-card-text v-if="value">
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field label="Country" v-model="value.country" />
            </div>
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field label="State" v-model="value.state" placeholder="OO도"/>
            </div>
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field label="City" v-model="value.city"/>
            </div>
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field label="Street" v-model="value.street"/>
            </div>
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field label="Zipcode" v-model="value.zipcode" />
            </div>

            <div v-if="!editMode">
                <p style="font-family:sans-serif; font-weight:bold; font-size:15px">{{value.country }} / {{value.state }} {{value.city }}  {{value.street }} ({{value.zipcode }})</p>
                <v-divider></v-divider><br>
            </div>
        </v-card-text>
    </div>
</template>

<script>
    export default {
        name:"Address",
        props: {
            editMode: Boolean,
            value : Object,
            label : String,
        },
        data: () => ({
        }),
        created(){
            if(!this.value) {
                this.value = {
                    'street': '',
                    'city': '',
                    'state': '',
                    'country': '',
                    'zipcode': '',
                };
            }
        },
        watch: {
            value(newVal) {
                this.$emit('input', newVal);
            },
        },
    }
</script>

<style scoped>
</style>
