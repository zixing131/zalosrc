package com.zing.zalo.expandableview.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import jg0.AbstractC21249d;
import p367nn.C23886a;
import p367nn.InterfaceC23889d;
import p367nn.InterfaceC23890e;
import p367nn.InterfaceC23891f;
import p367nn.ViewOnClickListenerC23887b;
import p663xz.C30226b;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes3.dex */
public final class CameraActionButton extends FrameLayout {

    /* renamed from: p */
    private final InterfaceC24854k f43832p;

    /* renamed from: q */
    private final InterfaceC24854k f43833q;

    /* renamed from: com.zing.zalo.expandableview.button.CameraActionButton$a */
    /* loaded from: classes3.dex */
    static final class C8017a extends AbstractC19075u implements InterfaceC18494a {
        C8017a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewOnClickListenerC23887b mo12V4() {
            View rootView = CameraActionButton.this.getRootView();
            AbstractC19074t.m100207e(rootView, "getRootView(...)");
            return new ViewOnClickListenerC23887b(rootView, CameraActionButton.this.getResourcesProvider());
        }
    }

    /* renamed from: com.zing.zalo.expandableview.button.CameraActionButton$b */
    /* loaded from: classes3.dex */
    static final class C8018b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f43835q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8018b(Context context) {
            super(0);
            this.f43835q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C30226b mo12V4() {
            Context applicationContext = this.f43835q.getApplicationContext();
            AbstractC19074t.m100207e(applicationContext, "getApplicationContext(...)");
            return new C30226b(applicationContext);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    private final ViewOnClickListenerC23887b getController() {
        return (ViewOnClickListenerC23887b) this.f43833q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C30226b getResourcesProvider() {
        return (C30226b) this.f43832p.getValue();
    }

    /* renamed from: b */
    public final void m43197b(C23886a c23886a, InterfaceC23889d interfaceC23889d, InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(c23886a, "config");
        AbstractC19074t.m100208f(interfaceC23889d, "listener");
        AbstractC19074t.m100208f(interfaceC1801w, "lifecycleOwner");
        getController().m124971f(c23886a, interfaceC23889d, interfaceC1801w);
    }

    /* renamed from: c */
    public final void m43198c(C23886a c23886a, InterfaceC23890e interfaceC23890e, InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(c23886a, "config");
        AbstractC19074t.m100208f(interfaceC23890e, "handler");
        AbstractC19074t.m100208f(interfaceC1801w, "lifecycleOwner");
        getController().m124972g(c23886a, interfaceC23890e, interfaceC1801w);
    }

    /* renamed from: d */
    public final void m43199d(C23886a c23886a, InterfaceC23891f interfaceC23891f, InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(c23886a, "config");
        AbstractC19074t.m100208f(interfaceC23891f, "handler");
        AbstractC19074t.m100208f(interfaceC1801w, "lifecycleOwner");
        getController().m124973h(c23886a, interfaceC23891f, interfaceC1801w);
    }

    public final void setButtonBackgroundResource(int i11) {
        getController().m124974i(i11);
    }

    public /* synthetic */ CameraActionButton(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraActionButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C8018b(context));
        this.f43832p = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C8017a());
        this.f43833q = m129210a2;
        View.inflate(context, AbstractC21249d.view_camera_action_button, this);
        setMinimumWidth(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
    }
}
