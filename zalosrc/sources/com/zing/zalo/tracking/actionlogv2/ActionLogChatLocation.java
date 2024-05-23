package com.zing.zalo.tracking.actionlogv2;

import ag0.C0815e1;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import b40.C2526d;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import dj.C17945a0;
import dj.C17969i0;
import dj.C18002t0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ln0.AbstractC22543l;
import org.json.JSONObject;
import p133ek.C18460c;
import p227i3.C20215s;
import p361nb.C23648e;
import p461qu.AbstractC25495a;
import p716zh.C31986k3;
import tj.C26712d;
import tj.C26713e;

/* loaded from: classes5.dex */
public final class ActionLogChatLocation {

    /* renamed from: a */
    public static final ActionLogChatLocation f55164a = new ActionLogChatLocation();

    /* renamed from: b */
    private static final Set f55165b = new LinkedHashSet();

    /* renamed from: c */
    private static final Set f55166c = new LinkedHashSet();

    /* renamed from: d */
    private static final Set f55167d = new LinkedHashSet();

    /* loaded from: classes5.dex */
    public static final class FooterLogData implements Parcelable {
        public static final Parcelable.Creator<FooterLogData> CREATOR = new C10922a();

        /* renamed from: p */
        private final MessageId f55168p;

        /* renamed from: q */
        private final String f55169q;

        /* renamed from: com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation$FooterLogData$a */
        /* loaded from: classes5.dex */
        public static final class C10922a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FooterLogData createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                return new FooterLogData((MessageId) parcel.readParcelable(FooterLogData.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FooterLogData[] newArray(int i11) {
                return new FooterLogData[i11];
            }
        }

        public FooterLogData(MessageId messageId, String str) {
            AbstractC19074t.m100208f(messageId, "messageId");
            AbstractC19074t.m100208f(str, "kwd");
            this.f55168p = messageId;
            this.f55169q = str;
        }

        /* renamed from: a */
        public final String m56654a() {
            return this.f55169q;
        }

        /* renamed from: b */
        public final MessageId m56655b() {
            return this.f55168p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            parcel.writeParcelable(this.f55168p, i11);
            parcel.writeString(this.f55169q);
        }
    }

    private ActionLogChatLocation() {
    }

    /* renamed from: f */
    private final void m56645f(List list, String str, C18460c c18460c, int i11, JSONObject jSONObject) {
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            if (it.hasNext()) {
                if (AbstractC19074t.m100204b(((C18460c) it.next()).f93020a, str)) {
                    break;
                } else {
                    i12++;
                }
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 >= 0) {
            jSONObject.put("locationID", str);
            jSONObject.put("order", i12 + 1 + i11);
            C18460c c18460c2 = (C18460c) list.get(i12);
            float[] fArr = new float[1];
            Location.distanceBetween(c18460c2.f93026g, c18460c2.f93025f, c18460c.f93026g, c18460c.f93025f, fArr);
            jSONObject.put("distance", Float.valueOf(fArr[0]));
        }
    }

    /* renamed from: g */
    private final String m56646g(String str) {
        if (str != null && str.length() != 0) {
            return C2526d.f10270a.m12733y(str);
        }
        return "0";
    }

    /* renamed from: a */
    public final void m56647a(String str, int i11, List list, int i12, String str2, C18460c c18460c, boolean z11) {
        int m116584g;
        AbstractC19074t.m100208f(str, "chatType");
        AbstractC19074t.m100208f(list, "nearbyLocations");
        if (c18460c == null) {
            return;
        }
        try {
            int size = list.size() + (z11 ? 1 : 0);
            m116584g = AbstractC22543l.m116584g(i12 + 1 + (z11 ? 1 : 0), size);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C20215s.f99966b, i11);
            jSONObject.put("resultsdelivered", size);
            jSONObject.put("resultsseen", m116584g);
            if (i11 == 3 && str2 != null && str2.length() != 0) {
                f55164a.m56645f(list, str2, c18460c, z11 ? 1 : 0, jSONObject);
            }
            C0815e1.m2075D().m2100V(new C23648e(11, "csc", 0, "location_close_page", str, jSONObject.toString()), false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: b */
    public final void m56648b(C26712d c26712d, FooterLogData footerLogData) {
        C23648e c23648e;
        AbstractC19074t.m100208f(c26712d, "footerData");
        AbstractC19074t.m100208f(footerLogData, "logData");
        try {
            if (!AbstractC19074t.m100204b(c26712d.m137334b(), "action.open.location") || footerLogData.m56654a().length() == 0) {
                return;
            }
            String messageId = footerLogData.m56655b().toString();
            Set set = f55166c;
            if (set.contains(messageId)) {
                return;
            }
            set.add(messageId);
            String m41048l = footerLogData.m56655b().m41048l();
            String m56652h = m56652h(m41048l);
            if (!C31986k3.f147083a.m154105P1(m41048l)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("kwd", footerLogData.m56654a());
                c23648e = new C23648e(11, "csc", 0, "location_footer_click", m56652h, jSONObject.toString());
            } else {
                c23648e = new C23648e(11, "csc", 0, "location_footer_click", m56652h);
            }
            C0815e1.m2075D().m2100V(c23648e, false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: c */
    public final void m56649c(C26712d c26712d, FooterLogData footerLogData) {
        C23648e c23648e;
        AbstractC19074t.m100208f(c26712d, "footerData");
        AbstractC19074t.m100208f(footerLogData, "logData");
        try {
            if (!AbstractC19074t.m100204b(c26712d.m137334b(), "action.open.location") || footerLogData.m56654a().length() == 0) {
                return;
            }
            String messageId = footerLogData.m56655b().toString();
            Set set = f55165b;
            if (set.contains(messageId)) {
                return;
            }
            set.add(messageId);
            String m41048l = footerLogData.m56655b().m41048l();
            String m56652h = m56652h(m41048l);
            if (!C31986k3.f147083a.m154105P1(m41048l)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("kwd", footerLogData.m56654a());
                c23648e = new C23648e(11, "csc", 1, "location_footer_view", m56652h, jSONObject.toString());
            } else {
                c23648e = new C23648e(11, "csc", 1, "location_footer_view", m56652h);
            }
            C0815e1.m2075D().m2100V(c23648e, false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: d */
    public final void m56650d(C17945a0 c17945a0) {
        int i11;
        C18002t0 c18002t0;
        if (c17945a0 == null) {
            return;
        }
        try {
            if (c17945a0.m94941L6()) {
                i11 = 1;
            } else {
                i11 = -1;
                if (c17945a0.m94949M6()) {
                    C17969i0 m94929K2 = c17945a0.m94929K2();
                    if (m94929K2 instanceof C18002t0) {
                        c18002t0 = (C18002t0) m94929K2;
                    } else {
                        c18002t0 = null;
                    }
                    if (c18002t0 != null) {
                        i11 = c18002t0.f91184E ? 0 : 2;
                    }
                }
            }
            if (i11 < 0) {
                return;
            }
            String m56646g = m56646g(c17945a0.m95029V3().m41048l());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("user", c17945a0.m95032V6() ? 1 : 0);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, i11);
            C0815e1.m2075D().m2100V(new C23648e(11, "csc", 0, "location_open_msg", m56646g, jSONObject.toString()), false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: e */
    public final void m56651e(String str, int i11, boolean z11, FooterLogData footerLogData) {
        MessageId m56655b;
        String messageId;
        AbstractC19074t.m100208f(str, "chatType");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("src", i11);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, z11 ? 1 : 0);
            if (i11 == 2) {
                if (footerLogData != null && (m56655b = footerLogData.m56655b()) != null && (messageId = m56655b.toString()) != null) {
                    Set set = f55167d;
                    if (set.contains(messageId)) {
                        return;
                    }
                    set.add(messageId);
                    if (!C31986k3.f147083a.m154105P1(footerLogData.m56655b().m41048l())) {
                        jSONObject.put("kwd", footerLogData.m56654a());
                    }
                }
                return;
            }
            C0815e1.m2075D().m2100V(new C23648e(11, "csc", 0, "location_share", str, jSONObject.toString()), false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: h */
    public final String m56652h(String str) {
        if (str != null && str.length() != 0) {
            if (AbstractC25495a.m132079d(str)) {
                return "2";
            }
            return "1";
        }
        return "0";
    }

    /* renamed from: i */
    public final FooterLogData m56653i(C17945a0 c17945a0) {
        String m137360e;
        if (c17945a0 == null) {
            return null;
        }
        try {
            MessageId m95029V3 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            C26713e m95071Z3 = c17945a0.m95071Z3();
            if (m95071Z3 != null && (m137360e = m95071Z3.m137360e()) != null) {
                return new FooterLogData(m95029V3, m137360e);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
