package com.zing.zalo.p077ui.mycloud.model;

import ag0.AbstractC0837p0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17978l0;
import dj.C18013y0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23262x6;
import me0.C23212s8;
import mm0.AbstractC23350e;
import mw.AbstractC23463h;
import p019aj.C0876j;
import p348mi.AbstractC23306f;
import p716zh.C31884d6;
import p716zh.C31944h6;
import p716zh.C32098s;
import vc0.InterfaceC27965d;

/* loaded from: classes6.dex */
public final class MyCloudMessageItem extends MyCloudItem implements InterfaceC27965d {

    /* renamed from: t */
    private C17945a0 f65865t;

    /* renamed from: u */
    private SpannableString f65866u;

    /* renamed from: v */
    private SpannableString f65867v;

    /* renamed from: w */
    private SpannableString f65868w;

    /* renamed from: x */
    private SpannableString f65869x;

    /* renamed from: y */
    private SpannableString f65870y;

    /* renamed from: z */
    private CharSequence f65871z;
    public static final C12635b Companion = new C12635b(null);
    public static final Parcelable.Creator<MyCloudMessageItem> CREATOR = new C12634a();

    /* renamed from: com.zing.zalo.ui.mycloud.model.MyCloudMessageItem$a */
    /* loaded from: classes6.dex */
    public static final class C12634a implements Parcelable.Creator {
        C12634a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MyCloudMessageItem createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new MyCloudMessageItem(parcel);
            }
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MyCloudMessageItem[] newArray(int i11) {
            return new MyCloudMessageItem[i11];
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.model.MyCloudMessageItem$b */
    /* loaded from: classes6.dex */
    public static final class C12635b {
        private C12635b() {
        }

        public /* synthetic */ C12635b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCloudMessageItem(C17945a0 c17945a0) {
        super(0);
        AbstractC19074t.m100208f(c17945a0, "tempChatContent");
        this.f65865t = c17945a0;
    }

    /* renamed from: l */
    public static final void m71030l(MessageId messageId, MyCloudMessageItem myCloudMessageItem, long j11) {
        AbstractC19074t.m100208f(myCloudMessageItem, "this$0");
        C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(messageId);
        if (m2635r != null) {
            myCloudMessageItem.f65865t = m2635r;
            m2635r.m95146gb(j11);
        }
    }

    /* renamed from: x */
    private final void m71031x(Matcher matcher, SpannableString spannableString) {
        try {
            HashMap hashMap = new HashMap();
            while (matcher.find()) {
                String group = matcher.group();
                if (!TextUtils.isEmpty(group) && !hashMap.containsKey(group)) {
                    AbstractC19074t.m100205c(group);
                    hashMap.put(group, group);
                    spannableString.setSpan(new BackgroundColorSpan(C23212s8.m119606n(AbstractC16781w.ChatSearchTextHighlightColor)), matcher.start(), matcher.end(), 18);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: B */
    public final void m71032B(SpannableString spannableString) {
        this.f65867v = spannableString;
    }

    @Override // vc0.InterfaceC27965d
    /* renamed from: b */
    public boolean mo40584b() {
        return m71022f();
    }

    @Override // vc0.InterfaceC27965d
    /* renamed from: c */
    public String mo40586c() {
        return m71033m().m95029V3().toString();
    }

    /* renamed from: m */
    public final C17945a0 m71033m() {
        C0876j m120584H0 = AbstractC23306f.m120584H0();
        MessageId m95029V3 = this.f65865t.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        C17945a0 m2636s = m120584H0.m2636s(m95029V3);
        if (m2636s != null) {
            m2636s.m95146gb(this.f65865t.m95313z4());
            return m2636s;
        }
        return this.f65865t;
    }

    /* renamed from: n */
    public final SpannableString m71034n() {
        C18013y0 c18013y0;
        C32098s c32098s;
        SpannableString spannableString = this.f65868w;
        if (spannableString != null) {
            return spannableString;
        }
        C17969i0 m94929K2 = m71033m().m94929K2();
        if (m94929K2 instanceof C18013y0) {
            c18013y0 = (C18013y0) m94929K2;
        } else {
            c18013y0 = null;
        }
        String str = "";
        if (c18013y0 != null && (c32098s = c18013y0.f91251B) != null) {
            int i11 = c32098s.f147956f;
            if (i11 != 1 && i11 != 3) {
                new SpannableString(c18013y0.f91015t);
            } else {
                String str2 = c18013y0.f91251B.f147957g;
                if (str2 != null) {
                    AbstractC19074t.m100205c(str2);
                    str = str2;
                }
                return new SpannableString(str);
            }
        }
        return new SpannableString("");
    }

    /* renamed from: o */
    public final CharSequence m71035o() {
        return this.f65871z;
    }

    /* renamed from: p */
    public final SpannableString m71036p() {
        SpannableString spannableString = this.f65866u;
        if (spannableString == null) {
            if (AbstractC19646n0.m103011o1(m71033m())) {
                spannableString = AbstractC23463h.m123178f(m71033m());
            } else {
                spannableString = new SpannableString(m71033m().m95019U3());
            }
        }
        AbstractC19074t.m100205c(spannableString);
        C31884d6 m153210b = C31884d6.m153210b();
        AbstractC19074t.m100207e(m153210b, "getLinkOptionsType2(...)");
        C31944h6.m153538d(spannableString, 15, m153210b);
        return spannableString;
    }

    /* renamed from: q */
    public final SpannableString m71037q() {
        return this.f65867v;
    }

    /* renamed from: t */
    public final SpannableString m71038t() {
        C18013y0 c18013y0;
        C32098s c32098s;
        String str;
        SpannableString spannableString = this.f65869x;
        if (spannableString != null) {
            return spannableString;
        }
        C17969i0 m94929K2 = m71033m().m94929K2();
        if (m94929K2 instanceof C18013y0) {
            c18013y0 = (C18013y0) m94929K2;
        } else {
            c18013y0 = null;
        }
        if (c18013y0 != null && (c32098s = c18013y0.f91251B) != null && (str = c32098s.f147952b) != null) {
            return new SpannableString(str);
        }
        return new SpannableString("");
    }

    /* renamed from: u */
    public final SpannableString m71039u() {
        C18013y0 c18013y0;
        C17978l0 c17978l0;
        SpannableString spannableString = this.f65870y;
        if (spannableString != null) {
            return spannableString;
        }
        C17969i0 m94929K2 = m71033m().m94929K2();
        if (m94929K2 instanceof C18013y0) {
            c18013y0 = (C18013y0) m94929K2;
        } else {
            c18013y0 = null;
        }
        if (c18013y0 != null && (c17978l0 = c18013y0.f91253D) != null) {
            return new SpannableString(c17978l0.f91053a);
        }
        return new SpannableString("");
    }

    /* renamed from: w */
    public final SpannableString m71040w() {
        SpannableString spannableString = this.f65867v;
        if (spannableString != null) {
            return spannableString;
        }
        if (AbstractC19646n0.m103011o1(m71033m())) {
            return AbstractC23463h.m123179g(m71033m());
        }
        if (!AbstractC19646n0.m103003m1(m71033m().m95041W4()) && !AbstractC19646n0.m103047y1(m71033m()) && !AbstractC19646n0.m103027s1(m71033m()) && !AbstractC19646n0.m103031t1(m71033m().m95041W4()) && !AbstractC19646n0.m102886D1(m71033m().m95041W4()) && !AbstractC19646n0.m102995k1(m71033m().m95041W4())) {
            return new SpannableString(m71033m().m95019U3());
        }
        return new SpannableString(m71033m().m94929K2().f91011p);
    }

    @Override // com.zing.zalo.p077ui.mycloud.model.MyCloudItem, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "dest");
        parcel.writeParcelable(this.f65865t.m95029V3(), 1);
        parcel.writeLong(this.f65865t.m95313z4());
        super.writeToParcel(parcel, i11);
    }

    /* renamed from: y */
    public final void m71041y(CharSequence charSequence) {
        this.f65871z = charSequence;
    }

    /* renamed from: z */
    public final void m71042z(Pattern pattern) {
        AbstractC19074t.m100208f(pattern, "searchPattern");
        if (AbstractC19646n0.m103044x1(m71033m().m95041W4())) {
            String m120002o = AbstractC23262x6.m120002o(m71036p().toString());
            AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
            Matcher matcher = pattern.matcher(m120002o);
            SpannableString spannableString = new SpannableString(m71036p());
            C31884d6 m153210b = C31884d6.m153210b();
            AbstractC19074t.m100207e(m153210b, "getLinkOptionsType2(...)");
            C31944h6.m153538d(spannableString, 15, m153210b);
            AbstractC19074t.m100205c(matcher);
            m71031x(matcher, spannableString);
            this.f65866u = spannableString;
            return;
        }
        if (AbstractC19646n0.m103035u1(m71033m().m95041W4())) {
            if (m71040w().length() > 0) {
                String m120002o2 = AbstractC23262x6.m120002o(m71040w().toString());
                AbstractC19074t.m100207e(m120002o2, "convertSignToNoSign(...)");
                Matcher matcher2 = pattern.matcher(m120002o2);
                SpannableString spannableString2 = new SpannableString(m71040w());
                AbstractC19074t.m100205c(matcher2);
                m71031x(matcher2, spannableString2);
                this.f65867v = spannableString2;
            }
            if (AbstractC19646n0.m103011o1(m71033m()) && m71036p().length() > 0) {
                String m120002o3 = AbstractC23262x6.m120002o(m71036p().toString());
                AbstractC19074t.m100207e(m120002o3, "convertSignToNoSign(...)");
                Matcher matcher3 = pattern.matcher(m120002o3);
                SpannableString spannableString3 = new SpannableString(m71036p());
                C31884d6 m153210b2 = C31884d6.m153210b();
                AbstractC19074t.m100207e(m153210b2, "getLinkOptionsType2(...)");
                C31944h6.m153538d(spannableString3, 15, m153210b2);
                AbstractC19074t.m100205c(matcher3);
                m71031x(matcher3, spannableString3);
                this.f65866u = spannableString3;
            }
            if (AbstractC19646n0.m103011o1(m71033m())) {
                if (m71034n().length() > 0) {
                    String m120002o4 = AbstractC23262x6.m120002o(m71034n().toString());
                    AbstractC19074t.m100207e(m120002o4, "convertSignToNoSign(...)");
                    Matcher matcher4 = pattern.matcher(m120002o4);
                    SpannableString spannableString4 = new SpannableString(m71034n());
                    AbstractC19074t.m100205c(matcher4);
                    m71031x(matcher4, spannableString4);
                    this.f65868w = spannableString4;
                }
                if (m71038t().length() > 0) {
                    String m120002o5 = AbstractC23262x6.m120002o(m71038t().toString());
                    AbstractC19074t.m100207e(m120002o5, "convertSignToNoSign(...)");
                    Matcher matcher5 = pattern.matcher(m120002o5);
                    SpannableString spannableString5 = new SpannableString(m71038t());
                    AbstractC19074t.m100205c(matcher5);
                    m71031x(matcher5, spannableString5);
                    this.f65869x = spannableString5;
                }
            }
            if (AbstractC19646n0.m103047y1(m71033m()) && m71039u().length() > 0) {
                Matcher matcher6 = pattern.matcher(m71039u());
                SpannableString spannableString6 = new SpannableString(m71039u());
                AbstractC19074t.m100205c(matcher6);
                m71031x(matcher6, spannableString6);
                this.f65870y = spannableString6;
                return;
            }
            return;
        }
        if (AbstractC19646n0.m103003m1(m71033m().m95041W4()) || AbstractC19646n0.m103031t1(m71033m().m95041W4()) || AbstractC19646n0.m102886D1(m71033m().m95041W4())) {
            String str = m71033m().m94929K2().f91011p;
            String m120002o6 = AbstractC23262x6.m120002o(str);
            AbstractC19074t.m100207e(m120002o6, "convertSignToNoSign(...)");
            Matcher matcher7 = pattern.matcher(m120002o6);
            SpannableString spannableString7 = new SpannableString(str);
            AbstractC19074t.m100205c(matcher7);
            m71031x(matcher7, spannableString7);
            this.f65867v = spannableString7;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MyCloudMessageItem(C17945a0 c17945a0, int i11, AbstractC19060k abstractC19060k) {
        this(c17945a0);
        if ((i11 & 1) != 0) {
            c17945a0 = new C17945a0.w(MessageId.Companion.m41064b("", "", "", ""), 0).m95365a();
            AbstractC19074t.m100207e(c17945a0, "build(...)");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyCloudMessageItem(Parcel parcel) {
        this(null, 1, null);
        AbstractC19074t.m100208f(parcel, "parcel");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: b90.a

            /* renamed from: q */
            public final /* synthetic */ MyCloudMessageItem f10663q;

            /* renamed from: r */
            public final /* synthetic */ long f10664r;

            public /* synthetic */ RunnableC2664a(MyCloudMessageItem this, long j11) {
                r2 = this;
                r3 = j11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MyCloudMessageItem.m71030l(MessageId.this, r2, r3);
            }
        });
        m71026j(parcel.readInt());
        m71023g(parcel.readString());
        m71024h(parcel.readLong());
        m71025i(parcel.readByte() != 0);
    }
}
