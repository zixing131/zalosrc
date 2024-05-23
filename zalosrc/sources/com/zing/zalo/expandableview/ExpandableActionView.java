package com.zing.zalo.expandableview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.InterfaceC1801w;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import jg0.AbstractC21249d;
import mn.C23361d;
import mn.InterfaceC23362e;
import p173fz.C19172a;
import p663xz.C30226b;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import pn.C24871b;
import pn.ViewOnClickListenerC24872c;

/* loaded from: classes3.dex */
public final class ExpandableActionView extends FrameLayout {

    /* renamed from: p */
    private final InterfaceC24854k f43824p;

    /* renamed from: q */
    private final InterfaceC24854k f43825q;

    /* renamed from: r */
    private final InterfaceC24854k f43826r;

    /* renamed from: s */
    private final InterfaceC24854k f43827s;

    /* renamed from: com.zing.zalo.expandableview.ExpandableActionView$a */
    /* loaded from: classes3.dex */
    static final class C8013a extends AbstractC19075u implements InterfaceC18494a {
        C8013a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24871b mo12V4() {
            View rootView = ExpandableActionView.this.getRootView();
            AbstractC19074t.m100207e(rootView, "getRootView(...)");
            return new C24871b(rootView, C19172a.f95269a, ExpandableActionView.this.getResourcesProvider(), null, 8, null);
        }
    }

    /* renamed from: com.zing.zalo.expandableview.ExpandableActionView$b */
    /* loaded from: classes3.dex */
    static final class C8014b extends AbstractC19075u implements InterfaceC18494a {
        C8014b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewOnClickListenerC24872c mo12V4() {
            View rootView = ExpandableActionView.this.getRootView();
            AbstractC19074t.m100207e(rootView, "getRootView(...)");
            return new ViewOnClickListenerC24872c(rootView, ExpandableActionView.this.getViewCreator(), ExpandableActionView.this.getCameraViewController(), ExpandableActionView.this.getResourcesProvider(), null, 16, null);
        }
    }

    /* renamed from: com.zing.zalo.expandableview.ExpandableActionView$c */
    /* loaded from: classes3.dex */
    static final class C8015c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f43830q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8015c(Context context) {
            super(0);
            this.f43830q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C30226b mo12V4() {
            Context applicationContext = this.f43830q.getApplicationContext();
            AbstractC19074t.m100207e(applicationContext, "getApplicationContext(...)");
            return new C30226b(applicationContext);
        }
    }

    /* renamed from: com.zing.zalo.expandableview.ExpandableActionView$d */
    /* loaded from: classes3.dex */
    static final class C8016d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f43831q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8016d(Context context) {
            super(0);
            this.f43831q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23361d mo12V4() {
            return new C23361d(this.f43831q);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C24871b getCameraViewController() {
        return (C24871b) this.f43826r.getValue();
    }

    private final ViewOnClickListenerC24872c getController() {
        return (ViewOnClickListenerC24872c) this.f43827s.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C30226b getResourcesProvider() {
        return (C30226b) this.f43825q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C23361d getViewCreator() {
        return (C23361d) this.f43824p.getValue();
    }

    /* renamed from: d */
    public final boolean m43190d() {
        return getController().m129302o();
    }

    /* renamed from: e */
    public final void m43191e(InterfaceC23362e interfaceC23362e, InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC23362e, "handler");
        AbstractC19074t.m100208f(interfaceC1801w, "lifecycleOwner");
        getController().m129304u(interfaceC1801w, interfaceC23362e);
    }

    public final View getActionContainerView() {
        return getController().m122809j();
    }

    public final void setCameraSelectedFilterCateId(long j11) {
        getController().mo129267h(j11);
    }

    public /* synthetic */ ExpandableActionView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableActionView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C8016d(context));
        this.f43824p = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C8015c(context));
        this.f43825q = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C8013a());
        this.f43826r = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C8014b());
        this.f43827s = m129210a4;
        View.inflate(context, AbstractC21249d.view_camera_action_expandable, this);
    }
}
