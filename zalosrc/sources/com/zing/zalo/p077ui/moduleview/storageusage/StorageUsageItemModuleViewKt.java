package com.zing.zalo.p077ui.moduleview.storageusage;

import am.C0943w;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.moduleview.storageusage.StorageUsageItemModuleViewKt;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C17073y;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import k30.C21459a;
import kd0.C21693c;
import ki0.C21733a;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import p262jb.AbstractC21196a;
import p348mi.C23302b;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import ui0.C27280g;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes6.dex */
public final class StorageUsageItemModuleViewKt extends ModulesView {
    public static final C12459a Companion = new C12459a(null);

    /* renamed from: K */
    private final EnumC12461c f65212K;

    /* renamed from: L */
    private final InterfaceC12460b f65213L;

    /* renamed from: M */
    private ThreadStorageInfo f65214M;

    /* renamed from: N */
    private C16716d f65215N;

    /* renamed from: O */
    private C16719g f65216O;

    /* renamed from: P */
    private C17073y f65217P;

    /* renamed from: Q */
    private C16716d f65218Q;

    /* renamed from: R */
    private C22129e f65219R;

    /* renamed from: S */
    private C21693c f65220S;

    /* renamed from: T */
    private C16716d f65221T;

    /* renamed from: U */
    private C22126c0 f65222U;

    /* renamed from: V */
    private C22126c0 f65223V;

    /* renamed from: W */
    private C22126c0 f65224W;

    /* renamed from: a0 */
    private C21693c f65225a0;

    /* renamed from: b0 */
    private int f65226b0;

    /* renamed from: c0 */
    private int f65227c0;

    /* renamed from: d0 */
    private int f65228d0;

    /* renamed from: e0 */
    private Drawable f65229e0;

    /* renamed from: com.zing.zalo.ui.moduleview.storageusage.StorageUsageItemModuleViewKt$a */
    /* loaded from: classes6.dex */
    public static final class C12459a {
        private C12459a() {
        }

        public /* synthetic */ C12459a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.moduleview.storageusage.StorageUsageItemModuleViewKt$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC12460b {
        /* renamed from: a */
        boolean mo69967a(String str);

        /* renamed from: b */
        boolean mo69968b();

        /* renamed from: c */
        boolean mo69969c(ThreadStorageInfo threadStorageInfo);

        /* renamed from: d */
        void mo69970d(ThreadStorageInfo threadStorageInfo);

        /* renamed from: e */
        void mo69971e(ThreadStorageInfo threadStorageInfo, boolean z11);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.moduleview.storageusage.StorageUsageItemModuleViewKt$c */
    /* loaded from: classes6.dex */
    public static final class EnumC12461c {

        /* renamed from: p */
        public static final EnumC12461c f65230p = new EnumC12461c("TOOL_STORAGE", 0);

        /* renamed from: q */
        public static final EnumC12461c f65231q = new EnumC12461c("ZCLOUD_HOME", 1);

        /* renamed from: r */
        private static final /* synthetic */ EnumC12461c[] f65232r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f65233s;

        static {
            EnumC12461c[] m69972b = m69972b();
            f65232r = m69972b;
            f65233s = AbstractC30166b.m148796a(m69972b);
        }

        private EnumC12461c(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC12461c[] m69972b() {
            return new EnumC12461c[]{f65230p, f65231q};
        }

        public static EnumC12461c valueOf(String str) {
            return (EnumC12461c) Enum.valueOf(EnumC12461c.class, str);
        }

        public static EnumC12461c[] values() {
            return (EnumC12461c[]) f65232r.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageUsageItemModuleViewKt(Context context, EnumC12461c enumC12461c, InterfaceC12460b interfaceC12460b) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(enumC12461c, "mode");
        AbstractC19074t.m100208f(interfaceC12460b, "mListener");
        this.f65212K = enumC12461c;
        this.f65213L = interfaceC12460b;
        this.f65226b0 = C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor);
        this.f65227c0 = C23212s8.m119607o(context, AbstractC2807a.list_item_title);
        this.f65228d0 = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        this.f65229e0 = C23212s8.m119609q(context, AbstractC16781w.default_avatar);
        m69961b0(context);
    }

    /* renamed from: a0 */
    private final void m69960a0(String str, List list) {
        C22126c0 c22126c0 = null;
        if (list != null && (!list.isEmpty())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            int size = list.size();
            for (int i11 = 0; i11 < size - 1; i11 += 2) {
                if (((Number) list.get(i11)).intValue() >= 0) {
                    int i12 = i11 + 1;
                    if (((Number) list.get(i12)).intValue() > ((Number) list.get(i11)).intValue()) {
                        spannableStringBuilder.setSpan(new StyleSpan(1), ((Number) list.get(i11)).intValue(), ((Number) list.get(i12)).intValue(), 33);
                    }
                }
            }
            if (spannableStringBuilder.length() > 24) {
                CharSequence subSequence = spannableStringBuilder.subSequence(0, 24);
                AbstractC19074t.m100206d(subSequence, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
                spannableStringBuilder = (SpannableStringBuilder) subSequence;
                spannableStringBuilder.append((CharSequence) "...");
            }
            C22126c0 c22126c02 = this.f65222U;
            if (c22126c02 == null) {
                AbstractC19074t.m100223u("mName");
            } else {
                c22126c0 = c22126c02;
            }
            c22126c0.m111959G1(spannableStringBuilder);
            return;
        }
        if (str.length() > 24) {
            CharSequence subSequence2 = str.subSequence(0, 24);
            AbstractC19074t.m100206d(subSequence2, "null cannot be cast to non-null type kotlin.String");
            str = ((String) subSequence2) + "...";
        }
        C22126c0 c22126c03 = this.f65222U;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("mName");
        } else {
            c22126c0 = c22126c03;
        }
        c22126c0.m111959G1(str);
    }

    /* renamed from: b0 */
    private final void m69961b0(Context context) {
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89028L(-1, -2).m89046b0(AbstractC23222t7.f112586t).m89047c0(AbstractC23222t7.f112586t).m89048d0(AbstractC23222t7.f112586t).m89044a0(AbstractC23222t7.f112586t);
        c16716d.m89087B0(AbstractC16803z.stencils_contact_bg);
        c16716d.mo89109M0(new C16719g.c() { // from class: s80.a
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                StorageUsageItemModuleViewKt.m69962c0(StorageUsageItemModuleViewKt.this, c16719g);
            }
        });
        c16716d.m89111N0(new C16719g.d() { // from class: s80.b
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                StorageUsageItemModuleViewKt.m69963d0(StorageUsageItemModuleViewKt.this, c16719g);
            }
        });
        this.f65215N = c16716d;
        C17073y c17073y = new C17073y(context, C21733a.a.MEDIUM);
        C16718f m89027K = c17073y.m89106L().m89035S(AbstractC23222t7.f112586t).m89027K(true);
        Boolean bool = Boolean.TRUE;
        m89027K.m89073z(bool);
        c17073y.mo89109M0(new C16719g.c() { // from class: s80.c
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                StorageUsageItemModuleViewKt.m69964e0(StorageUsageItemModuleViewKt.this, c16719g);
            }
        });
        this.f65217P = c17073y;
        int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.avt_M);
        C16716d c16716d2 = new C16716d(context);
        this.f65218Q = c16716d2;
        C16718f m89027K2 = c16716d2.m89106L().m89028L(m118655I, m118655I).m89027K(true);
        C17073y c17073y2 = this.f65217P;
        C16719g c16719g = null;
        if (c17073y2 == null) {
            AbstractC19074t.m100223u("mCbSelect");
            c17073y2 = null;
        }
        m89027K2.m89054h0(c17073y2).m89035S(AbstractC23222t7.f112586t);
        this.f65219R = new C22129e(context, m118655I);
        C21693c c21693c = new C21693c(context);
        C16718f m89106L = c21693c.m89106L();
        int i11 = AbstractC23222t7.f112586t;
        m89106L.m89028L(i11, i11).m89072y(bool).m89017A(bool);
        c21693c.m111929z1(5);
        c21693c.mo111926w1(AbstractC16803z.ic_oa_verify);
        this.f65220S = c21693c;
        C16716d c16716d3 = this.f65218Q;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("mAvatarContainer");
            c16716d3 = null;
        }
        C22129e c22129e = this.f65219R;
        if (c22129e == null) {
            AbstractC19074t.m100223u("mAvatar");
            c22129e = null;
        }
        c16716d3.m89001g1(c22129e);
        C16716d c16716d4 = this.f65218Q;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("mAvatarContainer");
            c16716d4 = null;
        }
        C21693c c21693c2 = this.f65220S;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("mStatusIcon");
            c21693c2 = null;
        }
        c16716d4.m89001g1(c21693c2);
        C21693c c21693c3 = new C21693c(context);
        c21693c3.m89106L().m89028L(-2, -2).m89017A(bool).m89027K(true);
        c21693c3.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        this.f65225a0 = c21693c3;
        C22126c0 c22126c0 = new C22126c0(context);
        C16718f m89028L = c22126c0.m89106L().m89028L(-2, -2);
        C21693c c21693c4 = this.f65225a0;
        if (c21693c4 == null) {
            AbstractC19074t.m100223u("mArrow");
            c21693c4 = null;
        }
        m89028L.m89049e0(c21693c4).m89027K(true).m89035S(AbstractC23222t7.f112586t).m89034R(AbstractC23222t7.f112582r);
        c22126c0.m115421Q1(AbstractC2814h.t_normal_m);
        c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_tertiary));
        this.f65224W = c22126c0;
        C16716d c16716d5 = new C16716d(context);
        C16718f m89028L2 = c16716d5.m89106L().m89028L(-1, -2);
        C16716d c16716d6 = this.f65218Q;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("mAvatarContainer");
            c16716d6 = null;
        }
        C16718f m89054h0 = m89028L2.m89054h0(c16716d6);
        C22126c0 c22126c02 = this.f65224W;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("mTotalSize");
            c22126c02 = null;
        }
        m89054h0.m89049e0(c22126c02).m89027K(true).m89029M(12);
        this.f65221T = c16716d5;
        C22126c0 c22126c03 = new C22126c0(context);
        c22126c03.m89106L().m89028L(-1, -2);
        c22126c03.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c03.m111980v1(truncateAt);
        c22126c03.m115421Q1(AbstractC2814h.t_large);
        c22126c03.m111962J1(this.f65227c0);
        this.f65222U = c22126c03;
        C22126c0 c22126c04 = new C22126c0(context);
        C16718f m89036T = c22126c04.m89106L().m89028L(-1, -2).m89036T(AbstractC23222t7.f112556e);
        C22126c0 c22126c05 = this.f65222U;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("mName");
            c22126c05 = null;
        }
        m89036T.m89023G(c22126c05);
        c22126c04.mo111964L1(AbstractC23222t7.f112580q);
        c22126c04.m111962J1(this.f65228d0);
        c22126c04.m111953A1(1);
        c22126c04.m111980v1(truncateAt);
        c22126c04.m111959G1(context.getString(AbstractC8020f0.str_tool_storage_list_view_only_text_message_left));
        this.f65223V = c22126c04;
        C16716d c16716d7 = this.f65221T;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("mTextContainer");
            c16716d7 = null;
        }
        C22126c0 c22126c06 = this.f65222U;
        if (c22126c06 == null) {
            AbstractC19074t.m100223u("mName");
            c22126c06 = null;
        }
        c16716d7.m89001g1(c22126c06);
        C16716d c16716d8 = this.f65221T;
        if (c16716d8 == null) {
            AbstractC19074t.m100223u("mTextContainer");
            c16716d8 = null;
        }
        C22126c0 c22126c07 = this.f65223V;
        if (c22126c07 == null) {
            AbstractC19074t.m100223u("mOnlyTextMsg");
            c22126c07 = null;
        }
        c16716d8.m89001g1(c22126c07);
        C16716d c16716d9 = this.f65215N;
        if (c16716d9 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d9 = null;
        }
        C17073y c17073y3 = this.f65217P;
        if (c17073y3 == null) {
            AbstractC19074t.m100223u("mCbSelect");
            c17073y3 = null;
        }
        c16716d9.m89001g1(c17073y3);
        C16716d c16716d10 = this.f65215N;
        if (c16716d10 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d10 = null;
        }
        C16716d c16716d11 = this.f65218Q;
        if (c16716d11 == null) {
            AbstractC19074t.m100223u("mAvatarContainer");
            c16716d11 = null;
        }
        c16716d10.m89001g1(c16716d11);
        C16716d c16716d12 = this.f65215N;
        if (c16716d12 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d12 = null;
        }
        C21693c c21693c5 = this.f65225a0;
        if (c21693c5 == null) {
            AbstractC19074t.m100223u("mArrow");
            c21693c5 = null;
        }
        c16716d12.m89001g1(c21693c5);
        C16716d c16716d13 = this.f65215N;
        if (c16716d13 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d13 = null;
        }
        C22126c0 c22126c08 = this.f65224W;
        if (c22126c08 == null) {
            AbstractC19074t.m100223u("mTotalSize");
            c22126c08 = null;
        }
        c16716d13.m89001g1(c22126c08);
        C16716d c16716d14 = this.f65215N;
        if (c16716d14 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d14 = null;
        }
        C16716d c16716d15 = this.f65221T;
        if (c16716d15 == null) {
            AbstractC19074t.m100223u("mTextContainer");
            c16716d15 = null;
        }
        c16716d14.m89001g1(c16716d15);
        C16719g c16719g2 = new C16719g(context);
        c16719g2.mo89161z0(this.f65226b0);
        C16718f m89028L3 = c16719g2.m89106L().m89028L(-1, 1);
        C16716d c16716d16 = this.f65215N;
        if (c16716d16 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d16 = null;
        }
        C16718f m89023G = m89028L3.m89023G(c16716d16);
        C16716d c16716d17 = this.f65218Q;
        if (c16716d17 == null) {
            AbstractC19074t.m100223u("mAvatarContainer");
            c16716d17 = null;
        }
        m89023G.m89054h0(c16716d17).m89034R(AbstractC23222t7.f112586t);
        this.f65216O = c16719g2;
        C16716d c16716d18 = this.f65215N;
        if (c16716d18 == null) {
            AbstractC19074t.m100223u("mContentLayout");
            c16716d18 = null;
        }
        mo69681L(c16716d18);
        C16719g c16719g3 = this.f65216O;
        if (c16719g3 == null) {
            AbstractC19074t.m100223u("mBottomLine");
        } else {
            c16719g = c16719g3;
        }
        mo69681L(c16719g);
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_contact_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public static final void m69962c0(StorageUsageItemModuleViewKt storageUsageItemModuleViewKt, C16719g c16719g) {
        AbstractC19074t.m100208f(storageUsageItemModuleViewKt, "this$0");
        if (!storageUsageItemModuleViewKt.f65213L.mo69968b()) {
            ThreadStorageInfo threadStorageInfo = storageUsageItemModuleViewKt.f65214M;
            if (threadStorageInfo != null) {
                storageUsageItemModuleViewKt.f65213L.mo69970d(threadStorageInfo);
                return;
            }
            return;
        }
        storageUsageItemModuleViewKt.m69965f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final void m69963d0(StorageUsageItemModuleViewKt storageUsageItemModuleViewKt, C16719g c16719g) {
        AbstractC19074t.m100208f(storageUsageItemModuleViewKt, "this$0");
        if (!storageUsageItemModuleViewKt.f65213L.mo69968b()) {
            ThreadStorageInfo threadStorageInfo = storageUsageItemModuleViewKt.f65214M;
            if (threadStorageInfo != null) {
                storageUsageItemModuleViewKt.f65213L.mo69969c(threadStorageInfo);
            }
            storageUsageItemModuleViewKt.m69965f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m69964e0(StorageUsageItemModuleViewKt storageUsageItemModuleViewKt, C16719g c16719g) {
        AbstractC19074t.m100208f(storageUsageItemModuleViewKt, "this$0");
        storageUsageItemModuleViewKt.m69965f0();
    }

    /* renamed from: f0 */
    private final void m69965f0() {
        ArrayList m74799j;
        ThreadStorageInfo threadStorageInfo = this.f65214M;
        if (threadStorageInfo == null || (m74799j = threadStorageInfo.m74799j()) == null || !m74799j.isEmpty()) {
            InterfaceC12460b interfaceC12460b = this.f65213L;
            ThreadStorageInfo threadStorageInfo2 = this.f65214M;
            AbstractC19074t.m100205c(threadStorageInfo2);
            boolean z11 = !interfaceC12460b.mo69967a(threadStorageInfo2.m74822z());
            C17073y c17073y = this.f65217P;
            if (c17073y == null) {
                AbstractC19074t.m100223u("mCbSelect");
                c17073y = null;
            }
            c17073y.m91362p1(z11, false);
            ThreadStorageInfo threadStorageInfo3 = this.f65214M;
            if (threadStorageInfo3 != null) {
                this.f65213L.mo69971e(threadStorageInfo3, z11);
            }
        }
    }

    /* renamed from: Y */
    public final void m69966Y(ThreadStorageInfo threadStorageInfo, int i11) {
        boolean z11;
        String m74779R;
        if (threadStorageInfo == null) {
            return;
        }
        this.f65214M = threadStorageInfo;
        threadStorageInfo.m74800j0(i11);
        C22126c0 c22126c0 = null;
        if (threadStorageInfo.m74784W()) {
            C31973j5 m4473g = C0943w.m4462l().m4473g(threadStorageInfo.m74822z());
            C22129e c22129e = this.f65219R;
            if (c22129e == null) {
                AbstractC19074t.m100223u("mAvatar");
                c22129e = null;
            }
            c22129e.m115439w1(C23278z2.m120141m0());
            C22129e c22129e2 = this.f65219R;
            if (c22129e2 == null) {
                AbstractC19074t.m100223u("mAvatar");
                c22129e2 = null;
            }
            c22129e2.m115437u1(m4473g);
            if (m4473g == null || (m74779R = m4473g.m153793y()) == null) {
                m74779R = threadStorageInfo.m74779R();
            }
            m69960a0(m74779R, threadStorageInfo.m74818u());
        } else {
            String m74778Q = threadStorageInfo.m74778Q();
            m69960a0(threadStorageInfo.m74779R(), threadStorageInfo.m74818u());
            if (m74778Q.length() > 0) {
                if (C23302b.f113247a.m120523d(m74778Q) && !AbstractC19074t.m100204b(CoreUtility.f89233i, threadStorageInfo.m74822z())) {
                    C22129e c22129e3 = this.f65219R;
                    if (c22129e3 == null) {
                        AbstractC19074t.m100223u("mAvatar");
                        c22129e3 = null;
                    }
                    c22129e3.m115434r1(threadStorageInfo.m74822z());
                } else {
                    C22129e c22129e4 = this.f65219R;
                    if (c22129e4 == null) {
                        AbstractC19074t.m100223u("mAvatar");
                        c22129e4 = null;
                    }
                    c22129e4.m115439w1(C23278z2.m120143n());
                    C22129e c22129e5 = this.f65219R;
                    if (c22129e5 == null) {
                        AbstractC19074t.m100223u("mAvatar");
                        c22129e5 = null;
                    }
                    c22129e5.m115434r1(m74778Q);
                }
            } else {
                C22129e c22129e6 = this.f65219R;
                if (c22129e6 == null) {
                    AbstractC19074t.m100223u("mAvatar");
                    c22129e6 = null;
                }
                c22129e6.m115441y1(this.f65229e0);
            }
        }
        C22126c0 c22126c02 = this.f65224W;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("mTotalSize");
            c22126c02 = null;
        }
        c22126c02.m111959G1(C21459a.m111038f(threadStorageInfo.m74777O(), 0, 2, null));
        if (AbstractC25495a.m132078c(threadStorageInfo.m74822z())) {
            C21693c c21693c = this.f65220S;
            if (c21693c == null) {
                AbstractC19074t.m100223u("mStatusIcon");
                c21693c = null;
            }
            c21693c.mo111926w1(AbstractC16803z.ic_oa_verify);
            C21693c c21693c2 = this.f65220S;
            if (c21693c2 == null) {
                AbstractC19074t.m100223u("mStatusIcon");
                c21693c2 = null;
            }
            c21693c2.mo44614b1(0);
        } else {
            C21693c c21693c3 = this.f65220S;
            if (c21693c3 == null) {
                AbstractC19074t.m100223u("mStatusIcon");
                c21693c3 = null;
            }
            c21693c3.mo44614b1(8);
        }
        if (this.f65213L.mo69968b()) {
            C17073y c17073y = this.f65217P;
            if (c17073y == null) {
                AbstractC19074t.m100223u("mCbSelect");
                c17073y = null;
            }
            c17073y.mo44614b1(0);
            if (!TextUtils.isEmpty(threadStorageInfo.m74822z()) && this.f65213L.mo69967a(threadStorageInfo.m74822z())) {
                z11 = true;
            } else {
                z11 = false;
            }
            C17073y c17073y2 = this.f65217P;
            if (c17073y2 == null) {
                AbstractC19074t.m100223u("mCbSelect");
                c17073y2 = null;
            }
            c17073y2.m91362p1(z11, false);
            C21693c c21693c4 = this.f65225a0;
            if (c21693c4 == null) {
                AbstractC19074t.m100223u("mArrow");
                c21693c4 = null;
            }
            c21693c4.mo44614b1(8);
            if (threadStorageInfo.m74799j().isEmpty()) {
                C16716d c16716d = this.f65215N;
                if (c16716d == null) {
                    AbstractC19074t.m100223u("mContentLayout");
                    c16716d = null;
                }
                c16716d.mo89099H0(false);
                C16716d c16716d2 = this.f65215N;
                if (c16716d2 == null) {
                    AbstractC19074t.m100223u("mContentLayout");
                    c16716d2 = null;
                }
                c16716d2.mo89158x0(0.3f);
                C17073y c17073y3 = this.f65217P;
                if (c17073y3 == null) {
                    AbstractC19074t.m100223u("mCbSelect");
                    c17073y3 = null;
                }
                c17073y3.mo89099H0(false);
            } else {
                C16716d c16716d3 = this.f65215N;
                if (c16716d3 == null) {
                    AbstractC19074t.m100223u("mContentLayout");
                    c16716d3 = null;
                }
                c16716d3.mo89099H0(true);
                C16716d c16716d4 = this.f65215N;
                if (c16716d4 == null) {
                    AbstractC19074t.m100223u("mContentLayout");
                    c16716d4 = null;
                }
                c16716d4.mo89158x0(1.0f);
                C17073y c17073y4 = this.f65217P;
                if (c17073y4 == null) {
                    AbstractC19074t.m100223u("mCbSelect");
                    c17073y4 = null;
                }
                c17073y4.mo89099H0(true);
            }
        } else {
            C17073y c17073y5 = this.f65217P;
            if (c17073y5 == null) {
                AbstractC19074t.m100223u("mCbSelect");
                c17073y5 = null;
            }
            c17073y5.mo44614b1(8);
            C21693c c21693c5 = this.f65225a0;
            if (c21693c5 == null) {
                AbstractC19074t.m100223u("mArrow");
                c21693c5 = null;
            }
            c21693c5.mo44614b1(0);
            C16716d c16716d5 = this.f65215N;
            if (c16716d5 == null) {
                AbstractC19074t.m100223u("mContentLayout");
                c16716d5 = null;
            }
            c16716d5.mo89099H0(true);
            C16716d c16716d6 = this.f65215N;
            if (c16716d6 == null) {
                AbstractC19074t.m100223u("mContentLayout");
                c16716d6 = null;
            }
            c16716d6.mo89158x0(1.0f);
        }
        if (this.f65212K == EnumC12461c.f65231q) {
            if (threadStorageInfo.m74803l() <= 0 && threadStorageInfo.m74801k() <= 0) {
                C22126c0 c22126c03 = this.f65223V;
                if (c22126c03 == null) {
                    AbstractC19074t.m100223u("mOnlyTextMsg");
                } else {
                    c22126c0 = c22126c03;
                }
                c22126c0.mo44614b1(0);
                return;
            }
            C22126c0 c22126c04 = this.f65223V;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("mOnlyTextMsg");
            } else {
                c22126c0 = c22126c04;
            }
            c22126c0.mo44614b1(8);
            return;
        }
        if (threadStorageInfo.m74799j().isEmpty()) {
            C22126c0 c22126c05 = this.f65223V;
            if (c22126c05 == null) {
                AbstractC19074t.m100223u("mOnlyTextMsg");
            } else {
                c22126c0 = c22126c05;
            }
            c22126c0.mo44614b1(0);
            return;
        }
        C22126c0 c22126c06 = this.f65223V;
        if (c22126c06 == null) {
            AbstractC19074t.m100223u("mOnlyTextMsg");
        } else {
            c22126c0 = c22126c06;
        }
        c22126c0.mo44614b1(8);
    }

    public final InterfaceC12460b getMListener() {
        return this.f65213L;
    }

    public final EnumC12461c getMode() {
        return this.f65212K;
    }
}
