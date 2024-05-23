package com.zing.zalo.shortvideo.p072ui.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* loaded from: classes5.dex */
public final class VideoReceiver extends BaseBroadcastReceiver {
    public static final C10094a Companion = new C10094a(null);

    /* renamed from: e */
    private final InterfaceC18505l f52462e;

    /* renamed from: f */
    private final InterfaceC18505l f52463f;

    /* renamed from: g */
    private final InterfaceC18505l f52464g;

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.VideoReceiver$a */
    /* loaded from: classes5.dex */
    public static final class C10094a {
        private C10094a() {
        }

        public /* synthetic */ C10094a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m53765a(boolean z11) {
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_VIDEO_NEW_FOLLOWING");
            intent.putExtra("data", z11);
            c10061a.m53688a(intent);
        }

        /* renamed from: b */
        public final void m53766b(boolean z11) {
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_VIDEO_NEW_FRIEND");
            intent.putExtra("data", z11);
            c10061a.m53688a(intent);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.VideoReceiver$b */
    /* loaded from: classes5.dex */
    static final class C10095b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52466r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10095b(Intent intent) {
            super(0);
            this.f52466r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53767a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53767a() {
            InterfaceC18505l m53762h = VideoReceiver.this.m53762h();
            if (m53762h != null) {
                m53762h.mo205i9(Boolean.valueOf(this.f52466r.getBooleanExtra("data", false)));
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.VideoReceiver$c */
    /* loaded from: classes5.dex */
    static final class C10096c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52468r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10096c(Intent intent) {
            super(0);
            this.f52468r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53768a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53768a() {
            InterfaceC18505l m53764j = VideoReceiver.this.m53764j();
            if (m53764j != null) {
                m53764j.mo205i9(Boolean.valueOf(this.f52468r.getBooleanExtra("data", false)));
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.VideoReceiver$d */
    /* loaded from: classes5.dex */
    static final class C10097d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52470r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10097d(Intent intent) {
            super(0);
            this.f52470r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53769a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53769a() {
            InterfaceC18505l m53763i = VideoReceiver.this.m53763i();
            if (m53763i != null) {
                m53763i.mo205i9(Boolean.valueOf(this.f52470r.getBooleanExtra("data", false)));
            }
        }
    }

    public VideoReceiver() {
        this(null, null, null, 7, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver
    /* renamed from: c */
    protected IntentFilter mo53684c() {
        IntentFilter intentFilter = new IntentFilter();
        if (this.f52462e != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_VIDEO_NEW_FOLLOWING");
        }
        if (this.f52463f != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_VIDEO_NEW_FRIEND");
        }
        if (this.f52464g != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_VIDEO_NEW_FOR_U");
        }
        return intentFilter;
    }

    /* renamed from: h */
    public final InterfaceC18505l m53762h() {
        return this.f52462e;
    }

    /* renamed from: i */
    public final InterfaceC18505l m53763i() {
        return this.f52464g;
    }

    /* renamed from: j */
    public final InterfaceC18505l m53764j() {
        return this.f52463f;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1524389338) {
                if (hashCode != -462534167) {
                    if (hashCode == 1890408887 && action.equals("com.zing.zalo.shortvideo.ACTION_VIDEO_NEW_FOR_U")) {
                        m53686e(new C10097d(intent));
                        return;
                    }
                    return;
                }
                if (action.equals("com.zing.zalo.shortvideo.ACTION_VIDEO_NEW_FOLLOWING")) {
                    m53686e(new C10095b(intent));
                    return;
                }
                return;
            }
            if (action.equals("com.zing.zalo.shortvideo.ACTION_VIDEO_NEW_FRIEND")) {
                m53686e(new C10096c(intent));
            }
        }
    }

    public /* synthetic */ VideoReceiver(InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2, InterfaceC18505l interfaceC18505l3, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : interfaceC18505l, (i11 & 2) != 0 ? null : interfaceC18505l2, (i11 & 4) != 0 ? null : interfaceC18505l3);
    }

    public VideoReceiver(InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2, InterfaceC18505l interfaceC18505l3) {
        this.f52462e = interfaceC18505l;
        this.f52463f = interfaceC18505l2;
        this.f52464g = interfaceC18505l3;
    }
}
