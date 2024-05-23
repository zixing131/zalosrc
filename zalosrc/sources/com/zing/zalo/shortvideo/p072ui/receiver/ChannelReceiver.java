package com.zing.zalo.shortvideo.p072ui.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.C24848g0;
import w00.AbstractC28684a;

/* loaded from: classes5.dex */
public final class ChannelReceiver extends BaseBroadcastReceiver {
    public static final C10062a Companion = new C10062a(null);

    /* renamed from: e */
    private final InterfaceC18505l f52390e;

    /* renamed from: f */
    private final InterfaceC18509p f52391f;

    /* renamed from: g */
    private final InterfaceC18509p f52392g;

    /* renamed from: h */
    private final InterfaceC18509p f52393h;

    /* renamed from: i */
    private final InterfaceC18509p f52394i;

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.ChannelReceiver$a */
    /* loaded from: classes5.dex */
    public static final class C10062a {
        private C10062a() {
        }

        public /* synthetic */ C10062a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m53694a(String str, PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(str, "channelId");
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            AbstractC28684a.Companion.m143692z().mo146375n(str, personalizeChannel.m51104c());
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_CHANNEL_BLOCKED");
            intent.putExtra("id", str);
            intent.putExtra("state", personalizeChannel.m51103b());
            c10061a.m53688a(intent);
            m53697d(str, personalizeChannel);
        }

        /* renamed from: b */
        public final void m53695b(String str) {
            AbstractC19074t.m100208f(str, "channelId");
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_CHANNEL_CHANGED");
            intent.putExtra("id", str);
            c10061a.m53688a(intent);
        }

        /* renamed from: c */
        public final void m53696c(String str, PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(str, "channelId");
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            AbstractC28684a.Companion.m143692z().mo146375n(str, personalizeChannel.m51104c());
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_CHANNEL_FOLLOWING");
            intent.putExtra("id", str);
            intent.putExtra("state", personalizeChannel.m51104c());
            c10061a.m53688a(intent);
            m53697d(str, personalizeChannel);
        }

        /* renamed from: d */
        public final void m53697d(String str, PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(str, "channelId");
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_CHANNEL_PERSONALIZE");
            intent.putExtra("id", str);
            intent.putExtra("data", personalizeChannel);
            c10061a.m53688a(intent);
        }

        /* renamed from: e */
        public final void m53698e(String str, String str2) {
            AbstractC19074t.m100208f(str, "channelId");
            AbstractC19074t.m100208f(str2, "videoId");
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_CHANNEL_REMOVED");
            intent.putExtra("id", str);
            intent.putExtra("videoId", str2);
            c10061a.m53688a(intent);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.ChannelReceiver$b */
    /* loaded from: classes5.dex */
    static final class C10063b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52396r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10063b(Intent intent) {
            super(0);
            this.f52396r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53699a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53699a() {
            InterfaceC18505l m53690i = ChannelReceiver.this.m53690i();
            if (m53690i != null) {
                String stringExtra = this.f52396r.getStringExtra("id");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                m53690i.mo205i9(stringExtra);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.ChannelReceiver$c */
    /* loaded from: classes5.dex */
    static final class C10064c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52398r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10064c(Intent intent) {
            super(0);
            this.f52398r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53700a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53700a() {
            InterfaceC18509p m53693l = ChannelReceiver.this.m53693l();
            if (m53693l != null) {
                String stringExtra = this.f52398r.getStringExtra("id");
                String str = "";
                if (stringExtra == null) {
                    stringExtra = "";
                }
                String stringExtra2 = this.f52398r.getStringExtra("videoId");
                if (stringExtra2 != null) {
                    str = stringExtra2;
                }
                m53693l.mo240pC(stringExtra, str);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.ChannelReceiver$d */
    /* loaded from: classes5.dex */
    static final class C10065d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52400r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10065d(Intent intent) {
            super(0);
            this.f52400r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53701a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53701a() {
            InterfaceC18509p m53689h = ChannelReceiver.this.m53689h();
            if (m53689h != null) {
                String stringExtra = this.f52400r.getStringExtra("id");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                m53689h.mo240pC(stringExtra, Boolean.valueOf(this.f52400r.getBooleanExtra("state", false)));
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.ChannelReceiver$e */
    /* loaded from: classes5.dex */
    static final class C10066e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52402r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10066e(Intent intent) {
            super(0);
            this.f52402r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53702a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53702a() {
            InterfaceC18509p m53691j = ChannelReceiver.this.m53691j();
            if (m53691j != null) {
                String stringExtra = this.f52402r.getStringExtra("id");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                m53691j.mo240pC(stringExtra, Boolean.valueOf(this.f52402r.getBooleanExtra("state", false)));
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.ChannelReceiver$f */
    /* loaded from: classes5.dex */
    static final class C10067f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52404r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10067f(Intent intent) {
            super(0);
            this.f52404r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53703a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53703a() {
            InterfaceC18509p m53692k = ChannelReceiver.this.m53692k();
            if (m53692k != null) {
                String stringExtra = this.f52404r.getStringExtra("id");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                Parcelable parcelableExtra = this.f52404r.getParcelableExtra("data");
                AbstractC19074t.m100205c(parcelableExtra);
                m53692k.mo240pC(stringExtra, parcelableExtra);
            }
        }
    }

    public ChannelReceiver() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver
    /* renamed from: c */
    protected IntentFilter mo53684c() {
        IntentFilter intentFilter = new IntentFilter();
        if (this.f52390e != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_CHANNEL_CHANGED");
        }
        if (this.f52391f != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_CHANNEL_REMOVED");
        }
        if (this.f52392g != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_CHANNEL_BLOCKED");
        }
        if (this.f52393h != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_CHANNEL_FOLLOWING");
        }
        if (this.f52394i != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_CHANNEL_PERSONALIZE");
        }
        return intentFilter;
    }

    /* renamed from: h */
    public final InterfaceC18509p m53689h() {
        return this.f52392g;
    }

    /* renamed from: i */
    public final InterfaceC18505l m53690i() {
        return this.f52390e;
    }

    /* renamed from: j */
    public final InterfaceC18509p m53691j() {
        return this.f52393h;
    }

    /* renamed from: k */
    public final InterfaceC18509p m53692k() {
        return this.f52394i;
    }

    /* renamed from: l */
    public final InterfaceC18509p m53693l() {
        return this.f52391f;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -883763725:
                    if (action.equals("com.zing.zalo.shortvideo.ACTION_CHANNEL_PERSONALIZE")) {
                        m53686e(new C10067f(intent));
                        return;
                    }
                    return;
                case -798806736:
                    if (action.equals("com.zing.zalo.shortvideo.ACTION_CHANNEL_FOLLOWING")) {
                        m53686e(new C10066e(intent));
                        return;
                    }
                    return;
                case -429769653:
                    if (action.equals("com.zing.zalo.shortvideo.ACTION_CHANNEL_BLOCKED")) {
                        m53686e(new C10065d(intent));
                        return;
                    }
                    return;
                case 330611987:
                    if (action.equals("com.zing.zalo.shortvideo.ACTION_CHANNEL_CHANGED")) {
                        m53686e(new C10063b(intent));
                        return;
                    }
                    return;
                case 683504319:
                    if (action.equals("com.zing.zalo.shortvideo.ACTION_CHANNEL_REMOVED")) {
                        m53686e(new C10064c(intent));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public /* synthetic */ ChannelReceiver(InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, InterfaceC18509p interfaceC18509p2, InterfaceC18509p interfaceC18509p3, InterfaceC18509p interfaceC18509p4, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : interfaceC18505l, (i11 & 2) != 0 ? null : interfaceC18509p, (i11 & 4) != 0 ? null : interfaceC18509p2, (i11 & 8) != 0 ? null : interfaceC18509p3, (i11 & 16) != 0 ? null : interfaceC18509p4);
    }

    public ChannelReceiver(InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, InterfaceC18509p interfaceC18509p2, InterfaceC18509p interfaceC18509p3, InterfaceC18509p interfaceC18509p4) {
        this.f52390e = interfaceC18505l;
        this.f52391f = interfaceC18509p;
        this.f52392g = interfaceC18509p2;
        this.f52393h = interfaceC18509p3;
        this.f52394i = interfaceC18509p4;
    }
}
