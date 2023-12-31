# 一、 搜索推荐基础
## 距离计算：
1. 需要接入 `百度地图SDK` 通过 `API` 获取当前用户经纬度传给服务端
2. 利用球体平面计算公式，在 `sql` 语句层面计算出用户与门店之间的距离
3. 对应距离数值集成到门店模型内用于展示或后续排序
## 应用程序集成：
1. 通过 `Spring MVC` 集成搜索和推荐的 `controller` , `service` 和 `dao`
2. 完成前端页面闭环
# 二、 推荐 V1.0 结构
## 原理：
```text
通过数据库的线性计算公式给出门店打分后排序输出给用户
```
## 不足：
1. 线性计算公式理论与实际计算操作过程有误差，线性计算公式没有办法很好的满足实际需求
2. 没有考虑用户差异（当前距离除外），没有办法做到个性化的千人千面推荐
# 三、 搜索 V1.0 结构
## 原理：
```text
通过数据库的关键词模糊匹配的方式结合线性计算公式给门店打分后排序输出给用户
```
## 不足：
1. 采用数据库的关键词模糊匹配与文本匹配方式，没有办法实现分词、中文特性等用户深层次需求
2. 线性计算公式理论与实际计算操作过程有误差，线性计算公式没有办法很好的满足实际需求
3. 数据库做搜索性能很差