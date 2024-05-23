package bo;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: bo.s0 */
/* loaded from: classes4.dex */
public abstract class AbstractC3035s0 {

    /* renamed from: a */
    public static boolean f12229a = false;

    /* renamed from: b */
    public static boolean f12230b = false;

    /* renamed from: c */
    public static boolean f12231c = false;

    /* renamed from: d */
    public static boolean f12232d = false;

    /* renamed from: e */
    static int f12233e = -1;

    /* renamed from: a */
    public static void m14591a(JSONObject jSONObject, boolean z11, boolean z12) {
        try {
            if (!z12) {
                if (z11) {
                    jSONObject.getJSONObject("content").put("caption", "Hdjjdjđj jdjdkdk djdkdkdk djdkdkd djdjdjd dsjsjdj djdjdjd djdjdj wwwwwwwHdjjdjđj jdjdkdk djdkdkdk djdkdkd djdjdjd dsjsjdj djdjdjd djdjdj wwwwwwwHdjjdjđj jdjdkdk djdkdkdk djdkdkd djdjdjd dsjsjdj djdjdjd djdjdj wwwwwwwHdjjdjđj jdjdkdk djdkdkdk djdkdkd djdjdjd dsjsjdj djdjdjd djdjdj wwwwwww");
                    jSONObject.getJSONObject("content").put("typofeed", 0);
                } else {
                    jSONObject.getJSONObject("content").put("caption", "Eww w we w w w w w w w w Newsweek");
                    jSONObject.getJSONObject("content").put("typofeed", 13621);
                }
            } else {
                jSONObject.getJSONObject("content").put("caption", "");
                jSONObject.getJSONObject("content").put("typofeed", 0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m14592b(JSONObject jSONObject, boolean z11) {
        try {
            if (z11) {
                jSONObject.getJSONObject("content").put(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION, new JSONObject("{  \n         \"lon\":\"106.65560321066161\",\n         \"lat\":\"10.763839400769287\",\n         \"desc\":\"229 Lê Đại Hành, Phường 13, Quận 11, Hồ Chí Minh, Việt Nam \",\n         \"enableThumb\":1\n      }\n"));
            } else {
                jSONObject.getJSONObject("content").put(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION, "{}");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public static JSONObject m14593c() {
        try {
            return new JSONObject("{  \n         \"fid\":18809696,\n         \"hid\":0,\n         \"tags\":[  \n\n         ],\n         \"cts\":1369967461921,\n         \"cliid\":0,\n         \"iscmtable\":1,\n         \"islike\":0,\n         \"header\":{  \n            \"uid\":102266390,\n            \"utype\":1,\n            \"dpn\":\"Biển đảo của chúng ta\",\n            \"avt\":\"http:\\/\\/s160.avatar.talk.zdn.vn\\/2\\/4\\/9\\/1\\/2\\/160\\/86036bfe83ae8abe5a4d4999b5ff3f3f.jpg\",\n            \"uidto\":102266390\n         },\n         \"ftype\":11,\n         \"content\":{  \n            \"caption\":\"Ở Trường Sa, sự hy sinh, mất mát của cán bộ, chiến sĩ là khó tránh, bởi nguy hiểm về tự nhiên và mưu đồ bành trướng của kẻ thù. Nhiều chiến sĩ đã ngã xuống khi tuổi đời và tuổi quân còn rất trẻ, lấy máu mình, tô thắm màu cờ Tổ quốc…\",\n            \"album\":{  \n               \"albumid\":10570136,\n               \"thumb\":\"https:\\/\\/f1-org-zp.zdn.vn\\/upload\\/1\\/10570136\\/c1603fb4c\\/115881360244835854.jpg\",\n               \"origin\":\"https:\\/\\/f1-org-zp.zdn.vn\\/upload\\/1\\/10570136\\/c1603fb4c\\/115881360244835854.jpg\",\n               \"desc\":\"Khi Tổ Quốc Cần\"\n            }\n         },\n         \"footer\":{  \n            \"numcmt\":215,\n            \"numlike\":0,\n            \"hide_bottom_bar\":0,\n            \"show_box_comment\":0\n         },\n         \"max_line\":2,\n         \"isSubscribe\":false,\n         \"privacy\":0\n      }");
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static JSONObject m14594d() {
        try {
            return new JSONObject("{  \n   \"fid\":304409408,\n   \"hid\":0,\n   \"tags\":[  \n\n   ],\n   \"cts\":1402453885006,\n   \"cliid\":0,\n   \"iscmtable\":1,\n   \"islike\":0,\n   \"header\":{  \n      \"uid\":70737083,\n      \"utype\":0,\n      \"dpn\":\"Nam Đinh\",\n      \"avt\":\"http:\\/\\/s160.avatar.talk.zdn.vn\\/1\\/7\\/f\\/b\\/244\\/160\\/6045e4b63cc0e7d8335030a37529e048.jpg\",\n      \"uidto\":70737083,\n      \"app\":{  \n         \"appid\":4287694805695491793,\n         \"apptitle\":\"Rocket Dog\",\n         \"clktype\":1,\n         \"param\":\"\",\n         \"packagename\":\"\",\n         \"schema\":\"\",\n         \"wphoneid\":\"\",\n         \"app_referrer\":\"\"\n      }\n   },\n   \"ftype\":10,\n   \"content\":{  \n      \"caption\":\"\",\n      \"appInfo\":{  \n         \"desc\":\"Chơi game và thi đấu với bạn bè trên Zalo\",\n         \"origin\":\"https:\\/\\/f4-org-zp.zdn.vn\\/65d55ac30392eaccb383.jpg\",\n         \"thumb\":\"https:\\/\\/f4-org-zp.zdn.vn\\/65d55ac30392eaccb383.jpg\"\n      }\n   },\n   \"footer\":{  \n      \"numcmt\":0,\n      \"numlike\":0,\n      \"hide_bottom_bar\":0,\n      \"show_box_comment\":0\n   },\n   \"max_line\":2,\n   \"isSubscribe\":false,\n   \"privacy\":0\n}");
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static JSONObject m14595e() {
        try {
            return new JSONObject("{  \n         \"fid\":637723209,\n         \"hid\":0,\n         \"tags\":[  \n\n         ],\n         \"cts\":1416103443655,\n         \"cliid\":0,\n         \"iscmtable\":1,\n         \"islike\":0,\n         \"header\":{  \n            \"uid\":101665266,\n            \"utype\":5,\n            \"dpn\":\"Zing MP3 - Nghe nhạc đỉnh cao miễn phí\",\n            \"avt\":\"http:\\/\\/s160.avatar.talk.zdn.vn\\/c\\/b\\/a\\/a\\/13\\/160\\/b5f16e80771140c628a92278c2662f73.jpg\",\n            \"uidto\":101665266\n         },\n         \"ftype\":7,\n         \"content\":{  \n            \"caption\":\"Album The Best Of Hồ Ngọc Hà - Những Tình Khúc ra mắt trước thềm liveshow kỷ niệm 10 năm ca hát của Hồ Ngọc Hà được thực hiện vào ngày 20\\/11\\/2014 tại GEM Center (TP.Hồ Chí Minh).\",\n            \"typofeed\":0,\n            \"link_title\":\"Những Tình Khúc (The Best Of Hồ Ngọc Hà) - Hồ Ngọc Hà | Album 320 lossless\",\n            \"link_image\":\"https:\\/\\/w160.link.talk.zdn.vn\\/8c66b6f9a8bc41e218ad.jpg\",\n            \"link_image_original\":\"\",\n            \"link_href\":\"http:\\/\\/mp3.zing.vn\\/album\\/Nhung-Tinh-Khuc-The-Best-Of-Ho-Ngoc-Ha-Ho-Ngoc-Ha\\/ZWZB9EIZ.html\",\n            \"link_source\":\"mp3.zing.vn\"\n         },\n         \"footer\":{  \n            \"numcmt\":1,\n            \"numlike\":0,\n            \"hide_bottom_bar\":0,\n            \"show_box_comment\":0\n         },\n         \"max_line\":2,\n         \"isSubscribe\":false,\n         \"privacy\":0\n      }");
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public static JSONObject m14596f() {
        try {
            return new JSONObject("{  \n      \"fid\":9148346143,\n      \"hid\":0,\n      \"tags\":[  \n\n      ],\n      \"cts\":1556940985061,\n      \"cliid\":1556940982847,\n      \"iscmtable\":1,\n      \"islike\":0,\n      \"header\":{  \n         \"uid\":74220710,\n         \"utype\":0,\n         \"dpn\":\"Le Hoang Son\",\n         \"avt\":\"http:\\/\\/s160.avatar.talk.zdn.vn\\/b\\/8\\/2\\/3\\/33\\/160\\/f23b23ca189ea39697c913eafebe48ab.jpg\",\n         \"uidto\":74220710\n      },\n      \"ftype\":3,\n      \"content\":{  \n         \"caption\":\"Nsiis djdidi djdidjjd\",\n         \"typofeed\":13621,\n         \"photos\":[  \n            {  \n               \"photoid\":16672094512,\n               \"thumb\":\"https:\\/\\/f33-w640-zp.zdn.vn\\/713e76ccf26818364179.jpg\",\n               \"origin\":\"https:\\/\\/f33-org-zp.zdn.vn\\/713e76ccf26818364179.jpg\",\n               \"layout\":{  \n                  \"top\":0,\n                  \"right\":212.66666666666666,\n                  \"bottom\":320,\n                  \"left\":0,\n                  \"contentMode\":0,\n                  \"layoutId\":0\n               }\n            },\n            {  \n               \"photoid\":16672094576,\n               \"thumb\":\"https:\\/\\/f32-w240-zp.zdn.vn\\/acc3eb316f9585cbdc84.jpg\",\n               \"origin\":\"https:\\/\\/f32-org-zp.zdn.vn\\/acc3eb316f9585cbdc84.jpg\",\n               \"layout\":{  \n                  \"top\":0,\n                  \"right\":320,\n                  \"bottom\":105.33333333333333,\n                  \"left\":214.66666666666666,\n                  \"contentMode\":0,\n                  \"layoutId\":0\n               }\n            },\n            {  \n               \"photoid\":16672094605,\n               \"thumb\":\"https:\\/\\/f31-w240-zp.zdn.vn\\/185ea2ac2608cc569519.jpg\",\n               \"origin\":\"https:\\/\\/f31-org-zp.zdn.vn\\/185ea2ac2608cc569519.jpg\",\n               \"layout\":{  \n                  \"top\":107.33333333333333,\n                  \"right\":320,\n                  \"bottom\":212.66666666666666,\n                  \"left\":214.66666666666666,\n                  \"contentMode\":0,\n                  \"layoutId\":0\n               }\n            },\n            {  \n               \"photoid\":16672094649,\n               \"thumb\":\"https:\\/\\/f35-w240-zp.zdn.vn\\/dd2a53d8d77c3d22646d.jpg\",\n               \"origin\":\"https:\\/\\/f35-org-zp.zdn.vn\\/dd2a53d8d77c3d22646d.jpg\",\n               \"layout\":{  \n                  \"top\":214.66666666666666,\n                  \"right\":320,\n                  \"bottom\":320,\n                  \"left\":214.66666666666666,\n                  \"contentMode\":0,\n                  \"layoutId\":0\n               }\n            }\n         ],\n         \"photo_coordinates\":{  \n            \"height_unit_max\":6,\n            \"width_unit_max\":6,\n            \"coordinates\":[  \n               [  \n                  0,\n                  0,\n                  4,\n                  6\n               ],\n               [  \n                  4,\n                  0,\n                  6,\n                  2\n               ],\n               [  \n                  4,\n                  2,\n                  6,\n                  4\n               ],\n               [  \n                  4,\n                  4,\n                  6,\n                  6\n               ]\n            ],\n            \"original_size\":[  \n               {  \n                  \"photoId\":16672094512,\n                  \"width\":674,\n                  \"height\":1280\n               },\n               {  \n                  \"photoId\":16672094576,\n                  \"width\":960,\n                  \"height\":1280\n               },\n               {  \n                  \"photoId\":16672094605,\n                  \"width\":1280,\n                  \"height\":960\n               },\n               {  \n                  \"photoId\":16672094649,\n                  \"width\":640,\n                  \"height\":1280\n               }\n            ]\n         },\n         \"voice_url\":\"\"\n      },\n      \"footer\":{  \n         \"numcmt\":0,\n         \"numlike\":0,\n         \"hide_bottom_bar\":0,\n         \"show_box_comment\":0\n      },\n      \"max_line\":3,\n      \"isSubscribe\":true,\n      \"privacy\":2\n   }");
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public static JSONObject m14597g() {
        try {
            return new JSONObject("{  \n   \"fid\":614280937,\n   \"hid\":0,\n   \"tags\":[  \n\n   ],\n   \"cts\":1415332387456,\n   \"cliid\":0,\n   \"iscmtable\":1,\n   \"islike\":0,\n   \"header\":{  \n      \"uid\":70737083,\n      \"utype\":0,\n      \"dpn\":\"Nam Đinh\",\n      \"avt\":\"https:\\/\\/s160.avatar.talk.zdn.vn\\/1\\/7\\/f\\/b\\/244\\/160\\/6045e4b63cc0e7d8335030a37529e048.jpg\",\n      \"uidto\":70737083\n   },\n   \"ftype\":5,\n   \"content\":{  \n      \"caption\":\"ZZzzzz\",\n      \"location\":{  \n         \"lon\":\"106.65577396539086\",\n         \"lat\":\"10.764796481026735\",\n         \"desc\":\"184 Lê Đại Hành, Phường 15, Quận 11, Hồ Chí Minh, Việt Nam \",\n         \"enableThumb\":0\n      },\"typofeed\":13608,      \"page_id\":101665266,\n      \"page_type\":5,\n      \"page_avt\":\"http:\\/\\/s120.avatar.talk.zdn.vn\\/7\\/d\\/f\\/1\\/4\\/120\\/b5f16e80771140c628a92278c2662f73.jpg\",\n      \"page_dpn\":\"Zing Mp3\",\n      \"fans\":1110958\n   },\n   \"footer\":{  \n      \"numcmt\":0,\n      \"numlike\":0,\n      \"hide_bottom_bar\":0,\n      \"show_box_comment\":0\n   },\n   \"max_line\":3,\n   \"isSubscribe\":false,\n   \"privacy\":0\n}");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static JSONObject m14598h() {
        try {
            return new JSONObject("{  \n   \"fid\":9145095556,\n   \"hid\":0,\n   \"tags\":[  \n   ],\n   \"cts\":1556876382831,\n   \"cliid\":0,\n   \"iscmtable\":1,\n   \"islike\":0,\n   \"header\":{  \n      \"uid\":74220710,\n      \"utype\":0,\n      \"dpn\":\"Le Hoang Son\",\n      \"avt\":\"https:\\/\\/s160-ava-talk.zadn.vn\\/b\\/8\\/2\\/3\\/33\\/160\\/f23b23ca189ea39697c913eafebe48ab.jpg\",\n      \"uidto\":0\n   },\n   \"ftype\":2,\n   \"content\":{  \n      \"caption\":\"Hdjjdjđj jdjdkdk djdkdkdk djdkdkd djdjdjd dsjsjdj djdjdjd djdjdj wwwwwwwHdjjdjđj jdjdkdk djdkdkdk djdkdkd djdjdjd dsjsjdj djdjdjd djdjdj wwwwwwwHdjjdjđj jdjdkdk djdkdkdk djdkdkd djdjdjd dsjsjdj djdjdjd djdjdj wwwwwwwHdjjdjđj jdjdkdk djdkdkdk djdkdkd djdjdjd dsjsjdj djdjdjd djdjdj wwwwwww\",\n      \"location\":{  \n         \"lon\":\"106.65643649374036\",\n         \"lat\":\"10.764036622481571\",\n         \"desc\":\"182 Lê Đại Hành, Phường 15, Quận 11, Hồ Chí Minh, Việt Nam \",\n         \"enableThumb\":0\n      },\n      \"typofeed\":13621,\n      \"photo\":{  \n         \"photoid\":16665064367,\n         \"thumb\":\"http:\\/\\/f33-w640-zp.zdn.vn\\/8ebefd0692a278fc21b3.jpg\",\n         \"origin\":\"http:\\/\\/f33-org-zp.zdn.vn\\/8ebefd0692a278fc21b3.jpg\",\n         \"layout\":{  \n            \"top\":0,\n            \"right\":320,\n            \"bottom\":320,\n            \"left\":0,\n            \"contentMode\":0,\n            \"layoutId\":0\n         }\n      },\n      \"voice_url\":\"\",\n      \"photo_dimension\":{  \n         \"width\":640,\n         \"height\":1280\n      },\n      \"edit\":1\n   },\n   \"footer\":{  \n      \"numcmt\":0,\n      \"numlike\":0,\n      \"hide_bottom_bar\":0,\n      \"show_box_comment\":0\n   },\n   \"max_line\":3,\n   \"isSubscribe\":true,\n   \"privacy\":1,\n   \"mapEffect\":[  \n\n   ]\n}");
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: i */
    public static JSONObject m14599i() {
        try {
            return new JSONObject("{  \n   \"fid\":9159515081,\n   \"hid\":0,\n   \"tags\":[  \n\n   ],\n   \"cts\":1557136276090,\n   \"cliid\":1557136275422,\n   \"iscmtable\":1,\n   \"islike\":0,\n   \"header\":{  \n      \"uid\":74220710,\n      \"utype\":0,\n      \"dpn\":\"Le Hoang Son\",\n      \"avt\":\"http:\\/\\/s160.avatar.talk.zdn.vn\\/b\\/8\\/2\\/3\\/33\\/160\\/f23b23ca189ea39697c913eafebe48ab.jpg\",\n      \"uidto\":74220710\n   },\n   \"ftype\":6,\n   \"content\":{  \n      \"caption\":\"Jdjdjdj jsjsjs sjsksw ư ư ư ư w ư ư én ư e djd\",\n      \"location\":{  \n         \"lon\":\"106.6559447201201\",\n         \"lat\":\"10.763983688515504\",\n         \"desc\":\"283 Lê §¹i Hành, Phường 15, Quận 11, Hồ Chí Minh, Việt Nam \",\n         \"enableThumb\":0\n      },\n      \"typofeed\":13623,\n      \"thumb\":\"https:\\/\\/api.zaloapp.com\\/0\\/8\\/d\\/5\\/6\\/10030\\/feed\\/130\\/16487.png\",\n      \"origin\":\"https:\\/\\/api.zaloapp.com\\/0\\/8\\/d\\/5\\/6\\/10030\\/feed\\/130\\/16487.png\",\n      \"stickerId\":16487,\n      \"cateId\":10030\n   },\n   \"footer\":{  \n      \"numcmt\":0,\n      \"numlike\":0,\n      \"hide_bottom_bar\":0,\n      \"show_box_comment\":0\n   },\n   \"max_line\":3,\n   \"isSubscribe\":true,\n   \"privacy\":2\n}");
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public static JSONObject m14600j() {
        try {
            return new JSONObject("{  \n   \"fid\":9172382660,\n   \"hid\":0,\n   \"tags\":[  \n\n   ],\n   \"cts\":1557375284521,\n   \"cliid\":1557375283666,\n   \"iscmtable\":1,\n   \"islike\":0,\n   \"header\":{  \n      \"uid\":74220710,\n      \"utype\":0,\n      \"dpn\":\"Le Hoang Son\",\n      \"avt\":\"http:\\/\\/s160.avatar.talk.zdn.vn\\/b\\/8\\/2\\/3\\/33\\/160\\/f23b23ca189ea39697c913eafebe48ab.jpg\",\n      \"uidto\":74220710\n   },\n   \"ftype\":1,\n   \"content\":{  \n      \"caption\":\"Hdjjdjđj jdjdkdk djdkdkdk djdkdkd djdjdjd dsjsjdj djdjdjd djdjdj\",\n      \"location\":{  \n         \"lon\":\"106.65560321066161\",\n         \"lat\":\"10.763839400769287\",\n         \"desc\":\"229 Lê Đại Hành, Phường 13, Quận 11, Hồ Chí Minh, Việt Nam \",\n         \"enableThumb\":1\n      },\n      \"typofeed\":13600\n   },\n   \"footer\":{  \n      \"numcmt\":0,\n      \"numlike\":0,\n      \"hide_bottom_bar\":0,\n      \"show_box_comment\":0\n   },\n   \"max_line\":3,\n   \"isSubscribe\":true,\n   \"privacy\":2\n}");
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: k */
    public static JSONObject m14601k() {
        try {
            return new JSONObject("{  \n         \"fid\":77885269,\n         \"hid\":0,\n         \"tags\":[  \n\n         ],\n         \"cts\":1383189696937,\n         \"cliid\":0,\n         \"iscmtable\":1,\n         \"islike\":0,\n         \"header\":{  \n            \"uid\":107989708,\n            \"utype\":1,\n            \"dpn\":\"Trấn Thành\",\n            \"avt\":\"http:\\/\\/s160.avatar.talk.zdn.vn\\/6\\/9\\/9\\/6\\/18\\/160\\/73990ada19b9498346951d5b1966ff3c.jpg\",\n            \"uidto\":107989708\n         },\n         \"ftype\":12,\n         \"content\":{  \n            \"caption\":\"Cả nhà vào xem Dr Thành chia sẽ về công việc nhé !\",\n            \"typofeed\":0,\n            \"media_title\":\"Cả nhà vào xem Dr Thành chia sẽ về công việc nhé !\",\n            \"media_image\":\"https:\\/\\/w160.link.talk.zdn.vn\\/4a9a5da363e68ab8d3f7.jpg\",\n            \"media_image_original\":\"\",\n            \"media_href\":\"http:\\/\\/www.youtube.com\\/watch?v=nn5tDKFZcUw\",\n            \"media_type\":2\n         },\n         \"footer\":{  \n            \"numcmt\":182,\n            \"numlike\":0,\n            \"hide_bottom_bar\":0,\n            \"show_box_comment\":0\n         },\n         \"max_line\":2,\n         \"isSubscribe\":false,\n         \"privacy\":0\n      }");
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: l */
    public static JSONObject m14602l() {
        try {
            return new JSONObject("{  \n         \"fid\":117060510,\n         \"hid\":0,\n         \"tags\":[  \n\n         ],\n         \"cts\":1388512079016,\n         \"cliid\":0,\n         \"iscmtable\":1,\n         \"islike\":0,\n         \"header\":{  \n            \"uid\":103136357,\n            \"utype\":1,\n            \"dpn\":\"Angela Phương Trinh\",\n            \"avt\":\"http:\\/\\/s160.avatar.talk.zdn.vn\\/5\\/7\\/9\\/6\\/69\\/160\\/1fbaff7c113b81d11d8412edc9804fa0.jpg\",\n            \"uidto\":103136357\n         },\n         \"ftype\":4,\n         \"content\":{  \n            \"caption\":\"Happy New Year mọi người 💥💫❤️❤️❤️\",\n            \"typofeed\":0,\n            \"voice\":\"http:\\/\\/fvoice.talk.zdn.vn\\/upload\\/7\\/e\\/a\\/b\\/1274540255694485.amr\"\n         },\n         \"footer\":{  \n            \"numcmt\":1017,\n            \"numlike\":0,\n            \"hide_bottom_bar\":0,\n            \"show_box_comment\":0\n         },\n         \"max_line\":2,\n         \"isSubscribe\":false,\n         \"privacy\":0\n      }");
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: m */
    public static JSONObject m14603m(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject("{  \n   \"holder_type\":0,\n   \"holder_title\":\"\",\n   \"item\":{}\n}");
            jSONObject2.put("item", jSONObject);
            return jSONObject2;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: n */
    public static JSONObject m14604n(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject("{  \n   \"holder_type\":0,\n   \"holder_title\":\"\",\n   \"item\":{  \n      \"fid\":9163722109,\n      \"hid\":0,\n      \"tags\":[  \n\n      ],\n      \"cts\":1557213677133,\n      \"cliid\":0,\n      \"iscmtable\":1,\n      \"islike\":0,\n      \"header\":{  \n         \"uid\":74220710,\n         \"utype\":0,\n         \"dpn\":\"Le Hoang Son\",\n         \"avt\":\"http:\\/\\/s160.avatar.talk.zdn.vn\\/b\\/8\\/2\\/3\\/33\\/160\\/f23b23ca189ea39697c913eafebe48ab.jpg\",\n         \"uidto\":74220710\n      },\n      \"ftype\":9,\n      \"content\":{  \n         \"caption\":\"Hjgggh\",\n         \"fitem\":{}\n      },\n      \"footer\":{  \n         \"numcmt\":0,\n         \"numlike\":0,\n         \"hide_bottom_bar\":0,\n         \"show_box_comment\":0\n      },\n      \"max_line\":3,\n      \"isSubscribe\":true,\n      \"privacy\":1\n   }\n}");
            jSONObject2.getJSONObject("item").getJSONObject("content").put("fitem", jSONObject);
            return jSONObject2;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: o */
    public static JSONObject m14605o(JSONObject jSONObject) {
        int i11;
        try {
            JSONObject jSONObject2 = new JSONObject("{  \n   \"holder_type\": 0,\n   \"holder_title\":\"\",\n   \"item\":{}\n}");
            int optInt = jSONObject.optInt("ftype");
            if (optInt != 100) {
                if (optInt != 108) {
                    i11 = 0;
                } else {
                    i11 = 16;
                }
            } else {
                i11 = 3;
            }
            jSONObject2.put("item", jSONObject);
            jSONObject2.put("holder_type", i11);
            return jSONObject2;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: p */
    public static C3000l0 m14606p() {
        try {
            f12233e++;
            return AbstractC20826v0.m108750B0(m14605o(m14599i()));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: q */
    public static C3000l0 m14607q() {
        try {
            return AbstractC20826v0.m108750B0(m14605o(m14611u(m14594d(), true, true, false)));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: r */
    public static List m14608r() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.addAll(m14609s(m14600j()));
            arrayList.addAll(m14609s(m14594d()));
            arrayList.addAll(m14609s(m14599i()));
            arrayList.addAll(m14609s(m14598h()));
            arrayList.addAll(m14609s(m14596f()));
            arrayList.addAll(m14609s(m14595e()));
            arrayList.addAll(m14609s(m14601k()));
            arrayList.addAll(m14609s(m14602l()));
            arrayList.addAll(m14609s(m14593c()));
            arrayList.addAll(m14609s(m14597g()));
            arrayList.addAll(m14610t(m14600j()));
            arrayList.addAll(m14610t(m14598h()));
            arrayList.addAll(m14610t(m14596f()));
            arrayList.addAll(m14610t(m14599i()));
            arrayList.addAll(m14610t(m14595e()));
            arrayList.addAll(m14610t(m14601k()));
            arrayList.addAll(m14610t(m14602l()));
            arrayList.addAll(m14610t(m14593c()));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return arrayList;
    }

    /* renamed from: s */
    public static List m14609s(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC20826v0.m108750B0(m14603m(m14611u(jSONObject, true, true, false))));
        return arrayList;
    }

    /* renamed from: t */
    public static List m14610t(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC20826v0.m108750B0(m14604n(m14611u(jSONObject, false, false, false))));
        arrayList.add(AbstractC20826v0.m108750B0(m14604n(m14611u(jSONObject, false, true, false))));
        arrayList.add(AbstractC20826v0.m108750B0(m14604n(m14611u(jSONObject, true, true, false))));
        arrayList.add(AbstractC20826v0.m108750B0(m14604n(m14611u(jSONObject, true, false, false))));
        arrayList.add(AbstractC20826v0.m108750B0(m14604n(m14611u(jSONObject, false, false, true))));
        arrayList.add(AbstractC20826v0.m108750B0(m14604n(m14611u(jSONObject, false, true, true))));
        JSONObject m14604n = m14604n(m14611u(jSONObject, true, true, false));
        if (m14604n != null) {
            arrayList.add(AbstractC20826v0.m108750B0(m14612v(m14604n, true, true, false)));
            arrayList.add(AbstractC20826v0.m108750B0(m14612v(m14604n, true, true, true)));
            arrayList.add(AbstractC20826v0.m108750B0(m14612v(m14604n, true, false, true)));
        }
        return arrayList;
    }

    /* renamed from: u */
    public static JSONObject m14611u(JSONObject jSONObject, boolean z11, boolean z12, boolean z13) {
        try {
            m14591a(jSONObject, z11, z13);
            m14592b(jSONObject, z12);
            return jSONObject;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: v */
    public static JSONObject m14612v(JSONObject jSONObject, boolean z11, boolean z12, boolean z13) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("item");
            m14591a(jSONObject2, z11, z13);
            m14592b(jSONObject2, z12);
            jSONObject.put("item", jSONObject2);
            return jSONObject;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }
}
