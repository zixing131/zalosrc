package com.zing.zalo.shortvideo.p072ui.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import pm0.C24848g0;
import q20.C25081d;
import qm0.AbstractC25332a0;

/* loaded from: classes5.dex */
public final class HeadsetReceiver extends BaseBroadcastReceiver {

    /* renamed from: e */
    private final InterfaceC10075a f52423e;

    /* renamed from: f */
    private final ArrayList f52424f;

    /* renamed from: g */
    private boolean f52425g;

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.HeadsetReceiver$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10075a {

        /* renamed from: com.zing.zalo.shortvideo.ui.receiver.HeadsetReceiver$a$a */
        /* loaded from: classes5.dex */
        public static final class a {
            /* renamed from: a */
            public static void m53725a(InterfaceC10075a interfaceC10075a, int[] iArr) {
                AbstractC19074t.m100208f(iArr, "types");
            }
        }

        /* renamed from: a */
        void mo53290a(boolean z11);

        /* renamed from: b */
        void mo53291b(int[] iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.HeadsetReceiver$b */
    /* loaded from: classes5.dex */
    public static final class C10076b extends AbstractC19075u implements InterfaceC18494a {
        C10076b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53726a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53726a() {
            InterfaceC10075a interfaceC10075a = HeadsetReceiver.this.f52423e;
            if (interfaceC10075a != null) {
                interfaceC10075a.mo53290a(HeadsetReceiver.this.f52425g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.HeadsetReceiver$c */
    /* loaded from: classes5.dex */
    public static final class C10077c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ int[] f52428r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10077c(int[] iArr) {
            super(0);
            this.f52428r = iArr;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53727a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53727a() {
            InterfaceC10075a interfaceC10075a = HeadsetReceiver.this.f52423e;
            if (interfaceC10075a != null) {
                interfaceC10075a.mo53291b(this.f52428r);
            }
        }
    }

    public HeadsetReceiver() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: j */
    private final void m53723j(Context context) {
        C25081d c25081d = C25081d.f120480a;
        if (c25081d.m130009b(context)) {
            this.f52424f.add(1);
        }
        if (c25081d.m130010c(context)) {
            this.f52424f.add(0);
        }
        m53724k();
    }

    /* renamed from: k */
    private final void m53724k() {
        int[] m131184L0;
        if (this.f52425g != (!this.f52424f.isEmpty())) {
            this.f52425g = !this.f52425g;
            m53686e(new C10076b());
        }
        m131184L0 = AbstractC25332a0.m131184L0(this.f52424f);
        m53686e(new C10077c(m131184L0));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver
    /* renamed from: b */
    protected IntentFilter mo51933b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
        return intentFilter;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver
    /* renamed from: d */
    public void mo53685d(Context context) {
        AbstractC19074t.m100208f(context, "ctx");
        this.f52424f.clear();
        this.f52425g = false;
        super.mo53685d(context);
        m53723j(context);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1676458352) {
                if (hashCode == 1123270207 && action.equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0);
                    if (intExtra != 0) {
                        if (intExtra == 2 && !this.f52424f.contains(1)) {
                            this.f52424f.add(1);
                            m53724k();
                            return;
                        }
                        return;
                    }
                    if (this.f52424f.contains(1)) {
                        this.f52424f.remove((Object) 1);
                        m53724k();
                        return;
                    }
                    return;
                }
                return;
            }
            if (action.equals("android.intent.action.HEADSET_PLUG")) {
                int intExtra2 = intent.getIntExtra("state", 0);
                if (intExtra2 != 0) {
                    if (intExtra2 == 1 && !this.f52424f.contains(0)) {
                        this.f52424f.add(0);
                        m53724k();
                        return;
                    }
                    return;
                }
                if (this.f52424f.contains(0)) {
                    this.f52424f.remove((Object) 0);
                    m53724k();
                }
            }
        }
    }

    public /* synthetic */ HeadsetReceiver(InterfaceC10075a interfaceC10075a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : interfaceC10075a);
    }

    public HeadsetReceiver(InterfaceC10075a interfaceC10075a) {
        this.f52423e = interfaceC10075a;
        this.f52424f = new ArrayList();
    }
}
