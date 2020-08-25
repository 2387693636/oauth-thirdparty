/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.douyin.open.models;

import java.util.Objects;
import java.util.Arrays;
import com.douyin.open.models.PoiProductProductSpuAttributes1201;
import com.douyin.open.models.PoiProductProductSpuAttributes1209;
import com.douyin.open.models.PoiProductProductSpuAttributes1211;
import com.douyin.open.models.PoiProductProductSpuAttributes1212;
import com.douyin.open.models.PoiProductProductSpuAttributes1213;
import com.douyin.open.models.PoiProductProductSpuAttributes4101;
import com.douyin.open.models.PoiProductProductSpuAttributes90201;
import com.douyin.open.models.PoiProductProductSpuAttributes90205;
import com.douyin.open.models.PoiProductProductSpuAttributes9101;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * SPU属性字段
 */
@Schema(description = "SPU属性字段")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:54.684786+08:00[Asia/Shanghai]")
public class PoiProductProductSpuAttributes {
  @JsonProperty("1201")
  private List<PoiProductProductSpuAttributes1201> _1201 = null;

  @JsonProperty("1202")
  private String _1202 = null;

  @JsonProperty("1203")
  private Integer _1203 = null;

  @JsonProperty("1204")
  private BigDecimal _1204 = null;

  @JsonProperty("1205")
  private String _1205 = null;

  @JsonProperty("1206")
  private List<String> _1206 = null;

  @JsonProperty("1207")
  private String _1207 = null;

  @JsonProperty("1208")
  private String _1208 = null;

  @JsonProperty("1209")
  private PoiProductProductSpuAttributes1209 _1209 = null;

  @JsonProperty("1210")
  private String _1210 = null;

  @JsonProperty("1211")
  private PoiProductProductSpuAttributes1211 _1211 = null;

  @JsonProperty("1212")
  private PoiProductProductSpuAttributes1212 _1212 = null;

  @JsonProperty("1213")
  private PoiProductProductSpuAttributes1213 _1213 = null;

  /**
   * 早餐; 0 - 无早餐; 1~9 - n份早餐; 10 - 多份早餐
   */
  public enum _1214Enum {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3),
    NUMBER_4(4),
    NUMBER_5(5),
    NUMBER_6(6),
    NUMBER_7(7),
    NUMBER_8(8),
    NUMBER_9(9),
    NUMBER_10(10);

    private Integer value;

    _1214Enum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static _1214Enum fromValue(String text) {
      for (_1214Enum b : _1214Enum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("1214")
  private _1214Enum _1214 = null;

  @JsonProperty("90201")
  private PoiProductProductSpuAttributes90201 _90201 = null;

  /**
   * 是否可退 1- 随时退，2-不可退, 3-有条件退
   */
  public enum _90202Enum {
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3);

    private Integer value;

    _90202Enum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static _90202Enum fromValue(String text) {
      for (_90202Enum b : _90202Enum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("90202")
  private _90202Enum _90202 = null;

  /**
   * 取票信息 1-需要取票 2-无需取票
   */
  public enum _90203Enum {
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    _90203Enum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static _90203Enum fromValue(String text) {
      for (_90203Enum b : _90203Enum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("90203")
  private _90203Enum _90203 = null;

  @JsonProperty("90204")
  private Integer _90204 = null;

  @JsonProperty("90205")
  private PoiProductProductSpuAttributes90205 _90205 = null;

  @JsonProperty("4101")
  private PoiProductProductSpuAttributes4101 _4101 = null;

  @JsonProperty("9101")
  private PoiProductProductSpuAttributes9101 _9101 = null;

  public PoiProductProductSpuAttributes _1201(List<PoiProductProductSpuAttributes1201> _1201) {
    this._1201 = _1201;
    return this;
  }

  public PoiProductProductSpuAttributes add1201Item(PoiProductProductSpuAttributes1201 _1201Item) {
    if (this._1201 == null) {
      this._1201 = new ArrayList<>();
    }
    this._1201.add(_1201Item);
    return this;
  }

   /**
   * 设施列表
   * @return _1201
  **/
  @Schema(example = "[{\"code\":\"1000\",\"name\":\"空调\"},{\"code\":\"1000\",\"name\":\"窗户\"},{\"code\":\"1000\",\"name\":\"独立卫浴\"}]", description = "设施列表")
  public List<PoiProductProductSpuAttributes1201> get1201() {
    return _1201;
  }

  public void set1201(List<PoiProductProductSpuAttributes1201> _1201) {
    this._1201 = _1201;
  }

  public PoiProductProductSpuAttributes _1202(String _1202) {
    this._1202 = _1202;
    return this;
  }

   /**
   * 床型名称
   * @return _1202
  **/
  @Schema(example = "2*1.5米大床1张+2*1.2米单人床1张", description = "床型名称")
  public String get1202() {
    return _1202;
  }

  public void set1202(String _1202) {
    this._1202 = _1202;
  }

  public PoiProductProductSpuAttributes _1203(Integer _1203) {
    this._1203 = _1203;
    return this;
  }

   /**
   * 可住人数
   * @return _1203
  **/
  @Schema(example = "3", description = "可住人数")
  public Integer get1203() {
    return _1203;
  }

  public void set1203(Integer _1203) {
    this._1203 = _1203;
  }

  public PoiProductProductSpuAttributes _1204(BigDecimal _1204) {
    this._1204 = _1204;
    return this;
  }

   /**
   * 面积(平方米)
   * @return _1204
  **/
  @Schema(example = "28", description = "面积(平方米)")
  public BigDecimal get1204() {
    return _1204;
  }

  public void set1204(BigDecimal _1204) {
    this._1204 = _1204;
  }

  public PoiProductProductSpuAttributes _1205(String _1205) {
    this._1205 = _1205;
    return this;
  }

   /**
   * 房型封面图
   * @return _1205
  **/
  @Schema(example = "https://static.dingdandao.com/6ecf79cc9c8aab0e7d8fcc56eaf95342", description = "房型封面图")
  public String get1205() {
    return _1205;
  }

  public void set1205(String _1205) {
    this._1205 = _1205;
  }

  public PoiProductProductSpuAttributes _1206(List<String> _1206) {
    this._1206 = _1206;
    return this;
  }

  public PoiProductProductSpuAttributes add1206Item(String _1206Item) {
    if (this._1206 == null) {
      this._1206 = new ArrayList<>();
    }
    this._1206.add(_1206Item);
    return this;
  }

   /**
   * 房型相册
   * @return _1206
  **/
  @Schema(example = "[\"https://static.dingdandao.com/6ecf79cc9c8aab0e7d8fcc56eaf95342\",\"https://static.dingdandao.com/486b7541a39b9ce9c14903a10f371856\",\"https://static.dingdandao.com/a99f3d43bdc5a70133d9e023adab2529\",\"https://static.dingdandao.com/e3ced877d4bcfde0f1c1eba0199d23a4\",\"https://static.dingdandao.com/cac43a12847c6bf9c25e8a9190d02b92\",\"https://static.dingdandao.com/aa8f29af38b78bba45b0337861c452b3\",\"https://static.dingdandao.com/7515de5f56b1458f9c9baad28a2162d8\"]", description = "房型相册")
  public List<String> get1206() {
    return _1206;
  }

  public void set1206(List<String> _1206) {
    this._1206 = _1206;
  }

  public PoiProductProductSpuAttributes _1207(String _1207) {
    this._1207 = _1207;
    return this;
  }

   /**
   * 房型简介
   * @return _1207
  **/
  @Schema(example = "位置：二楼 朝南 （热门 特色：采光超好，床头即是窗边美景 朝阳大落地窗，超大露台浴缸 极具设计美感空间设计 配备：1.6*2米乳胶大床，1*1.6米定制儿童床 严选时尚家居用品，高端品牌床上用品 42寸智能电视,TOTO卫浴 适合人数：2大1小（不可加床）", description = "房型简介")
  public String get1207() {
    return _1207;
  }

  public void set1207(String _1207) {
    this._1207 = _1207;
  }

  public PoiProductProductSpuAttributes _1208(String _1208) {
    this._1208 = _1208;
    return this;
  }

   /**
   * 相关政策
   * @return _1208
  **/
  @Schema(example = "==入住规则== 1、入住需登记住房人的身份信息；大门采用电子锁，凭房卡刷卡自主出入 2、入住时间为14:00-23:00，提前到店可寄存行李，23点后到店如无预约民宿接送，则可能会需要您自行办理入住 3、上海市室内全面禁烟，房间及楼层内请勿吸烟，按条例规定室内抽烟罚款200元/次。 4、23点-次日7点时间段入住/退房客人请保持安静，需自助办理入住或退房（我们为早起去迪士尼的客人配备可打包带走的早餐，欢迎您提前到店预约） 5、可代收快递；可寄存行李；可打印复印文件；可开具住宿发票 6、商业摄影200元/小时起（公共区域+1个房间）详询店内工作人员 7、为您提供加床服务，有榻榻米床垫或折叠小床供您选择，成人（超员）加床100元/晚（含早）  ==儿童政策== 1m以下婴幼儿入住，免费赠送早餐、部分房型可提供婴儿床 1m-1.4m儿童入住，加早餐18元/位，使用现有床铺免费，加床50元/晚（含早） 1.4m以上青少年，加早餐25元/位，使用现有床铺免费，加床60元/晚（含早）  ==宠物政策== 允许携带宠物入住，请勿将宠物带入餐厅/儿童娱乐区 视清洁情况可能会要求加收清洁费50元/晚", description = "相关政策")
  public String get1208() {
    return _1208;
  }

  public void set1208(String _1208) {
    this._1208 = _1208;
  }

  public PoiProductProductSpuAttributes _1209(PoiProductProductSpuAttributes1209 _1209) {
    this._1209 = _1209;
    return this;
  }

   /**
   * Get _1209
   * @return _1209
  **/
  @Schema(description = "")
  public PoiProductProductSpuAttributes1209 get1209() {
    return _1209;
  }

  public void set1209(PoiProductProductSpuAttributes1209 _1209) {
    this._1209 = _1209;
  }

  public PoiProductProductSpuAttributes _1210(String _1210) {
    this._1210 = _1210;
    return this;
  }

   /**
   * 景观
   * @return _1210
  **/
  @Schema(example = "海滩景观", description = "景观")
  public String get1210() {
    return _1210;
  }

  public void set1210(String _1210) {
    this._1210 = _1210;
  }

  public PoiProductProductSpuAttributes _1211(PoiProductProductSpuAttributes1211 _1211) {
    this._1211 = _1211;
    return this;
  }

   /**
   * Get _1211
   * @return _1211
  **/
  @Schema(description = "")
  public PoiProductProductSpuAttributes1211 get1211() {
    return _1211;
  }

  public void set1211(PoiProductProductSpuAttributes1211 _1211) {
    this._1211 = _1211;
  }

  public PoiProductProductSpuAttributes _1212(PoiProductProductSpuAttributes1212 _1212) {
    this._1212 = _1212;
    return this;
  }

   /**
   * Get _1212
   * @return _1212
  **/
  @Schema(description = "")
  public PoiProductProductSpuAttributes1212 get1212() {
    return _1212;
  }

  public void set1212(PoiProductProductSpuAttributes1212 _1212) {
    this._1212 = _1212;
  }

  public PoiProductProductSpuAttributes _1213(PoiProductProductSpuAttributes1213 _1213) {
    this._1213 = _1213;
    return this;
  }

   /**
   * Get _1213
   * @return _1213
  **/
  @Schema(description = "")
  public PoiProductProductSpuAttributes1213 get1213() {
    return _1213;
  }

  public void set1213(PoiProductProductSpuAttributes1213 _1213) {
    this._1213 = _1213;
  }

  public PoiProductProductSpuAttributes _1214(_1214Enum _1214) {
    this._1214 = _1214;
    return this;
  }

   /**
   * 早餐; 0 - 无早餐; 1~9 - n份早餐; 10 - 多份早餐
   * @return _1214
  **/
  @Schema(description = "早餐; 0 - 无早餐; 1~9 - n份早餐; 10 - 多份早餐")
  public _1214Enum get1214() {
    return _1214;
  }

  public void set1214(_1214Enum _1214) {
    this._1214 = _1214;
  }

  public PoiProductProductSpuAttributes _90201(PoiProductProductSpuAttributes90201 _90201) {
    this._90201 = _90201;
    return this;
  }

   /**
   * Get _90201
   * @return _90201
  **/
  @Schema(description = "")
  public PoiProductProductSpuAttributes90201 get90201() {
    return _90201;
  }

  public void set90201(PoiProductProductSpuAttributes90201 _90201) {
    this._90201 = _90201;
  }

  public PoiProductProductSpuAttributes _90202(_90202Enum _90202) {
    this._90202 = _90202;
    return this;
  }

   /**
   * 是否可退 1- 随时退，2-不可退, 3-有条件退
   * @return _90202
  **/
  @Schema(description = "是否可退 1- 随时退，2-不可退, 3-有条件退")
  public _90202Enum get90202() {
    return _90202;
  }

  public void set90202(_90202Enum _90202) {
    this._90202 = _90202;
  }

  public PoiProductProductSpuAttributes _90203(_90203Enum _90203) {
    this._90203 = _90203;
    return this;
  }

   /**
   * 取票信息 1-需要取票 2-无需取票
   * @return _90203
  **/
  @Schema(description = "取票信息 1-需要取票 2-无需取票")
  public _90203Enum get90203() {
    return _90203;
  }

  public void set90203(_90203Enum _90203) {
    this._90203 = _90203;
  }

  public PoiProductProductSpuAttributes _90204(Integer _90204) {
    this._90204 = _90204;
    return this;
  }

   /**
   * 门票价格(展示最近7日最低价，精确到分)
   * @return _90204
  **/
  @Schema(example = "16800", description = "门票价格(展示最近7日最低价，精确到分)")
  public Integer get90204() {
    return _90204;
  }

  public void set90204(Integer _90204) {
    this._90204 = _90204;
  }

  public PoiProductProductSpuAttributes _90205(PoiProductProductSpuAttributes90205 _90205) {
    this._90205 = _90205;
    return this;
  }

   /**
   * Get _90205
   * @return _90205
  **/
  @Schema(description = "")
  public PoiProductProductSpuAttributes90205 get90205() {
    return _90205;
  }

  public void set90205(PoiProductProductSpuAttributes90205 _90205) {
    this._90205 = _90205;
  }

  public PoiProductProductSpuAttributes _4101(PoiProductProductSpuAttributes4101 _4101) {
    this._4101 = _4101;
    return this;
  }

   /**
   * Get _4101
   * @return _4101
  **/
  @Schema(description = "")
  public PoiProductProductSpuAttributes4101 get4101() {
    return _4101;
  }

  public void set4101(PoiProductProductSpuAttributes4101 _4101) {
    this._4101 = _4101;
  }

  public PoiProductProductSpuAttributes _9101(PoiProductProductSpuAttributes9101 _9101) {
    this._9101 = _9101;
    return this;
  }

   /**
   * Get _9101
   * @return _9101
  **/
  @Schema(description = "")
  public PoiProductProductSpuAttributes9101 get9101() {
    return _9101;
  }

  public void set9101(PoiProductProductSpuAttributes9101 _9101) {
    this._9101 = _9101;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiProductProductSpuAttributes spuAttributes = (PoiProductProductSpuAttributes) o;
    return Objects.equals(this._1201, spuAttributes._1201) &&
        Objects.equals(this._1202, spuAttributes._1202) &&
        Objects.equals(this._1203, spuAttributes._1203) &&
        Objects.equals(this._1204, spuAttributes._1204) &&
        Objects.equals(this._1205, spuAttributes._1205) &&
        Objects.equals(this._1206, spuAttributes._1206) &&
        Objects.equals(this._1207, spuAttributes._1207) &&
        Objects.equals(this._1208, spuAttributes._1208) &&
        Objects.equals(this._1209, spuAttributes._1209) &&
        Objects.equals(this._1210, spuAttributes._1210) &&
        Objects.equals(this._1211, spuAttributes._1211) &&
        Objects.equals(this._1212, spuAttributes._1212) &&
        Objects.equals(this._1213, spuAttributes._1213) &&
        Objects.equals(this._1214, spuAttributes._1214) &&
        Objects.equals(this._90201, spuAttributes._90201) &&
        Objects.equals(this._90202, spuAttributes._90202) &&
        Objects.equals(this._90203, spuAttributes._90203) &&
        Objects.equals(this._90204, spuAttributes._90204) &&
        Objects.equals(this._90205, spuAttributes._90205) &&
        Objects.equals(this._4101, spuAttributes._4101) &&
        Objects.equals(this._9101, spuAttributes._9101);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1201, _1202, _1203, _1204, _1205, _1206, _1207, _1208, _1209, _1210, _1211, _1212, _1213, _1214, _90201, _90202, _90203, _90204, _90205, _4101, _9101);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiProductProductSpuAttributes {\n");
    
    sb.append("    _1201: ").append(toIndentedString(_1201)).append("\n");
    sb.append("    _1202: ").append(toIndentedString(_1202)).append("\n");
    sb.append("    _1203: ").append(toIndentedString(_1203)).append("\n");
    sb.append("    _1204: ").append(toIndentedString(_1204)).append("\n");
    sb.append("    _1205: ").append(toIndentedString(_1205)).append("\n");
    sb.append("    _1206: ").append(toIndentedString(_1206)).append("\n");
    sb.append("    _1207: ").append(toIndentedString(_1207)).append("\n");
    sb.append("    _1208: ").append(toIndentedString(_1208)).append("\n");
    sb.append("    _1209: ").append(toIndentedString(_1209)).append("\n");
    sb.append("    _1210: ").append(toIndentedString(_1210)).append("\n");
    sb.append("    _1211: ").append(toIndentedString(_1211)).append("\n");
    sb.append("    _1212: ").append(toIndentedString(_1212)).append("\n");
    sb.append("    _1213: ").append(toIndentedString(_1213)).append("\n");
    sb.append("    _1214: ").append(toIndentedString(_1214)).append("\n");
    sb.append("    _90201: ").append(toIndentedString(_90201)).append("\n");
    sb.append("    _90202: ").append(toIndentedString(_90202)).append("\n");
    sb.append("    _90203: ").append(toIndentedString(_90203)).append("\n");
    sb.append("    _90204: ").append(toIndentedString(_90204)).append("\n");
    sb.append("    _90205: ").append(toIndentedString(_90205)).append("\n");
    sb.append("    _4101: ").append(toIndentedString(_4101)).append("\n");
    sb.append("    _9101: ").append(toIndentedString(_9101)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
