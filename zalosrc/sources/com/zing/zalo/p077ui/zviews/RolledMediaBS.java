package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import dj.C17945a0;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import me0.AbstractC23152n3;
import mm0.AbstractC23350e;
import p239ih.C20556f;
import p348mi.AbstractC23306f;
import p542ub.InterfaceC27218a;
import p649xl.C30111x1;
import p698yz.AbstractC31111g;
import p698yz.AbstractC31125u;
import p698yz.C31126v;
import p698yz.EnumC31105a;
import p698yz.EnumC31127w;

/* loaded from: classes6.dex */
public final class RolledMediaBS extends BottomSheet {

    /* renamed from: b1 */
    private C30111x1 f77075b1;

    /* renamed from: c1 */
    private String f77076c1;

    /* renamed from: d1 */
    private MessageId f77077d1;

    /* renamed from: com.zing.zalo.ui.zviews.RolledMediaBS$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C14963a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f77078a;

        static {
            int[] iArr = new int[EnumC31105a.values().length];
            try {
                iArr[EnumC31105a.f143333t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31105a.f143336w.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC31105a.f143334u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC31105a.f143330q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC31105a.f143332s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f77078a = iArr;
        }
    }

    /* renamed from: KL */
    private final void m83776KL() {
        setIdTracking("rolled_media_bottom_sheet");
        C30111x1 c30111x1 = this.f77075b1;
        C30111x1 c30111x12 = null;
        if (c30111x1 == null) {
            AbstractC19074t.m100223u("binding");
            c30111x1 = null;
        }
        c30111x1.f139866q.setIdTracking("rolled_media_btn_primary");
        C30111x1 c30111x13 = this.f77075b1;
        if (c30111x13 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30111x12 = c30111x13;
        }
        c30111x12.f139867r.setIdTracking("rolled_media_btn_tertiary");
    }

    /* renamed from: LL */
    private final void m83777LL() {
        CreateMediaStoreParam createMediaStoreParam;
        C30111x1 c30111x1;
        boolean z11;
        MyCloudMessageItem m124385h;
        MediaStoreItem m17604H;
        m90533zL(EnumC17017m.HUG_CONTENT);
        C30111x1 c30111x12 = this.f77075b1;
        if (c30111x12 == null) {
            AbstractC19074t.m100223u("binding");
            c30111x12 = null;
        }
        c30111x12.f139870u.setNestedScrollingEnabled(true);
        MessageId messageId = this.f77077d1;
        if (messageId == null) {
            close();
            return;
        }
        final C19059j0 c19059j0 = new C19059j0();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            createMediaStoreParam = (CreateMediaStoreParam) m92642L3.getParcelable("mediaStoreParam");
        } else {
            createMediaStoreParam = null;
        }
        if (createMediaStoreParam != null && (m17604H = AbstractC23306f.m120569C0().m17791p(createMediaStoreParam).m17604H(messageId)) != null) {
            c19059j0.f94941p = m17604H.m40599m();
        }
        if (c19059j0.f94941p == null) {
            C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(messageId);
            c19059j0.f94941p = m2635r;
            if (m2635r != null && m2635r.m94889F6() && (m124385h = AbstractC23306f.m120605O0().m124385h(messageId)) != null) {
                c19059j0.f94941p = m124385h.m71033m();
            }
        }
        if (c19059j0.f94941p == null) {
            close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.md0
            @Override // java.lang.Runnable
            public final void run() {
                RolledMediaBS.m83778ML(RolledMediaBS.this);
            }
        };
        Runnable runnable2 = new Runnable() { // from class: com.zing.zalo.ui.zviews.nd0
            @Override // java.lang.Runnable
            public final void run() {
                RolledMediaBS.m83779NL(C19059j0.this, this);
            }
        };
        EnumC31127w enumC31127w = EnumC31127w.f143379p;
        InterfaceC27218a m92676n2 = m92676n2();
        C17945a0 c17945a0 = (C17945a0) c19059j0.f94941p;
        C30111x1 c30111x13 = this.f77075b1;
        if (c30111x13 == null) {
            AbstractC19074t.m100223u("binding");
            c30111x1 = null;
        } else {
            c30111x1 = c30111x13;
        }
        C31126v c31126v = new C31126v(enumC31127w, m92676n2, c17945a0, c30111x1, runnable, runnable2);
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null) {
            z11 = m92642L32.getBoolean("isMultiMediaMessages");
        } else {
            z11 = false;
        }
        c31126v.m151201h(z11);
        AbstractC31125u.m151151I(c31126v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ML */
    public static final void m83778ML(RolledMediaBS rolledMediaBS) {
        AbstractC19074t.m100208f(rolledMediaBS, "this$0");
        rolledMediaBS.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NL */
    public static final void m83779NL(C19059j0 c19059j0, RolledMediaBS rolledMediaBS) {
        AbstractC19074t.m100208f(c19059j0, "$message");
        AbstractC19074t.m100208f(rolledMediaBS, "this$0");
        int i11 = C14963a.f77078a[AbstractC31111g.m151139t((C17945a0) c19059j0.f94941p).ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) {
                C30111x1 c30111x1 = rolledMediaBS.f77075b1;
                if (c30111x1 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30111x1 = null;
                }
                Context context = c30111x1.getRoot().getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                AbstractC31111g.m151122c(context, (C17945a0) c19059j0.f94941p, true);
                return;
            }
            return;
        }
        String m94983Q3 = ((C17945a0) c19059j0.f94941p).m94983Q3();
        AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
        if (!TextUtils.isEmpty(m94983Q3) && ((C17945a0) c19059j0.f94941p).m94893G1(m94983Q3)) {
            try {
                try {
                    AbstractC23152n3.m119036c0(rolledMediaBS.getContext(), new C20556f(m94983Q3));
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                rolledMediaBS.close();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        String str = "";
        if (m92642L3 != null) {
            String string = m92642L3.getString("conversationId", "");
            if (string != null) {
                str = string;
            }
            this.f77076c1 = str;
            this.f77077d1 = (MessageId) m92642L3.getParcelable("messageId");
            return;
        }
        this.f77076c1 = "";
        this.f77077d1 = null;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        C30111x1 c30111x1 = this.f77075b1;
        if (c30111x1 == null) {
            AbstractC19074t.m100223u("binding");
            c30111x1 = null;
        }
        ScrollView scrollView = c30111x1.f139870u;
        AbstractC19074t.m100207e(scrollView, "rolledMediaScrollView");
        return scrollView;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30111x1 m148675c = C30111x1.m148675c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148675c, "inflate(...)");
        this.f77075b1 = m148675c;
        m83776KL();
        m83777LL();
    }
}
