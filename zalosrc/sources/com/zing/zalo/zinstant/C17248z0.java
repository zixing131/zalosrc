package com.zing.zalo.zinstant;

import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import on0.AbstractC24341v;
import org.json.JSONObject;
import pj0.InterfaceC24785k;
import pm0.C24848g0;
import vg.AbstractC28207v1;

/* renamed from: com.zing.zalo.zinstant.z0 */
/* loaded from: classes7.dex */
public final class C17248z0 implements AbstractC28207v1.h0 {

    /* renamed from: a */
    private final String f87929a;

    /* renamed from: b */
    private final InterfaceC24785k f87930b;

    public C17248z0(String str, InterfaceC24785k interfaceC24785k) {
        AbstractC19074t.m100208f(interfaceC24785k, "callback");
        this.f87929a = str;
        this.f87930b = interfaceC24785k;
        if (!m92076k(str)) {
            interfaceC24785k.mo128801a(m92069d(this, "", null, 2, null));
        }
    }

    /* renamed from: b */
    private final String m92067b(int i11, String str) {
        return "{\"error_code\":" + i11 + ",\"error_message\":\"" + m92070e(str) + "\"}";
    }

    /* renamed from: c */
    private final String m92068c(String str, JSONObject jSONObject) {
        if (str != null && jSONObject != null) {
            return m92067b(-999, "One of dataStr and dataJson must be null");
        }
        if (str == null && jSONObject == null) {
            return m92067b(-999, "dataStr and dataJson is null.");
        }
        if (str != null) {
            return "{\"error_code\":0,\"error_message\":\"\",\"data\": \"" + m92070e(str) + "\"}";
        }
        if (jSONObject == null) {
            return "{\"error_code\":0,\"error_message\":\"\",\"data\": ";
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return "{\"error_code\":0,\"error_message\":\"\",\"data\": \"" + m92070e(jSONObject2) + "\"}";
    }

    /* renamed from: d */
    static /* synthetic */ String m92069d(C17248z0 c17248z0, String str, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            jSONObject = null;
        }
        return c17248z0.m92068c(str, jSONObject);
    }

    /* renamed from: e */
    private final String m92070e(String str) {
        String m127114D;
        String m127114D2;
        String m127114D3;
        String m127114D4;
        String m127114D5;
        String m127114D6;
        String m127114D7;
        m127114D = AbstractC24341v.m127114D(str, "\\", "\\\\", false, 4, null);
        m127114D2 = AbstractC24341v.m127114D(m127114D, "\"", "\\\"", false, 4, null);
        m127114D3 = AbstractC24341v.m127114D(m127114D2, "\b", "\\b", false, 4, null);
        m127114D4 = AbstractC24341v.m127114D(m127114D3, "\f", "\\f", false, 4, null);
        m127114D5 = AbstractC24341v.m127114D(m127114D4, "\n", "\\n", false, 4, null);
        m127114D6 = AbstractC24341v.m127114D(m127114D5, "\r", "\\r", false, 4, null);
        m127114D7 = AbstractC24341v.m127114D(m127114D6, "\t", "\\t", false, 4, null);
        return m127114D7;
    }

    /* renamed from: f */
    private final String m92071f(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("error_code", -1);
        String optString = jSONObject.optString("error_message", "");
        if (optInt != -110) {
            if (optInt != 0) {
                if (optInt != -107) {
                    if (optInt != -106) {
                        AbstractC19074t.m100205c(optString);
                        return m92067b(-999, optString);
                    }
                    AbstractC19074t.m100205c(optString);
                    return m92067b(-1, optString);
                }
                AbstractC19074t.m100205c(optString);
                return m92067b(-2, optString);
            }
            return m92069d(this, "", null, 2, null);
        }
        AbstractC19074t.m100205c(optString);
        return m92067b(-3, optString);
    }

    /* renamed from: g */
    private final String m92072g(JSONObject jSONObject) {
        if (jSONObject.optInt("error_code", -1) == 0) {
            return m92069d(this, jSONObject.optString("data", ""), null, 2, null);
        }
        String optString = jSONObject.optString("error_message", "Cancelled");
        AbstractC19074t.m100207e(optString, "optString(...)");
        return m92067b(-1, optString);
    }

    /* renamed from: h */
    private final String m92073h(JSONObject jSONObject) {
        try {
            int optInt = jSONObject.optInt("error_code", 0);
            if (optInt != -101) {
                if (optInt != 0) {
                    String optString = jSONObject.optString("error_message", "");
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    return m92067b(-999, optString);
                }
                JSONObject jSONObject2 = new JSONObject(jSONObject.getJSONObject("data").getString("result_content"));
                if (jSONObject2.has(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR) && jSONObject2.getInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR) != 0) {
                    AbstractC20110a.f98889a.mo104559s("Pick media failed. errorCode: %s, message: %s", Integer.valueOf(jSONObject2.getInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR)), jSONObject2.optString("msg", ""));
                    int i11 = jSONObject2.getInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                    String optString2 = jSONObject2.optString("msg", "");
                    AbstractC19074t.m100207e(optString2, "optString(...)");
                    return m92067b(i11, optString2);
                }
                JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("width", jSONObject3.optInt("width", 0));
                jSONObject4.put("height", jSONObject3.optInt("height", 0));
                jSONObject4.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, jSONObject3.getString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL));
                C24848g0 c24848g0 = C24848g0.f119245a;
                return m92069d(this, null, jSONObject4, 1, null);
            }
            String optString3 = jSONObject.optString("error_message", "");
            AbstractC19074t.m100207e(optString3, "optString(...)");
            return m92067b(-1, optString3);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104560t(e11);
            return m92067b(-999, String.valueOf(e11.getMessage()));
        }
    }

    /* renamed from: i */
    private final String m92074i(JSONObject jSONObject) {
        if (jSONObject.optInt("error_code", -1) == 0) {
            return m92069d(this, "", null, 2, null);
        }
        return m92067b(-1, "User cancel post feed.");
    }

    /* renamed from: j */
    private final String m92075j(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("error_code", -1);
        String optString = jSONObject.optString("error_message", "");
        if (optInt != -102) {
            if (optInt != -101) {
                if (optInt != -1) {
                    if (optInt != 0) {
                        if (optInt != 1) {
                            if (optInt != 3) {
                                if (optInt != 5) {
                                    switch (optInt) {
                                        case IMediaPlayer.MEDIA_ERROR_TIMED_OUT /* -110 */:
                                        case -108:
                                            break;
                                        case -109:
                                            AbstractC19074t.m100205c(optString);
                                            return m92067b(-10, optString);
                                        case -107:
                                            break;
                                        case -106:
                                            break;
                                        default:
                                            switch (optInt) {
                                                case 10:
                                                case 13:
                                                    break;
                                                case 11:
                                                    break;
                                                case 12:
                                                    AbstractC19074t.m100205c(optString);
                                                    return m92067b(-1, optString);
                                                case 14:
                                                    AbstractC19074t.m100205c(optString);
                                                    return m92067b(-4, optString);
                                                default:
                                                    AbstractC19074t.m100205c(optString);
                                                    return m92067b(-999, optString);
                                            }
                                    }
                                    AbstractC19074t.m100205c(optString);
                                    return m92067b(-2, optString);
                                }
                            } else {
                                AbstractC19074t.m100205c(optString);
                                return m92067b(-7, optString);
                            }
                        }
                        AbstractC19074t.m100205c(optString);
                        return m92067b(-3, optString);
                    }
                    return m92069d(this, "", null, 2, null);
                }
                AbstractC19074t.m100205c(optString);
                return m92067b(-1, optString);
            }
            AbstractC19074t.m100205c(optString);
            return m92067b(-9, optString);
        }
        AbstractC19074t.m100205c(optString);
        return m92067b(-5, optString);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0040 A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m92076k(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -987623510:
                    if (str.equals("action.open.postfeed")) {
                        return true;
                    }
                    break;
                case -292076913:
                    if (!str.equals("action.pick.media")) {
                    }
                    break;
                case -245680247:
                    if (!str.equals("action.input.text")) {
                    }
                    break;
                case -62560970:
                    if (!str.equals("action.prompt.authentication.check_state")) {
                    }
                    break;
                case 290719370:
                    if (str.equals("action.prompt.authentication")) {
                    }
                    break;
                case 1614341938:
                    if (!str.equals("action.window.close")) {
                    }
                    break;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // vg.AbstractC28207v1.h0, p483rh.InterfaceC25792a.c
    /* renamed from: a */
    public void mo39930a(String str, String str2) {
        if (!m92076k(this.f87929a)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String str3 = this.f87929a;
            if (str3 != null) {
                switch (str3.hashCode()) {
                    case -987623510:
                        if (!str3.equals("action.open.postfeed")) {
                            break;
                        } else {
                            InterfaceC24785k interfaceC24785k = this.f87930b;
                            if (str == null) {
                                str = "{}";
                            }
                            interfaceC24785k.mo128801a(m92074i(new JSONObject(str)));
                            break;
                        }
                    case -292076913:
                        if (!str3.equals("action.pick.media")) {
                            break;
                        } else {
                            InterfaceC24785k interfaceC24785k2 = this.f87930b;
                            if (str == null) {
                                str = "{}";
                            }
                            interfaceC24785k2.mo128801a(m92073h(new JSONObject(str)));
                            break;
                        }
                    case -245680247:
                        if (!str3.equals("action.input.text")) {
                            break;
                        } else {
                            InterfaceC24785k interfaceC24785k3 = this.f87930b;
                            if (str == null) {
                                str = "{}";
                            }
                            interfaceC24785k3.mo128801a(m92072g(new JSONObject(str)));
                            break;
                        }
                    case -62560970:
                        if (!str3.equals("action.prompt.authentication.check_state")) {
                            break;
                        } else {
                            InterfaceC24785k interfaceC24785k4 = this.f87930b;
                            if (str == null) {
                                str = "{}";
                            }
                            interfaceC24785k4.mo128801a(m92071f(new JSONObject(str)));
                            break;
                        }
                    case 290719370:
                        if (!str3.equals("action.prompt.authentication")) {
                            break;
                        } else {
                            InterfaceC24785k interfaceC24785k5 = this.f87930b;
                            if (str == null) {
                                str = "{}";
                            }
                            interfaceC24785k5.mo128801a(m92075j(new JSONObject(str)));
                            break;
                        }
                    case 1614341938:
                        if (!str3.equals("action.window.close")) {
                            break;
                        } else {
                            this.f87930b.mo128801a(m92069d(this, "", null, 2, null));
                            break;
                        }
                }
            }
            this.f87930b.mo128801a(jSONObject.toString());
        } catch (Throwable unused) {
            this.f87930b.mo128801a(jSONObject.toString());
        }
    }
}
