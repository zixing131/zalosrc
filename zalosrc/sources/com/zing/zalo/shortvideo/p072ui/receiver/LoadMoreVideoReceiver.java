package com.zing.zalo.shortvideo.p072ui.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* loaded from: classes5.dex */
public final class LoadMoreVideoReceiver extends BaseBroadcastReceiver {
    public static final C10080a Companion = new C10080a(null);

    /* renamed from: e */
    private final InterfaceC18509p f52432e;

    /* renamed from: f */
    private final InterfaceC18511r f52433f;

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.LoadMoreVideoReceiver$a */
    /* loaded from: classes5.dex */
    public static final class C10080a {
        private C10080a() {
        }

        public /* synthetic */ C10080a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m53733a(String str, String str2) {
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_LOAD_MORE_DATA");
            intent.putExtra("id", str);
            intent.putExtra("uuid", str2);
            c10061a.m53688a(intent);
        }

        /* renamed from: b */
        public final void m53734b(String str, int i11, String str2, String str3) {
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "uuid");
            AbstractC19074t.m100208f(str3, "videoId");
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_SCROLL_TO_POSITION");
            intent.putExtra("id", str);
            intent.putExtra("position", i11);
            intent.putExtra("uuid", str2);
            intent.putExtra("videoId", str3);
            c10061a.m53688a(intent);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.LoadMoreVideoReceiver$b */
    /* loaded from: classes5.dex */
    static final class C10081b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52435r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10081b(Intent intent) {
            super(0);
            this.f52435r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53735a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53735a() {
            InterfaceC18509p m53731h = LoadMoreVideoReceiver.this.m53731h();
            if (m53731h != null) {
                String stringExtra = this.f52435r.getStringExtra("id");
                String str = "";
                if (stringExtra == null) {
                    stringExtra = "";
                }
                String stringExtra2 = this.f52435r.getStringExtra("uuid");
                if (stringExtra2 != null) {
                    str = stringExtra2;
                }
                m53731h.mo240pC(stringExtra, str);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.LoadMoreVideoReceiver$c */
    /* loaded from: classes5.dex */
    static final class C10082c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52437r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10082c(Intent intent) {
            super(0);
            this.f52437r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53736a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53736a() {
            InterfaceC18511r m53732i = LoadMoreVideoReceiver.this.m53732i();
            if (m53732i != null) {
                String stringExtra = this.f52437r.getStringExtra("id");
                String str = "";
                if (stringExtra == null) {
                    stringExtra = "";
                }
                Integer valueOf = Integer.valueOf(this.f52437r.getIntExtra("position", -1));
                String stringExtra2 = this.f52437r.getStringExtra("uuid");
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                String stringExtra3 = this.f52437r.getStringExtra("videoId");
                if (stringExtra3 != null) {
                    str = stringExtra3;
                }
                m53732i.mo49340Uc(stringExtra, valueOf, stringExtra2, str);
            }
        }
    }

    public LoadMoreVideoReceiver() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver
    /* renamed from: c */
    protected IntentFilter mo53684c() {
        IntentFilter intentFilter = new IntentFilter();
        if (this.f52432e != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_LOAD_MORE_DATA");
        }
        if (this.f52433f != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_SCROLL_TO_POSITION");
        }
        return intentFilter;
    }

    /* renamed from: h */
    public final InterfaceC18509p m53731h() {
        return this.f52432e;
    }

    /* renamed from: i */
    public final InterfaceC18511r m53732i() {
        return this.f52433f;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != 645968128) {
                if (hashCode == 1404433472 && action.equals("com.zing.zalo.shortvideo.ACTION_SCROLL_TO_POSITION")) {
                    m53686e(new C10082c(intent));
                    return;
                }
                return;
            }
            if (action.equals("com.zing.zalo.shortvideo.ACTION_LOAD_MORE_DATA")) {
                m53686e(new C10081b(intent));
            }
        }
    }

    public /* synthetic */ LoadMoreVideoReceiver(InterfaceC18509p interfaceC18509p, InterfaceC18511r interfaceC18511r, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : interfaceC18509p, (i11 & 2) != 0 ? null : interfaceC18511r);
    }

    public LoadMoreVideoReceiver(InterfaceC18509p interfaceC18509p, InterfaceC18511r interfaceC18511r) {
        this.f52432e = interfaceC18509p;
        this.f52433f = interfaceC18511r;
    }
}
