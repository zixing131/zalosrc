package p334lz;

import fn0.AbstractC19074t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONObject;
import pm0.C24848g0;
import qm0.AbstractC25379x0;

/* renamed from: lz.b */
/* loaded from: classes4.dex */
public abstract class AbstractC22690b {

    /* renamed from: a */
    private static final HashSet f111178a;

    static {
        HashSet m131552f;
        m131552f = AbstractC25379x0.m131552f("ZInstantDiscovery", "abuse_config", "actionFooterMsg", "ads", "android", "camera_zalo", "chat", "comm4work", "default_reaction", "delete_message_unfollow_vip", "domain_config", "emoticonEffect", "emoticonEffectConfig", "expiredDuration", "featurehtml", "feed", "file", "fixbugcallios11", "gamecenter", "globalSearchSetting", "group", "inapp_browser_config", "inline_promote_config", "ios", "ipPublicConfig", "jumplink_domain_901", "latest_version_configs", "lbs", "list_default_avatar", "list_default_group_avatar", "list_unfollow_vip", "liveEmojiInfo", "load_config", "mediaBoxSetting", "mediastore", "mini_program", "mlkit_qr_scanner", "my_cloud", "network", "notification_menu", "oaFollowSetting", "page", "parse_message_detail", "photoSuggestSetting", "qrcode", "reactionMsgInfo", "recommendedLink", "remind_config", "replace_tab_character", "replySticker", "searchFunctions", "seasonalEffect", "seasonalFeedBG", "seasonalSticker", "secrete_msg", "sendToMeInfo", "social", "ss_group", "sticker_popup", "sticker_store", "story", "support_info", "theme_config", "timeIntervalRetryApi", "timeOnApp", "uploadConfig", "username", "video", "welcomeMember", "zaloAnalytics", "zaloTracking", "zinstant_chat_attachments");
        f111178a = m131552f;
    }

    /* renamed from: a */
    public static final JSONObject m117358a(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonInput");
        JSONObject jSONObject2 = new JSONObject();
        m117359b(jSONObject, jSONObject2);
        return jSONObject2;
    }

    /* renamed from: b */
    private static final void m117359b(JSONObject jSONObject, JSONObject jSONObject2) {
        int m127172a0;
        Iterator<String> keys = jSONObject.keys();
        AbstractC19074t.m100207e(keys, "curJson.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            AbstractC19074t.m100207e(next, "key");
            m127172a0 = AbstractC24342w.m127172a0(next, '@', 0, false, 6, null);
            if (m127172a0 > 0) {
                String substring = next.substring(0, m127172a0);
                AbstractC19074t.m100207e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                if (!jSONObject2.has(substring)) {
                    jSONObject2.put(substring, new JSONObject());
                }
                String substring2 = next.substring(m127172a0 + 1, next.length());
                AbstractC19074t.m100207e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                Object obj = jSONObject2.get(substring);
                if (obj != null) {
                    JSONObject jSONObject3 = (JSONObject) obj;
                    if (jSONObject.get(next) instanceof JSONObject) {
                        if (!jSONObject3.has(substring2)) {
                            jSONObject3.put(substring2, new JSONObject());
                        }
                        Object obj2 = jSONObject.get(next);
                        if (obj2 != null) {
                            JSONObject jSONObject4 = (JSONObject) obj2;
                            Object obj3 = jSONObject3.get(substring2);
                            if (obj3 != null) {
                                m117359b(jSONObject4, (JSONObject) obj3);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                    } else {
                        jSONObject3.put(substring2, jSONObject.get(next));
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else if (jSONObject.get(next) instanceof JSONObject) {
                if (!jSONObject2.has(next)) {
                    jSONObject2.put(next, new JSONObject());
                }
                Object obj4 = jSONObject.get(next);
                if (obj4 != null) {
                    JSONObject jSONObject5 = (JSONObject) obj4;
                    Object obj5 = jSONObject2.get(next);
                    if (obj5 != null) {
                        m117359b(jSONObject5, (JSONObject) obj5);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                jSONObject2.put(next, jSONObject.get(next));
            }
        }
    }

    /* renamed from: c */
    public static final void m117360c(Map map, Object obj, String str) {
        AbstractC19074t.m100208f(map, "flattenPairs");
        AbstractC19074t.m100208f(str, "preKey");
        if (!(obj instanceof JSONObject)) {
            map.put(str, obj);
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> keys = jSONObject.keys();
        AbstractC19074t.m100207e(keys, "curValue.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            m117360c(map, jSONObject.get(next), str + '@' + ((Object) next));
        }
    }

    /* renamed from: d */
    public static final boolean m117361d(List list) {
        boolean m127120J;
        AbstractC19074t.m100208f(list, "listKeys");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m127120J = AbstractC24341v.m127120J(str, "features@", false, 2, null);
            if (m127120J || f111178a.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final JSONObject m117362e(JSONObject jSONObject) {
        int m127163V;
        String str;
        List m127131A0;
        C24848g0 c24848g0;
        AbstractC19074t.m100208f(jSONObject, "input");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        AbstractC19074t.m100207e(keys, "input.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                AbstractC19074t.m100207e(next, "orgKey");
                m127163V = AbstractC24342w.m127163V(next);
                while (true) {
                    if (-1 < m127163V) {
                        if (next.charAt(m127163V) == '.') {
                            m127163V--;
                        } else {
                            str = next.substring(0, m127163V + 1);
                            AbstractC19074t.m100207e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                            break;
                        }
                    } else {
                        str = "";
                        break;
                    }
                }
                m127131A0 = AbstractC24342w.m127131A0(str, new char[]{'.'}, false, 0, 6, null);
                Iterator it = m127131A0.iterator();
                JSONObject jSONObject3 = jSONObject2;
                Object obj = null;
                while (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        String str2 = (String) obj;
                        JSONObject optJSONObject = jSONObject3.optJSONObject(str2);
                        if (optJSONObject == null) {
                            optJSONObject = jSONObject3;
                            c24848g0 = null;
                        } else {
                            c24848g0 = C24848g0.f119245a;
                        }
                        if (c24848g0 == null) {
                            jSONObject3 = new JSONObject();
                            optJSONObject.put(str2, jSONObject3);
                        } else {
                            jSONObject3 = optJSONObject;
                        }
                    }
                }
                String str3 = (String) obj;
                if (str3 != null) {
                    if (opt instanceof JSONObject) {
                        opt = m117362e((JSONObject) opt);
                    }
                    jSONObject3.put(str3, opt);
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: f */
    public static final JSONObject m117363f(JSONObject jSONObject, String str, Object obj) {
        int m127163V;
        int i11;
        String str2;
        List m127131A0;
        JSONObject jSONObject2;
        AbstractC19074t.m100208f(jSONObject, "originalJS");
        AbstractC19074t.m100208f(str, "keyPath");
        AbstractC19074t.m100208f(obj, "customValue");
        m127163V = AbstractC24342w.m127163V(str);
        while (true) {
            i11 = 0;
            if (-1 < m127163V) {
                if (str.charAt(m127163V) == '.') {
                    m127163V--;
                } else {
                    str2 = str.substring(0, m127163V + 1);
                    AbstractC19074t.m100207e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                    break;
                }
            } else {
                str2 = "";
                break;
            }
        }
        m127131A0 = AbstractC24342w.m127131A0(str2, new char[]{'.'}, false, 0, 6, null);
        int size = m127131A0.size();
        if (str.length() == 0) {
            return (JSONObject) obj;
        }
        int i12 = size - 1;
        JSONObject jSONObject3 = jSONObject;
        if (i12 > 0) {
            while (true) {
                int i13 = i11 + 1;
                String str3 = (String) m127131A0.get(i11);
                Object opt = jSONObject3.opt(str3);
                if (opt instanceof JSONObject) {
                    jSONObject2 = (JSONObject) opt;
                } else {
                    jSONObject2 = new JSONObject();
                    jSONObject3.put(str3, jSONObject2);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
                jSONObject3 = jSONObject2;
                if (i13 >= i12) {
                    break;
                }
                i11 = i13;
            }
        }
        jSONObject3.put((String) m127131A0.get(i12), obj);
        return jSONObject;
    }
}
