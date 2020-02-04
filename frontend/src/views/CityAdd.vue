<template>
    <el-card class="box-card">
        <el-form :model="cityForm" :rules="rules" ref="cityForm" label-width="100px" class="demo-cityForm">

            <el-form-item label="城市名称" prop="name">
                <el-input v-model="cityForm.name"></el-input>
            </el-form-item>
            <el-form-item label="城市编号" prop="cityId">
                <el-input v-model.number="cityForm.cityId"></el-input>
            </el-form-item>
            <el-form-item label="归属省编号" prop="provinceId">
                <el-input v-model.number="cityForm.provinceId"></el-input>
            </el-form-item>

            <el-form-item>
                <el-button type="primary" @click="submitForm('cityForm')">新增</el-button>
                <el-button @click="resetForm('cityForm')">重置</el-button>
            </el-form-item>
        </el-form>
    </el-card>
</template>

<script>
    export default {
        name: "CityAdd",
        data() {
            return {
                cityForm: {
                    name: '',
                    cityId: '',
                    provinceId: ''
                },
                rules: {
                    name: [
                        {required: true, message: '请输入城市名称', trigger: 'blur'},
                        {min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur'}
                    ],
                    cityId: [
                        {required: true, message: '请输入城市编号', trigger: 'blur'},
                        {type: 'number', message: '年龄必须为数字值'}
                    ],
                    provinceId: [
                        {required: true, message: '请输入归属省编号', trigger: 'blur'},
                        {type: 'number', message: '年龄必须为数字值'}
                    ],
                }
            };
        },
        methods: {
            submitForm(formName) {
                this.$refs[formName].validate((valid) => {
                    if (valid) {
                        console.log(this.cityForm);
                        const _this = this;
                        axios.post('http://127.0.0.1:8181/api/demo/city/add/').then(function (res) {
                            _this.total = res.data.total;
                            _this.tableData = res.data.records;
                        })
                        alert('submit!');
                    } else {
                        console.log('error submit!!');
                        return false;
                    }
                });
            },
            resetForm(formName) {
                this.$refs[formName].resetFields();
            }
        }

    }
</script>

<style scoped>

</style>