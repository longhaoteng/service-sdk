[![Latest release](https://img.shields.io/github/release/longhaoteng/api-spring-boot-starter.svg)](https://github.com/longhaoteng/service-sdk/releases/latest)
[![License](https://img.shields.io/hexpm/l/plug.svg?maxAge=2592000)](https://github.com/longhaoteng/service-sdk/blob/master/LICENSE)

# SERVICE-SDK

整合一些常用基础类和服务底层类，提升开发效率和规范代码结构



## Maven

```XML
<dependency>
    <groupId>com.github.longhaoteng</groupId>
    <artifactId>service-sdk</artifactId>
    <version>latest</version>
</dependency>
```



## 示例

- 对象序列化（开闭原则）

  ```java
  // java bean
  @Data
  @ToString
  @EqualsAndHashCode(callSuper = false)
  @Entity
  @Table(name = "test")
  @NoArgsConstructor
  @AllArgsConstructor
  @Builder
  @Accessors(chain = true)
  @EntityListeners(AuditingEntityListener.class)
  public class Banner extends BaseEntity {
  
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
  
      private String name;
  
      private String password;
  
      @CreatedDate
      private LocalDateTime createDatetime;
  
      @LastModifiedDate
      private LocalDateTime updateDatetime;
  
      @Transactional
      public Test create() {
          TestRepository repository = getBean(TestRepository.class);
          return repository.save(this);
      }
  
      @Transactional
      public void update(String name, String password) {
          this.name = name;
          this.password = password;
  
          TestRepository repository = getBean(TestRepository.class);
          repository.save(this);
      }
  
      @Transactional
      public void delete() {
          TestRepository repository = getBean(TestRepository.class);
          repository.delete(this);
      }
  
  }
  
  // 对象操作 在service中数据序列化操作变成了简单的对象操作
  test.create();
  test.update(name,password);
  test.delete();
  ```
- 对象深度拷贝（这里使用的是dozer），浅拷贝可使用spring的BeanUtils.copyProperties()，效率更高
  
  ```java
  Test test = repository.findOne(id).orElse(null);
  TestVO testVo = TestVO.builder().build();
  testVo = BeanConverter.map(test, TestVO.class);
  // 列表同理
  BeanConverter.map(List<S> sourceList, Class<T> targetClass);
  ```


## 加入项目
欢迎添砖加瓦
