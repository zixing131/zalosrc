package com.zing.zalo.p077ui.mycloud.gridtab;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C17014k0;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17990p0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import java.util.HashMap;
import java.util.Locale;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22124b0;
import l80.C22126c0;
import ln0.AbstractC22543l;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mw.AbstractC23463h;
import on0.AbstractC24342w;
import p239ih.C20556f;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p698yz.AbstractC31111g;
import p698yz.C31106b;
import p698yz.C31108d;
import p698yz.EnumC31105a;
import p698yz.EnumC31107c;
import p716zh.AbstractC31990k7;
import pm0.C24848g0;
import th.AbstractC26687h;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26707f;
import u80.InterfaceC27158o2;
import ui0.C27280g;
import vg.AbstractC28236y3;
import vg.C28023b6;

/* loaded from: classes6.dex */
public final class FileGridChatItemView extends GridChatItemViewBase {

    /* renamed from: A0 */
    private C16716d f65620A0;

    /* renamed from: B0 */
    private C16716d f65621B0;

    /* renamed from: C0 */
    private C21693c f65622C0;

    /* renamed from: D0 */
    private C22126c0 f65623D0;

    /* renamed from: E0 */
    private C22126c0 f65624E0;

    /* renamed from: F0 */
    private C22124b0 f65625F0;

    /* renamed from: G0 */
    private C17014k0 f65626G0;

    /* renamed from: H0 */
    private String f65627H0;

    /* renamed from: I0 */
    private String f65628I0;

    /* renamed from: J0 */
    private int f65629J0;

    /* renamed from: K0 */
    private EnumC31105a f65630K0;

    /* renamed from: L0 */
    private boolean f65631L0;

    /* renamed from: M0 */
    private String f65632M0;

    /* renamed from: N0 */
    private Drawable f65633N0;

    /* renamed from: O0 */
    private CharSequence f65634O0;

    /* renamed from: P0 */
    private C31106b f65635P0;

    /* renamed from: Q0 */
    private boolean f65636Q0;

    /* renamed from: R0 */
    private boolean f65637R0;

    /* renamed from: S0 */
    private boolean f65638S0;

    /* renamed from: T0 */
    private boolean f65639T0;

    /* renamed from: U0 */
    private long f65640U0;

    /* renamed from: V0 */
    private final HashMap f65641V0;

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.FileGridChatItemView$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C12566a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65642a;

        static {
            int[] iArr = new int[EnumC31105a.values().length];
            try {
                iArr[EnumC31105a.f143331r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31105a.f143329p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC31105a.f143330q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC31105a.f143334u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC31105a.f143332s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC31105a.f143336w.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC31105a.f143335v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC31105a.f143337x.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f65642a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.FileGridChatItemView$b */
    /* loaded from: classes6.dex */
    static final class C12567b extends AbstractC19075u implements InterfaceC18494a {
        C12567b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m70845a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m70845a() {
            FileGridChatItemView.this.mo70815w0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileGridChatItemView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f65630K0 = EnumC31105a.f143330q;
        this.f65634O0 = "";
        this.f65635P0 = new C31106b("", 0);
        this.f65641V0 = new HashMap();
    }

    /* renamed from: f1 */
    private final void m70825f1() {
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.mycloud.gridtab.i
            @Override // java.lang.Runnable
            public final void run() {
                FileGridChatItemView.m70826g1(FileGridChatItemView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public static final void m70826g1(FileGridChatItemView fileGridChatItemView) {
        C17945a0 m71033m;
        AbstractC19074t.m100208f(fileGridChatItemView, "this$0");
        try {
            MyCloudMessageItem data = fileGridChatItemView.getData();
            if (data != null && (m71033m = data.m71033m()) != null && fileGridChatItemView.f65630K0 == EnumC31105a.f143331r) {
                m71033m.m95068Z0();
                m71033m.m95165ic(2, true);
                C23744a.Companion.m124119a().m124116d(6, m71033m.m95029V3(), m71033m.mo95039W2());
                C28023b6.m141250h0().m141301M(m71033m.m95029V3().m41044h());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    private final void getUIData() {
        String str;
        Drawable m139658a;
        String str2;
        String str3;
        MyCloudMessageItem data = getData();
        if (data != null && (data.m71033m().m94929K2() instanceof C17990p0)) {
            C17969i0 m94929K2 = data.m71033m().m94929K2();
            AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentFile");
            C17990p0 c17990p0 = (C17990p0) m94929K2;
            data.m71033m().m94884F1();
            EnumC31105a m70839t1 = m70839t1();
            this.f65630K0 = m70839t1;
            boolean z11 = true;
            if (m70839t1 == EnumC31105a.f143335v) {
                this.f65631L0 = false;
            } else {
                this.f65632M0 = data.m71033m().m95266u2();
                this.f65631L0 = !TextUtils.isEmpty(r2);
            }
            String str4 = c17990p0.f91115D;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            this.f65627H0 = str4;
            long j11 = c17990p0.f91113B;
            if (j11 < 0) {
                str = "";
            } else {
                str = AbstractC23041d2.m118227z(j11, false);
            }
            this.f65628I0 = str;
            this.f65629J0 = c17990p0.f91123L;
            boolean m154226g = AbstractC31990k7.m154226g(this.f65627H0);
            this.f65637R0 = m154226g;
            if (!m154226g) {
                boolean m154228i = AbstractC31990k7.m154228i(this.f65627H0);
                this.f65638S0 = m154228i;
                if (!m154228i) {
                    this.f65639T0 = AbstractC31990k7.m154225f(this.f65627H0);
                }
            }
            if ((!this.f65637R0 && !this.f65638S0 && !this.f65639T0) || !this.f65631L0) {
                z11 = false;
            }
            this.f65636Q0 = z11;
            if (this.f65629J0 == 2) {
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                m139658a = C27280g.m139658a(context, AbstractC23322a.zds_ffic_folder_colored_48);
            } else {
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                m139658a = C27280g.m139658a(context2, AbstractC28236y3.m142203n(this.f65627H0));
            }
            this.f65633N0 = m139658a;
            if (this.f65629J0 == 2) {
                str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_folder);
                AbstractC19074t.m100205c(str2);
            } else {
                String str6 = this.f65627H0;
                if (str6 != null) {
                    Locale locale = Locale.getDefault();
                    AbstractC19074t.m100207e(locale, "getDefault(...)");
                    String upperCase = str6.toUpperCase(locale);
                    AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
                    if (upperCase != null) {
                        str5 = upperCase;
                    }
                }
                str2 = str5;
            }
            this.f65634O0 = str2;
            if (!TextUtils.isEmpty(this.f65628I0)) {
                if (TextUtils.isEmpty(this.f65634O0)) {
                    str3 = String.valueOf(this.f65628I0);
                } else {
                    CharSequence charSequence = this.f65634O0;
                    str3 = ((Object) charSequence) + " • " + this.f65628I0;
                }
                this.f65634O0 = str3;
            }
            if (data.m71033m().m94849A8()) {
                Context context3 = getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                this.f65634O0 = AbstractC23463h.m123175c(context3, this.f65634O0, false, 4, null);
            }
        }
    }

    /* renamed from: h1 */
    private final void m70827h1(final boolean z11) {
        final C17945a0 m71033m;
        BaseMyCloudTabView.AbstractC12510b delegate;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f65640U0 < 400) {
            return;
        }
        this.f65640U0 = currentTimeMillis;
        MyCloudMessageItem data = getData();
        if (data != null && (m71033m = data.m71033m()) != null) {
            if ((this.f65630K0 == EnumC31105a.f143335v || AbstractC26687h.m137064e(m71033m)) && !AbstractC3489d.m17503k()) {
                Context context = getContext();
                if (context != null && (delegate = getDelegate()) != null) {
                    delegate.mo70399r(context, m71033m);
                    return;
                }
                return;
            }
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.mycloud.gridtab.h
                @Override // java.lang.Runnable
                public final void run() {
                    FileGridChatItemView.m70829j1(C17945a0.this, this, z11);
                }
            });
        }
    }

    /* renamed from: i1 */
    static /* synthetic */ void m70828i1(FileGridChatItemView fileGridChatItemView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        fileGridChatItemView.m70827h1(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1 */
    public static final void m70829j1(final C17945a0 c17945a0, final FileGridChatItemView fileGridChatItemView, boolean z11) {
        String str;
        AbstractC19074t.m100208f(c17945a0, "$message");
        AbstractC19074t.m100208f(fileGridChatItemView, "this$0");
        try {
            C31108d m151142w = AbstractC31111g.m151142w(c17945a0);
            boolean m151119b = m151142w.m151119b();
            String m151118a = m151142w.m151118a();
            if (m151119b && AbstractC26687h.m137065f(c17945a0.mo95039W2(), c17945a0.m95238r3())) {
                AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.mycloud.gridtab.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        FileGridChatItemView.m70830k1(FileGridChatItemView.this, c17945a0);
                    }
                });
                return;
            }
            if (!m151119b) {
                if (AbstractC26687h.m137065f(c17945a0.mo95039W2(), c17945a0.m95238r3())) {
                    if (c17945a0.m95089b4() != 1 && c17945a0.m95107d3() != 4) {
                        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.mycloud.gridtab.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                FileGridChatItemView.m70831l1(FileGridChatItemView.this, c17945a0);
                            }
                        });
                    }
                } else {
                    c17945a0.m95214o2(true, true);
                }
                if (c17945a0.m95032V6()) {
                    str = "900102";
                } else {
                    str = "900101";
                }
                AbstractC23647d.m123897g(str);
                return;
            }
            if (c17945a0.m95147gc(m151118a, false, false)) {
                C23744a.Companion.m124119a().m124116d(6, c17945a0.m95029V3(), c17945a0.mo95039W2());
            }
            fileGridChatItemView.f65630K0 = EnumC31105a.f143333t;
            if (z11) {
                BaseMyCloudTabView.AbstractC12510b delegate = fileGridChatItemView.getDelegate();
                if (delegate != null) {
                    delegate.mo70405x(c17945a0, new C20556f(c17945a0.m94983Q3()));
                }
                C28023b6.m141250h0().m141301M(c17945a0.m95029V3().m41044h());
                AbstractC31111g.m151133n(c17945a0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1 */
    public static final void m70830k1(FileGridChatItemView fileGridChatItemView, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(fileGridChatItemView, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$message");
        BaseMyCloudTabView.AbstractC12510b delegate = fileGridChatItemView.getDelegate();
        if (delegate != null) {
            delegate.mo70397p(c17945a0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1 */
    public static final void m70831l1(FileGridChatItemView fileGridChatItemView, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(fileGridChatItemView, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$message");
        BaseMyCloudTabView.AbstractC12510b delegate = fileGridChatItemView.getDelegate();
        if (delegate != null) {
            delegate.mo70392k(c17945a0);
        }
    }

    /* renamed from: m1 */
    private final void m70832m1(MessageId messageId) {
        C17945a0 m71033m;
        try {
            MyCloudMessageItem data = getData();
            if (data != null && (m71033m = data.m71033m()) != null && m71033m.m95135f9(messageId)) {
                AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.mycloud.gridtab.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        FileGridChatItemView.m70833n1(FileGridChatItemView.this);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m70833n1(FileGridChatItemView fileGridChatItemView) {
        AbstractC19074t.m100208f(fileGridChatItemView, "this$0");
        fileGridChatItemView.mo70815w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m70834o1(FileGridChatItemView fileGridChatItemView, C16719g c16719g) {
        AbstractC19074t.m100208f(fileGridChatItemView, "this$0");
        if (fileGridChatItemView.getEnableMultiSelection()) {
            C21691a checkBoxModule = fileGridChatItemView.getCheckBoxModule();
            if (checkBoxModule != null) {
                checkBoxModule.mo89091D0(!checkBoxModule.m89141i0());
                return;
            }
            return;
        }
        m70828i1(fileGridChatItemView, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m70835p1(FileGridChatItemView fileGridChatItemView, C16719g c16719g) {
        InterfaceC27158o2 selectEventListener;
        AbstractC19074t.m100208f(fileGridChatItemView, "this$0");
        MyCloudMessageItem data = fileGridChatItemView.getData();
        if (data != null && (selectEventListener = fileGridChatItemView.getSelectEventListener()) != null) {
            InterfaceC27158o2.a.m139263a(selectEventListener, data, fileGridChatItemView.getPosition(), null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m70836q1(FileGridChatItemView fileGridChatItemView, C16719g c16719g) {
        AbstractC19074t.m100208f(fileGridChatItemView, "this$0");
        if (fileGridChatItemView.f65630K0 == EnumC31105a.f143331r) {
            fileGridChatItemView.m70825f1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m70837r1(FileGridChatItemView fileGridChatItemView, C16719g c16719g) {
        AbstractC19074t.m100208f(fileGridChatItemView, "this$0");
        if (fileGridChatItemView.getEnableMultiSelection()) {
            C21691a checkBoxModule = fileGridChatItemView.getCheckBoxModule();
            if (checkBoxModule != null) {
                checkBoxModule.mo89091D0(!checkBoxModule.m89141i0());
                return;
            }
            return;
        }
        if (fileGridChatItemView.f65630K0 == EnumC31105a.f143336w) {
            fileGridChatItemView.m70841v1();
        } else {
            m70828i1(fileGridChatItemView, false, 1, null);
        }
    }

    /* renamed from: s1 */
    private final void m70838s1(SpannableString spannableString) {
        int m127173b0;
        CharSequence m70842w1 = m70842w1();
        if (TextUtils.equals(spannableString, m70842w1)) {
            return;
        }
        Object[] spans = spannableString.getSpans(0, spannableString.length(), BackgroundColorSpan.class);
        AbstractC19074t.m100207e(spans, "getSpans(start, end, T::class.java)");
        for (Object obj : spans) {
            BackgroundColorSpan backgroundColorSpan = (BackgroundColorSpan) obj;
            String obj2 = spannableString.subSequence(spannableString.getSpanStart(backgroundColorSpan), spannableString.getSpanEnd(backgroundColorSpan)).toString();
            MyCloudMessageItem data = getData();
            if (data != null) {
                SpannableString spannableString2 = new SpannableString(m70842w1);
                m127173b0 = AbstractC24342w.m127173b0(m70842w1, obj2, 0, false, 6, null);
                if (m127173b0 != -1) {
                    spannableString2.setSpan(backgroundColorSpan, m127173b0, obj2.length() + m127173b0, 18);
                }
                data.m71032B(spannableString2);
            }
        }
    }

    /* renamed from: t1 */
    private final EnumC31105a m70839t1() {
        EnumC31105a enumC31105a;
        C17945a0 m71033m;
        if (getData() == null) {
            return EnumC31105a.f143330q;
        }
        EnumC31105a enumC31105a2 = EnumC31105a.f143330q;
        try {
            MyCloudMessageItem data = getData();
            if (data != null && (m71033m = data.m71033m()) != null) {
                enumC31105a = m70840u1(m71033m);
            } else {
                enumC31105a = enumC31105a2;
            }
            try {
                if (enumC31105a != EnumC31105a.f143333t) {
                    if (enumC31105a == EnumC31105a.f143334u) {
                    }
                    return enumC31105a;
                }
                if (!getMExternalStates().m143918k()) {
                    return enumC31105a2;
                }
                return enumC31105a;
            } catch (Exception e11) {
                EnumC31105a enumC31105a3 = enumC31105a;
                e = e11;
                enumC31105a2 = enumC31105a3;
                AbstractC23350e.m122778h(e);
                return enumC31105a2;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: u1 */
    private final EnumC31105a m70840u1(C17945a0 c17945a0) {
        return AbstractC31111g.m151139t(c17945a0);
    }

    /* renamed from: v1 */
    private final void m70841v1() {
        C17945a0 m71033m;
        BaseMyCloudTabView.AbstractC12510b delegate;
        MyCloudMessageItem data = getData();
        if (data != null && (m71033m = data.m71033m()) != null && (delegate = getDelegate()) != null) {
            delegate.mo70393l(m71033m);
        }
    }

    /* renamed from: w1 */
    private final CharSequence m70842w1() {
        SpannableString m71040w;
        MyCloudMessageItem data = getData();
        if (data != null && (m71040w = data.m71040w()) != null) {
            try {
                C22126c0 c22126c0 = this.f65623D0;
                C22126c0 c22126c02 = null;
                if (c22126c0 == null) {
                    AbstractC19074t.m100223u("titleModule");
                    c22126c0 = null;
                }
                int m111971k1 = c22126c0.m111971k1();
                int itemWidth = getItemWidth() - (AbstractC23222t7.f112576o * 2);
                String str = "[" + ((Object) m71040w) + "][" + m111971k1 + "][" + itemWidth + "]";
                CharSequence charSequence = (CharSequence) this.f65641V0.get(str);
                if (charSequence != null) {
                    return charSequence;
                }
                C13704p1 c13704p1 = new C13704p1(1);
                C22126c0 c22126c03 = this.f65623D0;
                if (c22126c03 == null) {
                    AbstractC19074t.m100223u("titleModule");
                    c22126c03 = null;
                }
                c22126c03.mo88812r();
                C22126c0 c22126c04 = this.f65623D0;
                if (c22126c04 == null) {
                    AbstractC19074t.m100223u("titleModule");
                } else {
                    c22126c02 = c22126c04;
                }
                c13704p1.set(c22126c02.m111975o1().getPaint());
                CharSequence m102924Q0 = AbstractC19646n0.m102924Q0(m71040w.toString(), c13704p1, itemWidth, m111971k1, 7);
                this.f65641V0.put(str, m102924Q0);
                return m102924Q0;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return m71040w;
            }
        }
        return new SpannableString("");
    }

    /* renamed from: x1 */
    private final void m70843x1(C17945a0 c17945a0, EnumC31105a enumC31105a) {
        setShowLoadingProgress(false);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f65635P0 = AbstractC31111g.m151126g(context, EnumC31107c.f143344r, c17945a0, enumC31105a);
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: C0 */
    public C16719g mo70813C0() {
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(-1, -1).m89041Y(AbstractC23222t7.f112576o);
        this.f65620A0 = c16716d;
        C16716d c16716d2 = new C16716d(getContext());
        C16718f m89106L = c16716d2.m89106L();
        int i11 = AbstractC23222t7.f112534M;
        m89106L.m89028L(i11, i11);
        this.f65621B0 = c16716d2;
        C16716d c16716d3 = this.f65620A0;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d3 = null;
        }
        C16716d c16716d4 = this.f65621B0;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("iconGroupModule");
            c16716d4 = null;
        }
        c16716d3.m89001g1(c16716d4);
        C21693c c21693c = new C21693c(getContext());
        C16718f m89106L2 = c21693c.m89106L();
        int i12 = AbstractC23222t7.f112534M;
        m89106L2.m89028L(i12, i12).m89025I(true);
        c21693c.m111929z1(4);
        this.f65622C0 = c21693c;
        C16716d c16716d5 = this.f65621B0;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("iconGroupModule");
            c16716d5 = null;
        }
        C21693c c21693c2 = this.f65622C0;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("iconModule");
            c21693c2 = null;
        }
        c16716d5.m89001g1(c21693c2);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C17014k0 c17014k0 = new C17014k0(context, AbstractC2814h.ProgressBar_Size24_Blue);
        c17014k0.m89106L().m89028L(-2, -2).m89025I(true);
        c17014k0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.mycloud.gridtab.d
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                FileGridChatItemView.m70836q1(FileGridChatItemView.this, c16719g);
            }
        });
        this.f65626G0 = c17014k0;
        C16716d c16716d6 = this.f65621B0;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("iconGroupModule");
            c16716d6 = null;
        }
        C17014k0 c17014k02 = this.f65626G0;
        if (c17014k02 == null) {
            AbstractC19074t.m100223u("circleProgressModule");
            c17014k02 = null;
        }
        c16716d6.m89001g1(c17014k02);
        C22124b0 c22124b0 = new C22124b0(getContext());
        c22124b0.m89106L().m89028L(-2, -2).m89072y(Boolean.TRUE);
        Context context2 = c22124b0.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        C26703b m137293a = C26705d.m137293a(context2, AbstractC2814h.t_xxsmall);
        C22126c0 c22126c0 = c22124b0.f108888M0;
        AbstractC19074t.m100207e(c22126c0, "textModule");
        new C26707f(c22126c0).m137318a(m137293a);
        c22124b0.f108888M0.m111962J1(C23212s8.m119607o(c22124b0.getContext(), AbstractC2807a.text_02));
        this.f65625F0 = c22124b0;
        c22124b0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.mycloud.gridtab.e
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                FileGridChatItemView.m70837r1(FileGridChatItemView.this, c16719g);
            }
        });
        C16716d c16716d7 = this.f65620A0;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d7 = null;
        }
        C22124b0 c22124b02 = this.f65625F0;
        if (c22124b02 == null) {
            AbstractC19074t.m100223u("fileStateModule");
            c22124b02 = null;
        }
        c16716d7.m89001g1(c22124b02);
        C22126c0 c22126c02 = new C22126c0(getContext());
        C16718f m89028L = c22126c02.m89106L().m89028L(-2, -2);
        C22124b0 c22124b03 = this.f65625F0;
        if (c22124b03 == null) {
            AbstractC19074t.m100223u("fileStateModule");
            c22124b03 = null;
        }
        m89028L.m89066s(c22124b03);
        Context context3 = c22126c02.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        new C26707f(c22126c02).m137318a(C26705d.m137293a(context3, AbstractC2814h.t_xxsmall));
        c22126c02.m111962J1(C23212s8.m119607o(c22126c02.getContext(), AbstractC2807a.text_02));
        this.f65624E0 = c22126c02;
        C16716d c16716d8 = this.f65620A0;
        if (c16716d8 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d8 = null;
        }
        C22126c0 c22126c03 = this.f65624E0;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("sizeModule");
            c22126c03 = null;
        }
        c16716d8.m89001g1(c22126c03);
        C22126c0 c22126c04 = new C22126c0(getContext());
        C16718f m89028L2 = c22126c04.m89106L().m89028L(-2, -2);
        C22126c0 c22126c05 = this.f65624E0;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("sizeModule");
            c22126c05 = null;
        }
        m89028L2.m89066s(c22126c05).m89033Q(AbstractC23222t7.f112556e);
        Context context4 = c22126c04.getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        new C26707f(c22126c04).m137318a(C26705d.m137293a(context4, AbstractC2814h.t_normal_m));
        c22126c04.m111962J1(C23212s8.m119607o(c22126c04.getContext(), AbstractC2807a.text_01));
        this.f65623D0 = c22126c04;
        C16716d c16716d9 = this.f65620A0;
        if (c16716d9 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d9 = null;
        }
        C22126c0 c22126c06 = this.f65623D0;
        if (c22126c06 == null) {
            AbstractC19074t.m100223u("titleModule");
            c22126c06 = null;
        }
        c16716d9.m89001g1(c22126c06);
        C16716d c16716d10 = this.f65620A0;
        if (c16716d10 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d10 = null;
        }
        c16716d10.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.mycloud.gridtab.f
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                FileGridChatItemView.m70834o1(FileGridChatItemView.this, c16719g);
            }
        });
        C16716d c16716d11 = this.f65620A0;
        if (c16716d11 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d11 = null;
        }
        c16716d11.m89111N0(new C16719g.d() { // from class: com.zing.zalo.ui.mycloud.gridtab.g
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                FileGridChatItemView.m70835p1(FileGridChatItemView.this, c16719g);
            }
        });
        C16716d c16716d12 = this.f65620A0;
        if (c16716d12 == null) {
            AbstractC19074t.m100223u("containerModule");
            return null;
        }
        return c16716d12;
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase, dj.C17945a0.x
    /* renamed from: G */
    public void mo61268G(int i11, MessageId messageId) {
        m70832m1(messageId);
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: O0 */
    public InterfaceC18494a mo70844O0() {
        return new C12567b();
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: Q0 */
    public void mo70814Q0() {
        super.mo70814Q0();
        this.f65627H0 = null;
        this.f65628I0 = null;
        this.f65629J0 = 0;
        this.f65630K0 = EnumC31105a.f143330q;
        this.f65631L0 = false;
        this.f65632M0 = null;
        this.f65633N0 = null;
        this.f65634O0 = "";
        this.f65635P0 = new C31106b("", 0);
        this.f65636Q0 = false;
        this.f65637R0 = false;
        this.f65638S0 = false;
        this.f65639T0 = false;
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase, dj.C17945a0.x
    /* renamed from: m */
    public void mo61273m(int i11, MessageId messageId) {
        m70832m1(messageId);
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: w0 */
    public void mo70815w0() {
        int m116580c;
        int m116580c2;
        MyCloudMessageItem data = getData();
        if (data != null) {
            getUIData();
            m70843x1(data.m71033m(), this.f65630K0);
            C22124b0 c22124b0 = null;
            if (this.f65635P0.m151115a().length() > 0) {
                C22126c0 c22126c0 = this.f65623D0;
                if (c22126c0 == null) {
                    AbstractC19074t.m100223u("titleModule");
                    c22126c0 = null;
                }
                c22126c0.m111953A1(2);
                C22124b0 c22124b02 = this.f65625F0;
                if (c22124b02 == null) {
                    AbstractC19074t.m100223u("fileStateModule");
                    c22124b02 = null;
                }
                C16718f m89106L = c22124b02.m89106L();
                if (m89106L != null) {
                    m89106L.m89072y(Boolean.TRUE);
                }
                C22126c0 c22126c02 = this.f65624E0;
                if (c22126c02 == null) {
                    AbstractC19074t.m100223u("sizeModule");
                    c22126c02 = null;
                }
                C16718f m89106L2 = c22126c02.m89106L();
                if (m89106L2 != null) {
                    m89106L2.m89072y(Boolean.FALSE);
                }
                C22126c0 c22126c03 = this.f65624E0;
                if (c22126c03 == null) {
                    AbstractC19074t.m100223u("sizeModule");
                    c22126c03 = null;
                }
                C16718f m89106L3 = c22126c03.m89106L();
                if (m89106L3 != null) {
                    C22124b0 c22124b03 = this.f65625F0;
                    if (c22124b03 == null) {
                        AbstractC19074t.m100223u("fileStateModule");
                        c22124b03 = null;
                    }
                    m89106L3.m89066s(c22124b03);
                }
            } else {
                C22126c0 c22126c04 = this.f65623D0;
                if (c22126c04 == null) {
                    AbstractC19074t.m100223u("titleModule");
                    c22126c04 = null;
                }
                c22126c04.m111953A1(2);
                C22126c0 c22126c05 = this.f65624E0;
                if (c22126c05 == null) {
                    AbstractC19074t.m100223u("sizeModule");
                    c22126c05 = null;
                }
                C16718f m89106L4 = c22126c05.m89106L();
                if (m89106L4 != null) {
                    m89106L4.m89072y(Boolean.TRUE);
                }
            }
            switch (C12566a.f65642a[this.f65630K0.ordinal()]) {
                case 1:
                    C17014k0 c17014k0 = this.f65626G0;
                    if (c17014k0 == null) {
                        AbstractC19074t.m100223u("circleProgressModule");
                        c17014k0 = null;
                    }
                    c17014k0.mo44614b1(0);
                    C21693c c21693c = this.f65622C0;
                    if (c21693c == null) {
                        AbstractC19074t.m100223u("iconModule");
                        c21693c = null;
                    }
                    c21693c.mo111926w1(0);
                    C21693c c21693c2 = this.f65622C0;
                    if (c21693c2 == null) {
                        AbstractC19074t.m100223u("iconModule");
                        c21693c2 = null;
                    }
                    c21693c2.m89087B0(AbstractC16803z.chat_received_file_icon_round_background);
                    C17014k0 c17014k02 = this.f65626G0;
                    if (c17014k02 == null) {
                        AbstractC19074t.m100223u("circleProgressModule");
                        c17014k02 = null;
                    }
                    c17014k02.m91067l1(true);
                    C17014k0 c17014k03 = this.f65626G0;
                    if (c17014k03 == null) {
                        AbstractC19074t.m100223u("circleProgressModule");
                        c17014k03 = null;
                    }
                    m116580c = AbstractC22543l.m116580c(data.m71033m().m94982Q2(), 10);
                    c17014k03.m91066k1(m116580c);
                    C17014k0 c17014k04 = this.f65626G0;
                    if (c17014k04 == null) {
                        AbstractC19074t.m100223u("circleProgressModule");
                        c17014k04 = null;
                    }
                    c17014k04.m91065j1(false);
                    data.m71033m().m94859Bb(this);
                    break;
                case 2:
                    C17014k0 c17014k05 = this.f65626G0;
                    if (c17014k05 == null) {
                        AbstractC19074t.m100223u("circleProgressModule");
                        c17014k05 = null;
                    }
                    c17014k05.mo44614b1(0);
                    C21693c c21693c3 = this.f65622C0;
                    if (c21693c3 == null) {
                        AbstractC19074t.m100223u("iconModule");
                        c21693c3 = null;
                    }
                    c21693c3.mo111926w1(0);
                    C21693c c21693c4 = this.f65622C0;
                    if (c21693c4 == null) {
                        AbstractC19074t.m100223u("iconModule");
                        c21693c4 = null;
                    }
                    c21693c4.m89087B0(AbstractC16803z.chat_received_file_icon_round_background);
                    C17014k0 c17014k06 = this.f65626G0;
                    if (c17014k06 == null) {
                        AbstractC19074t.m100223u("circleProgressModule");
                        c17014k06 = null;
                    }
                    c17014k06.m91067l1(false);
                    C17014k0 c17014k07 = this.f65626G0;
                    if (c17014k07 == null) {
                        AbstractC19074t.m100223u("circleProgressModule");
                        c17014k07 = null;
                    }
                    m116580c2 = AbstractC22543l.m116580c(data.m71033m().m95001S2(), 10);
                    c17014k07.m91066k1(m116580c2);
                    C17014k0 c17014k08 = this.f65626G0;
                    if (c17014k08 == null) {
                        AbstractC19074t.m100223u("circleProgressModule");
                        c17014k08 = null;
                    }
                    c17014k08.m91065j1(false);
                    data.m71033m().m94859Bb(this);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    if (AbstractC25495a.m132078c(data.m71033m().mo95039W2()) && !AbstractC26687h.m137065f(data.m71033m().mo95039W2(), data.m71033m().m95238r3())) {
                        C17014k0 c17014k09 = this.f65626G0;
                        if (c17014k09 == null) {
                            AbstractC19074t.m100223u("circleProgressModule");
                            c17014k09 = null;
                        }
                        c17014k09.mo44614b1(8);
                        C21693c c21693c5 = this.f65622C0;
                        if (c21693c5 == null) {
                            AbstractC19074t.m100223u("iconModule");
                            c21693c5 = null;
                        }
                        c21693c5.mo111925v1(this.f65633N0);
                        C21693c c21693c6 = this.f65622C0;
                        if (c21693c6 == null) {
                            AbstractC19074t.m100223u("iconModule");
                            c21693c6 = null;
                        }
                        c21693c6.m89087B0(0);
                        break;
                    } else {
                        C17014k0 c17014k010 = this.f65626G0;
                        if (c17014k010 == null) {
                            AbstractC19074t.m100223u("circleProgressModule");
                            c17014k010 = null;
                        }
                        c17014k010.mo44614b1(8);
                        C21693c c21693c7 = this.f65622C0;
                        if (c21693c7 == null) {
                            AbstractC19074t.m100223u("iconModule");
                            c21693c7 = null;
                        }
                        Context context = getContext();
                        AbstractC19074t.m100207e(context, "getContext(...)");
                        c21693c7.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_download_solid_24, AbstractC2807a.icon_01));
                        C21693c c21693c8 = this.f65622C0;
                        if (c21693c8 == null) {
                            AbstractC19074t.m100223u("iconModule");
                            c21693c8 = null;
                        }
                        c21693c8.m89087B0(AbstractC16803z.chat_received_file_icon_round_background);
                        break;
                    }
                    break;
                case 7:
                case 8:
                    C17014k0 c17014k011 = this.f65626G0;
                    if (c17014k011 == null) {
                        AbstractC19074t.m100223u("circleProgressModule");
                        c17014k011 = null;
                    }
                    c17014k011.mo44614b1(8);
                    C21693c c21693c9 = this.f65622C0;
                    if (c21693c9 == null) {
                        AbstractC19074t.m100223u("iconModule");
                        c21693c9 = null;
                    }
                    Context context2 = getContext();
                    AbstractC19074t.m100207e(context2, "getContext(...)");
                    c21693c9.mo111925v1(C27280g.m139660c(context2, AbstractC23322a.zds_ic_file_rolled_out_solid_24, AbstractC2807a.icon_03));
                    C21693c c21693c10 = this.f65622C0;
                    if (c21693c10 == null) {
                        AbstractC19074t.m100223u("iconModule");
                        c21693c10 = null;
                    }
                    c21693c10.m89087B0(AbstractC16803z.chat_received_file_icon_round_background);
                    break;
                default:
                    C17014k0 c17014k012 = this.f65626G0;
                    if (c17014k012 == null) {
                        AbstractC19074t.m100223u("circleProgressModule");
                        c17014k012 = null;
                    }
                    c17014k012.mo44614b1(8);
                    C21693c c21693c11 = this.f65622C0;
                    if (c21693c11 == null) {
                        AbstractC19074t.m100223u("iconModule");
                        c21693c11 = null;
                    }
                    c21693c11.mo111925v1(this.f65633N0);
                    C21693c c21693c12 = this.f65622C0;
                    if (c21693c12 == null) {
                        AbstractC19074t.m100223u("iconModule");
                        c21693c12 = null;
                    }
                    c21693c12.m89087B0(0);
                    break;
            }
            SpannableString m71037q = data.m71037q();
            if (m71037q != null && m71037q.length() != 0) {
                SpannableString m71037q2 = data.m71037q();
                AbstractC19074t.m100205c(m71037q2);
                m70838s1(m71037q2);
            } else {
                data.m71032B(new SpannableString(m70842w1()));
            }
            C22126c0 c22126c06 = this.f65623D0;
            if (c22126c06 == null) {
                AbstractC19074t.m100223u("titleModule");
                c22126c06 = null;
            }
            c22126c06.m111959G1(data.m71040w());
            C22126c0 c22126c07 = this.f65624E0;
            if (c22126c07 == null) {
                AbstractC19074t.m100223u("sizeModule");
                c22126c07 = null;
            }
            c22126c07.m111959G1(this.f65634O0);
            C22124b0 c22124b04 = this.f65625F0;
            if (c22124b04 == null) {
                AbstractC19074t.m100223u("fileStateModule");
            } else {
                c22124b0 = c22124b04;
            }
            c22124b0.f108888M0.m111959G1(this.f65635P0.m151115a());
        }
    }
}
