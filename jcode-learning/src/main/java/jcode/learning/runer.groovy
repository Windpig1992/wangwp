package jcode.learning



/**
 * @author wangwenping
 * @Since: 2019/3/29
 */


String s = "最,第一,唯一,NO.1,TOP1,独一无二,遗留,一天,仅此一次,仅此一款,大品牌之,国家级,国际级,世界级,千万级,百万级,星级,5A,甲级,超甲级,顶级,顶尖,尖端,顶级享受,高级,极品,极佳,绝佳,绝对,终极,极致,致极,极具,完美,至尊,至臻,臻品,臻致,臻席,压轴,问鼎,空前,绝后,绝版,无双,非此莫属,巅峰,前所未有,无人能及,顶级,鼎级,鼎冠,定鼎,完美,翘楚之作,不可再生,不可复制,绝无仅有,寸土寸金,淋漓尽致,无与伦比,唯一,卓越,卓著,前无古人后无来者,绝版,珍稀,臻稀,稀少,绝无仅有,绝不在有,稀世珍宝,千金难求,世所罕见,不可多得,空前绝后,寥寥无几,屈指可数,独家,独创,独据,开发者,缔造者,创始者,发明者,首个,首选,独家,首发,首席,首府,首选,首屈一指,全国首家,国家领导人,国门,国宅,首次,填补国内空白,国际品质,黄金旺铺,黄金价值,黄金地段,金钱,金融汇币图片,外国货币,大牌,金牌,名牌,王牌,领先上市,巨星,著名,掌门人,至尊,冠军,之王,王者楼王,墅王,皇家,世界领先,领先,领导者,领袖,引领,创领,领航,耀领,史无前例,前无古人,永久,万能,百分之百,特供,专供,专家推荐,领导人推荐,使用人民币图样,点击领奖,恭喜获奖,全民免单,点击有惊喜,点击获取,点击转身,领取奖品,抽奖,售罄,售空,再不抢就没了,史上最低价,不会再便宜,没有他就,错过不再,错过即无,错过就没机会了,未曾有过的,万人疯抢,全民疯抢,全民抢购,免费领,免费住,0首付,免首付,零距离,价格你来定,帝都,皇城,皇室领地,皇家,皇室,皇族,殿堂,白宫,王府,府邸,皇室住所,政府机关,行政大楼,使馆,境线,国家大型赛事,冬奥会,奥林匹克运动会,世界杯,双十一,升值价值,价值洼地,价值天成,千亿价值,投资回报,众筹,抄涨,炒股不如买房,升值潜力无线,买到即赚到,得房率,亩,公里,平方米,绿化率,容积率,热销,成交,直达家门口,地铁上盖,咫尺地铁站,万亩公园,几大商场环绕,万达在旁,机场辐射区,条地铁,条公交,地铁旁,CBD坐标,CBD核心,城市核心地段,你在城心,我在你心,中央,中心,重心,中枢,重点,腹地,地标,城市中央,凌驾于世界之上,100%,no.1,百分百,第一,巅峰,顶级,顶尖,独家,独一无二,国家级,行业领导,极品,极致,介绍率,绝对,绝无仅有,零差评,领导者,领军,领先,领袖,满意,名牌,权威,首个,首家,首选,推荐,唯一,一流,百分之百"
List<String> list = s.split(",").collect{it as String}
String target = "1986年长颈鹿文化事业股份有限公司成立于宝岛台湾，1987年成立第一家儿童英语教学中心，目前则有近700家分校遍布于各地,30多年来，长颈鹿美语一直兢兢业业，致力于幼少儿的英语培训,"
for (String s1 : list) {
    if (target.indexOf(s1) != -1) {
        println s1
    }
}


FileReader momentReader = new FileReader(new File("/Users/wangwenping/Desktop/tencent/adgroup/moment.txt"))
BufferedReader momentBufferedReader = new BufferedReader(momentReader)
List<Long> momentAdGroupIds = new ArrayList<>()
while (true) {
    String str = momentBufferedReader.readLine()
    if (str == null) {
        break
    }
    momentAdGroupIds.add(Long.valueOf(str))
}


FileReader gdtReader = new FileReader(new File("/Users/wangwenping/Desktop/tencent/adgroup/gdt.txt"))
BufferedReader gdtBufferedReader = new BufferedReader(gdtReader)
List<Long> gdtAdGroupIds = new ArrayList<>()
while (true) {
    String str = gdtBufferedReader.readLine()
    if (str == null) {
        break
    }
    gdtAdGroupIds.add(Long.valueOf(str))
}


FileReader asyncReader = new FileReader(new File("/Users/wangwenping/Desktop/tencent/adgroup/async.txt"))
BufferedReader asyncBufferedReader = new BufferedReader(asyncReader)
List<Long> asyncAdGroupIds = new ArrayList<>()
while (true) {
    String str = asyncBufferedReader.readLine()
    if (str == null) {
        break
    }
    asyncAdGroupIds.add(Long.valueOf(str))
}

gdtAdGroupIds.addAll(momentAdGroupIds)

asyncAdGroupIds.removeAll(gdtAdGroupIds)

println asyncAdGroupIds
