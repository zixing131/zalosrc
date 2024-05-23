package com.zing.zalo.p077ui.storage;

import ac.C0708i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.text.AbstractC1463b;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.C19669z;
import hu.C20128b;
import j30.C20912a;
import k30.C21459a;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import p227i3.C20218v;
import p269jj.C21275a;
import p348mi.AbstractC23306f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ta0.C26613c;

/* loaded from: classes6.dex */
public final class WarningLowStorageBanner extends FrameLayout implements View.OnClickListener {
    public static final C13315a Companion = new C13315a(null);

    /* renamed from: p */
    private final InterfaceC24854k f68415p;

    /* renamed from: q */
    private final InterfaceC24854k f68416q;

    /* renamed from: r */
    private final InterfaceC24854k f68417r;

    /* renamed from: s */
    private final InterfaceC24854k f68418s;

    /* renamed from: t */
    private final InterfaceC24854k f68419t;

    /* renamed from: u */
    private final InterfaceC24854k f68420u;

    /* renamed from: v */
    private final InterfaceC24854k f68421v;

    /* renamed from: w */
    private final InterfaceC24854k f68422w;

    /* renamed from: x */
    private final InterfaceC24854k f68423x;

    /* renamed from: y */
    private final InterfaceC24854k f68424y;

    /* renamed from: z */
    private final InterfaceC24854k f68425z;

    /* renamed from: com.zing.zalo.ui.storage.WarningLowStorageBanner$a */
    /* loaded from: classes6.dex */
    public static final class C13315a {
        private C13315a() {
        }

        public /* synthetic */ C13315a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.storage.WarningLowStorageBanner$b */
    /* loaded from: classes6.dex */
    static final class C13316b extends AbstractC19075u implements InterfaceC18494a {
        C13316b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Button mo12V4() {
            return (Button) WarningLowStorageBanner.this.findViewById(AbstractC6918a0.btn_action);
        }
    }

    /* renamed from: com.zing.zalo.ui.storage.WarningLowStorageBanner$c */
    /* loaded from: classes6.dex */
    static final class C13317c extends AbstractC19075u implements InterfaceC18494a {
        C13317c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Button mo12V4() {
            return (Button) WarningLowStorageBanner.this.findViewById(AbstractC6918a0.btn_skip);
        }
    }

    /* renamed from: com.zing.zalo.ui.storage.WarningLowStorageBanner$d */
    /* loaded from: classes6.dex */
    static final class C13318d extends AbstractC19075u implements InterfaceC18494a {
        C13318d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Button mo12V4() {
            return (Button) WarningLowStorageBanner.this.findViewById(AbstractC6918a0.btn_view_help_page);
        }
    }

    /* renamed from: com.zing.zalo.ui.storage.WarningLowStorageBanner$e */
    /* loaded from: classes6.dex */
    static final class C13319e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13319e f68429q = new C13319e();

        C13319e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C21275a mo12V4() {
            return AbstractC23306f.m120583H();
        }
    }

    /* renamed from: com.zing.zalo.ui.storage.WarningLowStorageBanner$f */
    /* loaded from: classes6.dex */
    static final class C13320f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13320f f68430q = new C13320f();

        C13320f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf((int) C21459a.m111034b(C20128b.m104764k()));
        }
    }

    /* renamed from: com.zing.zalo.ui.storage.WarningLowStorageBanner$g */
    /* loaded from: classes6.dex */
    static final class C13321g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13321g f68431q = new C13321g();

        C13321g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C19669z mo12V4() {
            return AbstractC23306f.m120572D0();
        }
    }

    /* renamed from: com.zing.zalo.ui.storage.WarningLowStorageBanner$h */
    /* loaded from: classes6.dex */
    static final class C13322h extends AbstractC19075u implements InterfaceC18494a {
        C13322h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RelativeLayout mo12V4() {
            return (RelativeLayout) WarningLowStorageBanner.this.findViewById(AbstractC6918a0.rl_root);
        }
    }

    /* renamed from: com.zing.zalo.ui.storage.WarningLowStorageBanner$i */
    /* loaded from: classes6.dex */
    static final class C13323i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13323i f68433q = new C13323i();

        C13323i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C20912a mo12V4() {
            return AbstractC23306f.m120732z1();
        }
    }

    /* renamed from: com.zing.zalo.ui.storage.WarningLowStorageBanner$j */
    /* loaded from: classes6.dex */
    static final class C13324j extends AbstractC19075u implements InterfaceC18494a {
        C13324j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0708i mo12V4() {
            C0708i c0708i = new C0708i();
            c0708i.m1072c("free_storage", WarningLowStorageBanner.this.getFreeSize());
            return c0708i;
        }
    }

    /* renamed from: com.zing.zalo.ui.storage.WarningLowStorageBanner$k */
    /* loaded from: classes6.dex */
    static final class C13325k extends AbstractC19075u implements InterfaceC18494a {
        C13325k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RobotoTextView mo12V4() {
            return (RobotoTextView) WarningLowStorageBanner.this.findViewById(AbstractC6918a0.tv_desc);
        }
    }

    /* renamed from: com.zing.zalo.ui.storage.WarningLowStorageBanner$l */
    /* loaded from: classes6.dex */
    static final class C13326l extends AbstractC19075u implements InterfaceC18494a {
        C13326l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RobotoTextView mo12V4() {
            return (RobotoTextView) WarningLowStorageBanner.this.findViewById(AbstractC6918a0.tv_desc_2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WarningLowStorageBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: b */
    private final void m74745b() {
        getMessageManager().m103211X0(false);
        getMessageManager().m103198O0();
        C26613c.f126018a.m136637c("storage_almost_banner", "close_banner", getFreeSize());
    }

    /* renamed from: c */
    private final void m74746c() {
        AbstractC23152n3.m119078x0(getContext());
        C26613c.f126018a.m136637c("storage_almost_banner", "direct_os_manage_storage", getFreeSize());
    }

    /* renamed from: d */
    private final void m74747d() {
        m74745b();
    }

    /* renamed from: e */
    private final void m74748e() {
        AbstractC23152n3.m119050j0(getContext(), getCommonRepo().m110204g().m116311c());
        C26613c.f126018a.m136637c("storage_almost_banner", "direct_help_center", getFreeSize());
    }

    /* renamed from: f */
    private final void m74749f() {
        getBtnSkip().setOnClickListener(this);
        getBtnAction().setOnClickListener(this);
        getBtnViewHelpPage().setOnClickListener(this);
    }

    /* renamed from: g */
    private final void m74750g() {
        getBtnSkip().setIdTracking("close_banner");
        getBtnSkip().setTrackingExtraData(getTrackingExtraData());
        getBtnAction().setIdTracking("clean_device_storage_button");
        getBtnAction().setTrackingExtraData(getTrackingExtraData());
        getBtnViewHelpPage().setIdTracking("direct_to_clean_storage_help_center");
        getBtnViewHelpPage().setTrackingExtraData(getTrackingExtraData());
        C26613c.f126018a.m136638d("almost_full_storage_banner", getFreeSize());
    }

    private final Button getBtnAction() {
        Object value = this.f68418s.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (Button) value;
    }

    private final Button getBtnSkip() {
        Object value = this.f68415p.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (Button) value;
    }

    private final Button getBtnViewHelpPage() {
        Object value = this.f68419t.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (Button) value;
    }

    private final C21275a getCommonRepo() {
        return (C21275a) this.f68421v.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getFreeSize() {
        return ((Number) this.f68424y.getValue()).intValue();
    }

    private final C19669z getMessageManager() {
        return (C19669z) this.f68423x.getValue();
    }

    private final RelativeLayout getRlRoot() {
        Object value = this.f68420u.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RelativeLayout) value;
    }

    private final C20912a getStorageConfigs() {
        return (C20912a) this.f68422w.getValue();
    }

    private final C0708i getTrackingExtraData() {
        return (C0708i) this.f68425z.getValue();
    }

    private final RobotoTextView getTvDesc() {
        Object value = this.f68416q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RobotoTextView) value;
    }

    private final RobotoTextView getTvDesc2() {
        Object value = this.f68417r.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RobotoTextView) value;
    }

    /* renamed from: h */
    private final void m74751h() {
        getRlRoot().setClipToOutline(true);
        getTvDesc().setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_warning_full_storage_banner_desc, Integer.valueOf(getStorageConfigs().m109399c())));
        getTvDesc2().setText(AbstractC1463b.m7440a(AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_full_storage_banner_desc_2), 0));
        if (AbstractC23152n3.m119051k(getContext())) {
            getBtnViewHelpPage().setVisibility(8);
            getBtnAction().setVisibility(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        if (AbstractC19074t.m100204b(view, getBtnSkip())) {
            m74747d();
        } else if (AbstractC19074t.m100204b(view, getBtnAction())) {
            m74746c();
        } else if (AbstractC19074t.m100204b(view, getBtnViewHelpPage())) {
            m74748e();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m74751h();
        m74750g();
        m74749f();
    }

    public /* synthetic */ WarningLowStorageBanner(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WarningLowStorageBanner(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        InterfaceC24854k m129210a8;
        InterfaceC24854k m129210a9;
        InterfaceC24854k m129210a10;
        InterfaceC24854k m129210a11;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C13317c());
        this.f68415p = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C13325k());
        this.f68416q = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C13326l());
        this.f68417r = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C13316b());
        this.f68418s = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new C13318d());
        this.f68419t = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(new C13322h());
        this.f68420u = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(C13319e.f68429q);
        this.f68421v = m129210a7;
        m129210a8 = AbstractC24856m.m129210a(C13323i.f68433q);
        this.f68422w = m129210a8;
        m129210a9 = AbstractC24856m.m129210a(C13321g.f68431q);
        this.f68423x = m129210a9;
        m129210a10 = AbstractC24856m.m129210a(C13320f.f68430q);
        this.f68424y = m129210a10;
        m129210a11 = AbstractC24856m.m129210a(new C13324j());
        this.f68425z = m129210a11;
    }
}
