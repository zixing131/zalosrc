package com.zing.zalo.shortvideo.p072ui.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* loaded from: classes5.dex */
public final class NotificationReceiver extends BaseBroadcastReceiver {
    public static final C10088a Companion = new C10088a(null);

    /* renamed from: e */
    private final InterfaceC18494a f52448e;

    /* renamed from: f */
    private final InterfaceC18505l f52449f;

    /* renamed from: g */
    private final InterfaceC18509p f52450g;

    /* renamed from: h */
    private final InterfaceC18509p f52451h;

    /* renamed from: i */
    private final InterfaceC18509p f52452i;

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.NotificationReceiver$a */
    /* loaded from: classes5.dex */
    public static final class C10088a {
        private C10088a() {
        }

        public /* synthetic */ C10088a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m53753a(boolean z11, String str) {
            AbstractC19074t.m100208f(str, "id");
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_SHOW_RED_DOT_CATEGORIES_NOTI");
            intent.putExtra("show", z11);
            intent.putExtra("id", str);
            c10061a.m53688a(intent);
        }

        /* renamed from: b */
        public final void m53754b(boolean z11, boolean z12) {
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_SHOW_RED_DOT_CHANNEL_NOTI");
            intent.putExtra("fromSystem", z11);
            intent.putExtra("show", z12);
            c10061a.m53688a(intent);
        }

        /* renamed from: c */
        public final void m53755c(boolean z11) {
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_SHOW_RED_DOT_PROFILE");
            intent.putExtra("show", z11);
            c10061a.m53688a(intent);
        }

        /* renamed from: d */
        public final void m53756d(boolean z11, boolean z12) {
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_SHOW_RED_DOT_USER_NOTI");
            intent.putExtra("fromSystem", z11);
            intent.putExtra("show", z12);
            c10061a.m53688a(intent);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.NotificationReceiver$b */
    /* loaded from: classes5.dex */
    static final class C10089b extends AbstractC19075u implements InterfaceC18494a {
        C10089b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53757a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53757a() {
            InterfaceC18494a m53748h = NotificationReceiver.this.m53748h();
            if (m53748h != null) {
                m53748h.mo12V4();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.NotificationReceiver$c */
    /* loaded from: classes5.dex */
    static final class C10090c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52455r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10090c(Intent intent) {
            super(0);
            this.f52455r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53758a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53758a() {
            InterfaceC18505l m53751k = NotificationReceiver.this.m53751k();
            if (m53751k != null) {
                m53751k.mo205i9(Boolean.valueOf(this.f52455r.getBooleanExtra("show", false)));
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.NotificationReceiver$d */
    /* loaded from: classes5.dex */
    static final class C10091d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52457r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10091d(Intent intent) {
            super(0);
            this.f52457r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53759a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53759a() {
            InterfaceC18509p m53750j = NotificationReceiver.this.m53750j();
            if (m53750j != null) {
                m53750j.mo240pC(Boolean.valueOf(this.f52457r.getBooleanExtra("fromSystem", false)), Boolean.valueOf(this.f52457r.getBooleanExtra("show", false)));
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.NotificationReceiver$e */
    /* loaded from: classes5.dex */
    static final class C10092e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52459r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10092e(Intent intent) {
            super(0);
            this.f52459r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53760a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53760a() {
            InterfaceC18509p m53752l = NotificationReceiver.this.m53752l();
            if (m53752l != null) {
                m53752l.mo240pC(Boolean.valueOf(this.f52459r.getBooleanExtra("fromSystem", false)), Boolean.valueOf(this.f52459r.getBooleanExtra("show", false)));
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.NotificationReceiver$f */
    /* loaded from: classes5.dex */
    static final class C10093f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52461r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10093f(Intent intent) {
            super(0);
            this.f52461r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53761a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53761a() {
            InterfaceC18509p m53749i = NotificationReceiver.this.m53749i();
            if (m53749i != null) {
                Boolean valueOf = Boolean.valueOf(this.f52461r.getBooleanExtra("show", false));
                String stringExtra = this.f52461r.getStringExtra("id");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                m53749i.mo240pC(valueOf, stringExtra);
            }
        }
    }

    public NotificationReceiver() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver
    /* renamed from: c */
    protected IntentFilter mo53684c() {
        IntentFilter intentFilter = new IntentFilter();
        if (this.f52448e != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_NOTI_NEW");
        }
        if (this.f52449f != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_SHOW_RED_DOT_PROFILE");
        }
        if (this.f52450g != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_SHOW_RED_DOT_CHANNEL_NOTI");
        }
        if (this.f52451h != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_SHOW_RED_DOT_USER_NOTI");
        }
        if (this.f52452i != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_SHOW_RED_DOT_CATEGORIES_NOTI");
        }
        return intentFilter;
    }

    /* renamed from: h */
    public final InterfaceC18494a m53748h() {
        return this.f52448e;
    }

    /* renamed from: i */
    public final InterfaceC18509p m53749i() {
        return this.f52452i;
    }

    /* renamed from: j */
    public final InterfaceC18509p m53750j() {
        return this.f52450g;
    }

    /* renamed from: k */
    public final InterfaceC18505l m53751k() {
        return this.f52449f;
    }

    /* renamed from: l */
    public final InterfaceC18509p m53752l() {
        return this.f52451h;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -2147429528:
                    if (action.equals("com.zing.zalo.shortvideo.ACTION_SHOW_RED_DOT_PROFILE")) {
                        m53686e(new C10090c(intent));
                        return;
                    }
                    return;
                case -721164791:
                    if (action.equals("com.zing.zalo.shortvideo.ACTION_SHOW_RED_DOT_USER_NOTI")) {
                        m53686e(new C10092e(intent));
                        return;
                    }
                    return;
                case -484733160:
                    if (action.equals("com.zing.zalo.shortvideo.ACTION_SHOW_RED_DOT_CATEGORIES_NOTI")) {
                        m53686e(new C10093f(intent));
                        return;
                    }
                    return;
                case -140934317:
                    if (action.equals("com.zing.zalo.shortvideo.ACTION_SHOW_RED_DOT_CHANNEL_NOTI")) {
                        m53686e(new C10091d(intent));
                        return;
                    }
                    return;
                case 2015754300:
                    if (action.equals("com.zing.zalo.shortvideo.ACTION_NOTI_NEW")) {
                        m53686e(new C10089b());
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public /* synthetic */ NotificationReceiver(InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, InterfaceC18509p interfaceC18509p2, InterfaceC18509p interfaceC18509p3, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : interfaceC18494a, (i11 & 2) != 0 ? null : interfaceC18505l, (i11 & 4) != 0 ? null : interfaceC18509p, (i11 & 8) != 0 ? null : interfaceC18509p2, (i11 & 16) != 0 ? null : interfaceC18509p3);
    }

    public NotificationReceiver(InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, InterfaceC18509p interfaceC18509p2, InterfaceC18509p interfaceC18509p3) {
        this.f52448e = interfaceC18494a;
        this.f52449f = interfaceC18505l;
        this.f52450g = interfaceC18509p;
        this.f52451h = interfaceC18509p2;
        this.f52452i = interfaceC18509p3;
    }
}
