package com.zing.zalo.shortvideo.p072ui.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* loaded from: classes5.dex */
public final class CommentReceiver extends BaseBroadcastReceiver {
    public static final C10068a Companion = new C10068a(null);

    /* renamed from: e */
    private final InterfaceC18510q f52405e;

    /* renamed from: f */
    private final InterfaceC18510q f52406f;

    /* renamed from: g */
    private final InterfaceC18509p f52407g;

    /* renamed from: h */
    private final InterfaceC18509p f52408h;

    /* renamed from: i */
    private InterfaceC18505l f52409i;

    /* renamed from: j */
    private InterfaceC18505l f52410j;

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.CommentReceiver$a */
    /* loaded from: classes5.dex */
    public static final class C10068a {
        private C10068a() {
        }

        public /* synthetic */ C10068a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m53710a(String str, long j11) {
            AbstractC19074t.m100208f(str, "sourceId");
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_COMMENT_COUNT");
            intent.putExtra("source", str);
            intent.putExtra("data", j11);
            c10061a.m53688a(intent);
        }

        /* renamed from: b */
        public final void m53711b(String str, String str2) {
            AbstractC19074t.m100208f(str, "sourceId");
            AbstractC19074t.m100208f(str2, "commentId");
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_COMMENT_REMOVE");
            intent.putExtra("source", str);
            intent.putExtra("id", str2);
            c10061a.m53688a(intent);
        }

        /* renamed from: c */
        public final void m53712c(int i11) {
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_COMMENT_SWITCH");
            intent.putExtra(ZinstantMetaConstant.IMPRESSION_META_TYPE, i11);
            c10061a.m53688a(intent);
        }

        /* renamed from: d */
        public final void m53713d(String str, String str2, boolean z11) {
            AbstractC19074t.m100208f(str, "sourceId");
            AbstractC19074t.m100208f(str2, "commentId");
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_COMMENT_LIKE");
            intent.putExtra("source", str);
            intent.putExtra("id", str2);
            intent.putExtra("state", z11);
            c10061a.m53688a(intent);
        }

        /* renamed from: e */
        public final void m53714e(String str, String str2, long j11) {
            AbstractC19074t.m100208f(str, "sourceId");
            AbstractC19074t.m100208f(str2, "commentId");
            BaseBroadcastReceiver.C10061a c10061a = BaseBroadcastReceiver.Companion;
            Intent intent = new Intent("com.zing.zalo.shortvideo.ACTION_COMMENT_REPLIES");
            intent.putExtra("source", str);
            intent.putExtra("id", str2);
            intent.putExtra("data", j11);
            c10061a.m53688a(intent);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.CommentReceiver$b */
    /* loaded from: classes5.dex */
    static final class C10069b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52412r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10069b(Intent intent) {
            super(0);
            this.f52412r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53715a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53715a() {
            InterfaceC18510q m53708l = CommentReceiver.this.m53708l();
            if (m53708l != null) {
                String stringExtra = this.f52412r.getStringExtra("source");
                String str = "";
                if (stringExtra == null) {
                    stringExtra = "";
                }
                String stringExtra2 = this.f52412r.getStringExtra("id");
                if (stringExtra2 != null) {
                    str = stringExtra2;
                }
                m53708l.mo45599Hr(stringExtra, str, Boolean.valueOf(this.f52412r.getBooleanExtra("state", false)));
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.CommentReceiver$c */
    /* loaded from: classes5.dex */
    static final class C10070c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52414r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10070c(Intent intent) {
            super(0);
            this.f52414r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53716a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53716a() {
            InterfaceC18510q m53709m = CommentReceiver.this.m53709m();
            if (m53709m != null) {
                String stringExtra = this.f52414r.getStringExtra("source");
                String str = "";
                if (stringExtra == null) {
                    stringExtra = "";
                }
                String stringExtra2 = this.f52414r.getStringExtra("id");
                if (stringExtra2 != null) {
                    str = stringExtra2;
                }
                m53709m.mo45599Hr(stringExtra, str, Long.valueOf(this.f52414r.getLongExtra("data", 0L)));
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.CommentReceiver$d */
    /* loaded from: classes5.dex */
    static final class C10071d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52416r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10071d(Intent intent) {
            super(0);
            this.f52416r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53717a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53717a() {
            InterfaceC18509p m53704h = CommentReceiver.this.m53704h();
            if (m53704h != null) {
                String stringExtra = this.f52416r.getStringExtra("source");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                m53704h.mo240pC(stringExtra, Long.valueOf(this.f52416r.getLongExtra("data", 0L)));
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.CommentReceiver$e */
    /* loaded from: classes5.dex */
    static final class C10072e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52418r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10072e(Intent intent) {
            super(0);
            this.f52418r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53718a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53718a() {
            InterfaceC18509p m53705i = CommentReceiver.this.m53705i();
            if (m53705i != null) {
                String stringExtra = this.f52418r.getStringExtra("source");
                String str = "";
                if (stringExtra == null) {
                    stringExtra = "";
                }
                String stringExtra2 = this.f52418r.getStringExtra("id");
                if (stringExtra2 != null) {
                    str = stringExtra2;
                }
                m53705i.mo240pC(stringExtra, str);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.CommentReceiver$f */
    /* loaded from: classes5.dex */
    static final class C10073f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52420r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10073f(Intent intent) {
            super(0);
            this.f52420r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53719a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53719a() {
            InterfaceC18505l m53706j = CommentReceiver.this.m53706j();
            if (m53706j != null) {
                Parcelable parcelableExtra = this.f52420r.getParcelableExtra("data");
                AbstractC19074t.m100205c(parcelableExtra);
                m53706j.mo205i9(parcelableExtra);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.receiver.CommentReceiver$g */
    /* loaded from: classes5.dex */
    static final class C10074g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Intent f52422r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10074g(Intent intent) {
            super(0);
            this.f52422r = intent;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53720a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53720a() {
            InterfaceC18505l m53707k = CommentReceiver.this.m53707k();
            if (m53707k != null) {
                m53707k.mo205i9(Integer.valueOf(this.f52422r.getIntExtra(ZinstantMetaConstant.IMPRESSION_META_TYPE, 1)));
            }
        }
    }

    public CommentReceiver() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.receiver.BaseBroadcastReceiver
    /* renamed from: c */
    protected IntentFilter mo53684c() {
        IntentFilter intentFilter = new IntentFilter();
        if (this.f52405e != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_COMMENT_LIKE");
        }
        if (this.f52406f != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_COMMENT_REPLIES");
        }
        if (this.f52407g != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_COMMENT_COUNT");
        }
        if (this.f52408h != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_COMMENT_REMOVE");
        }
        if (this.f52409i != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_COMMENT_BLOCK");
        }
        if (this.f52410j != null) {
            intentFilter.addAction("com.zing.zalo.shortvideo.ACTION_COMMENT_SWITCH");
        }
        return intentFilter;
    }

    /* renamed from: h */
    public final InterfaceC18509p m53704h() {
        return this.f52407g;
    }

    /* renamed from: i */
    public final InterfaceC18509p m53705i() {
        return this.f52408h;
    }

    /* renamed from: j */
    public final InterfaceC18505l m53706j() {
        return this.f52409i;
    }

    /* renamed from: k */
    public final InterfaceC18505l m53707k() {
        return this.f52410j;
    }

    /* renamed from: l */
    public final InterfaceC18510q m53708l() {
        return this.f52405e;
    }

    /* renamed from: m */
    public final InterfaceC18510q m53709m() {
        return this.f52406f;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case 175254280:
                    if (action.equals("com.zing.zalo.shortvideo.ACTION_COMMENT_BLOCK")) {
                        m53686e(new C10073f(intent));
                        return;
                    }
                    return;
                case 176273290:
                    if (action.equals("com.zing.zalo.shortvideo.ACTION_COMMENT_COUNT")) {
                        m53686e(new C10071d(intent));
                        return;
                    }
                    return;
                case 1589469513:
                    if (action.equals("com.zing.zalo.shortvideo.ACTION_COMMENT_REMOVE")) {
                        m53686e(new C10072e(intent));
                        return;
                    }
                    return;
                case 1634607097:
                    if (action.equals("com.zing.zalo.shortvideo.ACTION_COMMENT_SWITCH")) {
                        m53686e(new C10074g(intent));
                        return;
                    }
                    return;
                case 1668516252:
                    if (action.equals("com.zing.zalo.shortvideo.ACTION_COMMENT_LIKE")) {
                        m53686e(new C10069b(intent));
                        return;
                    }
                    return;
                case 2031583427:
                    if (action.equals("com.zing.zalo.shortvideo.ACTION_COMMENT_REPLIES")) {
                        m53686e(new C10070c(intent));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public /* synthetic */ CommentReceiver(InterfaceC18510q interfaceC18510q, InterfaceC18510q interfaceC18510q2, InterfaceC18509p interfaceC18509p, InterfaceC18509p interfaceC18509p2, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : interfaceC18510q, (i11 & 2) != 0 ? null : interfaceC18510q2, (i11 & 4) != 0 ? null : interfaceC18509p, (i11 & 8) != 0 ? null : interfaceC18509p2, (i11 & 16) != 0 ? null : interfaceC18505l, (i11 & 32) != 0 ? null : interfaceC18505l2);
    }

    public CommentReceiver(InterfaceC18510q interfaceC18510q, InterfaceC18510q interfaceC18510q2, InterfaceC18509p interfaceC18509p, InterfaceC18509p interfaceC18509p2, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2) {
        this.f52405e = interfaceC18510q;
        this.f52406f = interfaceC18510q2;
        this.f52407g = interfaceC18509p;
        this.f52408h = interfaceC18509p2;
        this.f52409i = interfaceC18505l;
        this.f52410j = interfaceC18505l2;
    }
}
