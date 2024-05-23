package com.zing.zalo.p077ui.backuprestore.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c50.C3294e;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.backuprestore.widget.SyncStateViewV2;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import p320ld.C22447s;

/* loaded from: classes5.dex */
public final class SyncProcessorViewV2 extends LinearLayout implements SyncStateViewV2.InterfaceC11150a {

    /* renamed from: p */
    private SyncStateViewV2 f56131p;

    /* renamed from: q */
    private InterfaceC11147a f56132q;

    /* renamed from: r */
    private final C3294e f56133r;

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.SyncProcessorViewV2$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11147a {

        /* renamed from: com.zing.zalo.ui.backuprestore.widget.SyncProcessorViewV2$a$a */
        /* loaded from: classes5.dex */
        public static final class a {
            /* renamed from: a */
            public static /* synthetic */ void m58414a(InterfaceC11147a interfaceC11147a, int i11, int i12, int i13, Object obj) {
                if (obj == null) {
                    if ((i13 & 2) != 0) {
                        i12 = 0;
                    }
                    interfaceC11147a.mo58206r(i11, i12);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleSyncActionCommon");
            }
        }

        /* renamed from: r */
        void mo58206r(int i11, int i12);

        /* renamed from: u */
        void mo58211u();
    }

    public SyncProcessorViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f56133r = new C3294e(0, 0, null, 0, false, 31, null);
        m58409b(context);
    }

    /* renamed from: b */
    private final void m58409b(Context context) {
        View.inflate(context, AbstractC7409c0.sync_processor_view_v2, this);
        View findViewById = findViewById(AbstractC6918a0.sync_state_msg);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        SyncStateViewV2 syncStateViewV2 = (SyncStateViewV2) findViewById;
        this.f56131p = syncStateViewV2;
        if (syncStateViewV2 == null) {
            AbstractC19074t.m100223u("syncStateView");
            syncStateViewV2 = null;
        }
        syncStateViewV2.setEventListener(this);
        m58412d();
    }

    /* renamed from: c */
    private final void m58410c(SyncStateViewV2 syncStateViewV2, C3294e c3294e) {
        boolean z11;
        if (syncStateViewV2.getVisibility() != 0) {
            return;
        }
        syncStateViewV2.setState(c3294e.m16713a());
        syncStateViewV2.m58440f();
        try {
            syncStateViewV2.m58441g(c3294e.m16715c());
            if (C22447s.m116028c0(c3294e.m16713a())) {
                syncStateViewV2.m58443k();
            } else {
                syncStateViewV2.m58442j(c3294e.m16716d(), c3294e.m16714b());
            }
            if (syncStateViewV2.getState() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            syncStateViewV2.m58444p(z11);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncStateViewV2.InterfaceC11150a
    /* renamed from: a */
    public void mo58411a(SyncStateViewV2 syncStateViewV2, int i11) {
        AbstractC19074t.m100208f(syncStateViewV2, "syncStateView");
        InterfaceC11147a interfaceC11147a = this.f56132q;
        if (interfaceC11147a != null) {
            InterfaceC11147a.a.m58414a(interfaceC11147a, i11, 0, 2, null);
        }
    }

    /* renamed from: d */
    public final void m58412d() {
        SyncStateViewV2 syncStateViewV2 = this.f56131p;
        if (syncStateViewV2 == null) {
            AbstractC19074t.m100223u("syncStateView");
            syncStateViewV2 = null;
        }
        m58410c(syncStateViewV2, this.f56133r);
    }

    public final InterfaceC11147a getEventListener() {
        return this.f56132q;
    }

    public final C3294e getSyncStateData() {
        return this.f56133r;
    }

    public final void setEventListener(InterfaceC11147a interfaceC11147a) {
        this.f56132q = interfaceC11147a;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncStateViewV2.InterfaceC11150a
    /* renamed from: u */
    public void mo58413u() {
        InterfaceC11147a interfaceC11147a = this.f56132q;
        if (interfaceC11147a != null) {
            interfaceC11147a.mo58211u();
        }
    }
}
