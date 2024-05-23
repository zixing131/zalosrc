package com.zing.zalo.p077ui.backuprestore.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c50.C3294e;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.backuprestore.widget.SyncStateView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import p320ld.C22447s;

/* loaded from: classes5.dex */
public final class SyncProcessorView extends LinearLayout implements SyncStateView.InterfaceC11148a {

    /* renamed from: p */
    private SyncStateView f56128p;

    /* renamed from: q */
    private InterfaceC11146a f56129q;

    /* renamed from: r */
    private final C3294e f56130r;

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.SyncProcessorView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11146a {

        /* renamed from: com.zing.zalo.ui.backuprestore.widget.SyncProcessorView$a$a */
        /* loaded from: classes5.dex */
        public static final class a {
            /* renamed from: a */
            public static /* synthetic */ void m58408a(InterfaceC11146a interfaceC11146a, int i11, int i12, int i13, Object obj) {
                if (obj == null) {
                    if ((i13 & 2) != 0) {
                        i12 = 0;
                    }
                    interfaceC11146a.mo57326r(i11, i12);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleSyncActionCommon");
            }
        }

        /* renamed from: r */
        void mo57326r(int i11, int i12);

        /* renamed from: u */
        void mo57331u();
    }

    public SyncProcessorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f56130r = new C3294e(0, 0, null, 0, false, 31, null);
        m58403b(context);
    }

    /* renamed from: b */
    private final void m58403b(Context context) {
        View.inflate(context, AbstractC7409c0.sync_processor_view, this);
        View findViewById = findViewById(AbstractC6918a0.sync_state_msg);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        SyncStateView syncStateView = (SyncStateView) findViewById;
        this.f56128p = syncStateView;
        if (syncStateView == null) {
            AbstractC19074t.m100223u("syncStateView");
            syncStateView = null;
        }
        syncStateView.setEventListener(this);
        m58406d();
    }

    /* renamed from: c */
    private final void m58404c(SyncStateView syncStateView, C3294e c3294e) {
        boolean z11;
        if (syncStateView.getVisibility() != 0) {
            return;
        }
        syncStateView.setState(c3294e.m16713a());
        syncStateView.m58425f();
        try {
            syncStateView.m58426g(c3294e.m16715c());
            if (C22447s.m116028c0(c3294e.m16713a())) {
                syncStateView.m58428k();
            } else {
                syncStateView.m58427j(c3294e.m16716d(), c3294e.m16714b());
            }
            if (syncStateView.getState() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            syncStateView.m58429p(z11);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncStateView.InterfaceC11148a
    /* renamed from: a */
    public void mo58405a(SyncStateView syncStateView, int i11) {
        AbstractC19074t.m100208f(syncStateView, "syncStateView");
        InterfaceC11146a interfaceC11146a = this.f56129q;
        if (interfaceC11146a != null) {
            InterfaceC11146a.a.m58408a(interfaceC11146a, i11, 0, 2, null);
        }
    }

    /* renamed from: d */
    public final void m58406d() {
        SyncStateView syncStateView = this.f56128p;
        if (syncStateView == null) {
            AbstractC19074t.m100223u("syncStateView");
            syncStateView = null;
        }
        m58404c(syncStateView, this.f56130r);
    }

    public final InterfaceC11146a getEventListener() {
        return this.f56129q;
    }

    public final C3294e getSyncStateData() {
        return this.f56130r;
    }

    public final void setEventListener(InterfaceC11146a interfaceC11146a) {
        this.f56129q = interfaceC11146a;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.widget.SyncStateView.InterfaceC11148a
    /* renamed from: u */
    public void mo58407u() {
        InterfaceC11146a interfaceC11146a = this.f56129q;
        if (interfaceC11146a != null) {
            interfaceC11146a.mo57331u();
        }
    }
}
