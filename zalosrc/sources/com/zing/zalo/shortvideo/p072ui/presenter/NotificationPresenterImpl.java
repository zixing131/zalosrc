package com.zing.zalo.shortvideo.p072ui.presenter;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.receiver.CommentReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import f10.EnumC18694f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19726j;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22798t0;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class NotificationPresenterImpl extends BasePresenterImpl<InterfaceC22798t0> implements InterfaceC19726j {

    /* renamed from: r */
    private final InterfaceC18170g f51905r;

    /* renamed from: s */
    private boolean f51906s;

    /* renamed from: t */
    private boolean f51907t;

    /* renamed from: u */
    private int f51908u;

    /* renamed from: v */
    private String f51909v;

    /* renamed from: w */
    private String f51910w;

    /* renamed from: x */
    private final HashMap f51911x;

    /* renamed from: y */
    private NetworkReceiver f51912y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.NotificationPresenterImpl$a */
    /* loaded from: classes5.dex */
    public static final class C9922a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51913t;

        C9922a(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51913t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return (Section) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                return (Section) obj;
            }
            AbstractC24862s.m129228b(obj);
            String str = NotificationPresenterImpl.this.f51909v;
            if (AbstractC19074t.m100204b(str, "SOURCE_CHANNEL")) {
                InterfaceC18170g interfaceC18170g = NotificationPresenterImpl.this.f51905r;
                String str2 = NotificationPresenterImpl.this.f51910w;
                this.f51913t = 1;
                obj = InterfaceC18170g.a.m96634d(interfaceC18170g, str2, null, this, 2, null);
                if (obj == m142578e) {
                    return m142578e;
                }
                return (Section) obj;
            }
            if (AbstractC19074t.m100204b(str, "SOURCE_USER")) {
                InterfaceC18170g interfaceC18170g2 = NotificationPresenterImpl.this.f51905r;
                String str3 = NotificationPresenterImpl.this.f51910w;
                this.f51913t = 2;
                obj = InterfaceC18170g.a.m96638h(interfaceC18170g2, str3, null, this, 2, null);
                if (obj == m142578e) {
                    return m142578e;
                }
                return (Section) obj;
            }
            return new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
        }

        /* renamed from: r */
        public final Continuation m53333r(Continuation continuation) {
            return new C9922a(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9922a) m53333r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.NotificationPresenterImpl$b */
    /* loaded from: classes5.dex */
    public static final class C9923b extends AbstractC19075u implements InterfaceC18505l {
        C9923b() {
            super(1);
        }

        /* renamed from: a */
        public final void m53335a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22798t0) NotificationPresenterImpl.this.m52968s()).mo54620Wn(th2);
            NotificationPresenterImpl.this.f51907t = false;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53335a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.NotificationPresenterImpl$c */
    /* loaded from: classes5.dex */
    public static final class C9924c extends AbstractC19075u implements InterfaceC18505l {
        C9924c() {
            super(1);
        }

        /* renamed from: a */
        public final void m53336a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            NotificationPresenterImpl.this.f51906s = true;
            NotificationPresenterImpl.this.f51907t = false;
            ((InterfaceC22798t0) NotificationPresenterImpl.this.m52968s()).mo54616A7(section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53336a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.NotificationPresenterImpl$d */
    /* loaded from: classes5.dex */
    public static final class C9925d extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51917t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f51919v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9925d(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f51919v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51917t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return (Section) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                return (Section) obj;
            }
            AbstractC24862s.m129228b(obj);
            String str = NotificationPresenterImpl.this.f51909v;
            if (AbstractC19074t.m100204b(str, "SOURCE_CHANNEL")) {
                InterfaceC18170g interfaceC18170g = NotificationPresenterImpl.this.f51905r;
                String str2 = NotificationPresenterImpl.this.f51910w;
                LoadMoreInfo loadMoreInfo = this.f51919v;
                this.f51917t = 1;
                obj = interfaceC18170g.mo96566M(str2, loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
                return (Section) obj;
            }
            if (AbstractC19074t.m100204b(str, "SOURCE_USER")) {
                InterfaceC18170g interfaceC18170g2 = NotificationPresenterImpl.this.f51905r;
                String str3 = NotificationPresenterImpl.this.f51910w;
                LoadMoreInfo loadMoreInfo2 = this.f51919v;
                this.f51917t = 2;
                obj = interfaceC18170g2.mo96552C0(str3, loadMoreInfo2, this);
                if (obj == m142578e) {
                    return m142578e;
                }
                return (Section) obj;
            }
            return new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
        }

        /* renamed from: r */
        public final Continuation m53337r(Continuation continuation) {
            return new C9925d(this.f51919v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9925d) m53337r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.NotificationPresenterImpl$e */
    /* loaded from: classes5.dex */
    public static final class C9926e extends AbstractC19075u implements InterfaceC18505l {
        C9926e() {
            super(1);
        }

        /* renamed from: a */
        public final void m53339a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            NotificationPresenterImpl.this.f51908u = 0;
            ((InterfaceC22798t0) NotificationPresenterImpl.this.m52968s()).mo54620Wn(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53339a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.NotificationPresenterImpl$f */
    /* loaded from: classes5.dex */
    public static final class C9927f extends AbstractC19075u implements InterfaceC18505l {
        C9927f() {
            super(1);
        }

        /* renamed from: a */
        public final void m53340a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            if (!section.m51168m().isEmpty() || section.m51171p() == null || NotificationPresenterImpl.this.f51908u >= 3) {
                NotificationPresenterImpl.this.f51908u = 0;
                ((InterfaceC22798t0) NotificationPresenterImpl.this.m52968s()).mo54618Cm(section);
                return;
            }
            NotificationPresenterImpl.this.f51908u++;
            NotificationPresenterImpl notificationPresenterImpl = NotificationPresenterImpl.this;
            LoadMoreInfo m51171p = section.m51171p();
            AbstractC19074t.m100205c(m51171p);
            notificationPresenterImpl.mo53326a(m51171p);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53340a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.NotificationPresenterImpl$g */
    /* loaded from: classes5.dex */
    static final class C9928g extends AbstractC19075u implements InterfaceC18494a {
        C9928g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53341a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53341a() {
            if (!NotificationPresenterImpl.this.f51906s && !NotificationPresenterImpl.this.f51907t) {
                NotificationPresenterImpl.this.mo53331i();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.NotificationPresenterImpl$h */
    /* loaded from: classes5.dex */
    static final class C9929h extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51923t;

        /* renamed from: v */
        final /* synthetic */ String f51925v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9929h(String str, Continuation continuation) {
            super(1, continuation);
            this.f51925v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51923t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = NotificationPresenterImpl.this.f51905r;
                String str = this.f51925v;
                this.f51923t = 1;
                obj = InterfaceC18170g.a.m96631a(interfaceC18170g, str, null, null, null, null, null, this, 62, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53342r(Continuation continuation) {
            return new C9929h(this.f51925v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9929h) m53342r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.NotificationPresenterImpl$i */
    /* loaded from: classes5.dex */
    static final class C9930i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f51927r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9930i(String str) {
            super(1);
            this.f51927r = str;
        }

        /* renamed from: a */
        public final void m53344a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22798t0) NotificationPresenterImpl.this.m52968s()).mo54632xB("", this.f51927r, null, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53344a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.NotificationPresenterImpl$j */
    /* loaded from: classes5.dex */
    static final class C9931j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f51929r;

        /* renamed from: s */
        final /* synthetic */ String f51930s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9931j(String str, String str2) {
            super(1);
            this.f51929r = str;
            this.f51930s = str2;
        }

        /* renamed from: a */
        public final void m53345a(PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            ((InterfaceC22798t0) NotificationPresenterImpl.this.m52968s()).mo54632xB(this.f51929r, this.f51930s, personalizeChannel, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53345a((PersonalizeChannel) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.NotificationPresenterImpl$k */
    /* loaded from: classes5.dex */
    public static final class C9932k extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51931t;

        /* renamed from: u */
        final /* synthetic */ boolean f51932u;

        /* renamed from: v */
        final /* synthetic */ NotificationPresenterImpl f51933v;

        /* renamed from: w */
        final /* synthetic */ String f51934w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9932k(boolean z11, NotificationPresenterImpl notificationPresenterImpl, String str, Continuation continuation) {
            super(1, continuation);
            this.f51932u = z11;
            this.f51933v = notificationPresenterImpl;
            this.f51934w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51931t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return (EnumC18694f) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                return (EnumC18694f) obj;
            }
            AbstractC24862s.m129228b(obj);
            if (this.f51932u) {
                InterfaceC18170g interfaceC18170g = this.f51933v.f51905r;
                String str = this.f51934w;
                this.f51931t = 1;
                obj = interfaceC18170g.mo96604m(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
                return (EnumC18694f) obj;
            }
            InterfaceC18170g interfaceC18170g2 = this.f51933v.f51905r;
            String str2 = this.f51934w;
            this.f51931t = 2;
            obj = interfaceC18170g2.mo96576W(str2, this);
            if (obj == m142578e) {
                return m142578e;
            }
            return (EnumC18694f) obj;
        }

        /* renamed from: r */
        public final Continuation m53346r(Continuation continuation) {
            return new C9932k(this.f51932u, this.f51933v, this.f51934w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9932k) m53346r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.NotificationPresenterImpl$l */
    /* loaded from: classes5.dex */
    public static final class C9933l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f51936r;

        /* renamed from: s */
        final /* synthetic */ boolean f51937s;

        /* renamed from: t */
        final /* synthetic */ String f51938t;

        /* renamed from: u */
        final /* synthetic */ String f51939u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9933l(String str, boolean z11, String str2, String str3) {
            super(1);
            this.f51936r = str;
            this.f51937s = z11;
            this.f51938t = str2;
            this.f51939u = str3;
        }

        /* renamed from: a */
        public final void m53348a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            if (AbstractC19074t.m100204b(NotificationPresenterImpl.this.f51911x.remove(this.f51936r), Boolean.valueOf(this.f51937s))) {
                CommentReceiver.Companion.m53713d(this.f51938t, this.f51936r, !this.f51937s);
                ((InterfaceC22798t0) NotificationPresenterImpl.this.m52968s()).mo54631vi(this.f51939u, this.f51936r, !this.f51937s, th2);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53348a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.NotificationPresenterImpl$m */
    /* loaded from: classes5.dex */
    public static final class C9934m extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f51941r;

        /* renamed from: s */
        final /* synthetic */ boolean f51942s;

        /* renamed from: t */
        final /* synthetic */ String f51943t;

        /* renamed from: u */
        final /* synthetic */ String f51944u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9934m(String str, boolean z11, String str2, String str3) {
            super(1);
            this.f51941r = str;
            this.f51942s = z11;
            this.f51943t = str2;
            this.f51944u = str3;
        }

        /* renamed from: a */
        public final void m53349a(EnumC18694f enumC18694f) {
            AbstractC19074t.m100208f(enumC18694f, "it");
            if (!AbstractC19074t.m100204b(NotificationPresenterImpl.this.f51911x.remove(this.f51941r), Boolean.valueOf(this.f51942s))) {
                NotificationPresenterImpl.this.mo53329f6(this.f51943t, this.f51944u, this.f51941r, !this.f51942s);
                ((InterfaceC22798t0) NotificationPresenterImpl.this.m52968s()).mo54631vi(this.f51944u, this.f51941r, !this.f51942s, null);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53349a((EnumC18694f) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.NotificationPresenterImpl$n */
    /* loaded from: classes5.dex */
    static final class C9935n extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51945t;

        /* renamed from: v */
        final /* synthetic */ String f51947v;

        /* renamed from: w */
        final /* synthetic */ Comment f51948w;

        /* renamed from: x */
        final /* synthetic */ String f51949x;

        /* renamed from: y */
        final /* synthetic */ String f51950y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9935n(String str, Comment comment, String str2, String str3, Continuation continuation) {
            super(1, continuation);
            this.f51947v = str;
            this.f51948w = comment;
            this.f51949x = str2;
            this.f51950y = str3;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            Integer num;
            String str2;
            Integer num2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51945t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC24862s.m129228b(obj);
            InterfaceC18170g interfaceC18170g = NotificationPresenterImpl.this.f51905r;
            String str3 = this.f51947v;
            String m50854d = this.f51948w.m50838l().m50854d();
            int m50856f = this.f51948w.m50838l().m50856f();
            Comment.Identity m50834h = this.f51948w.m50834h();
            String str4 = null;
            if (m50834h != null) {
                str = m50834h.m50854d();
            } else {
                str = null;
            }
            Comment.Identity m50834h2 = this.f51948w.m50834h();
            if (m50834h2 != null) {
                num = AbstractC29094b.m145341c(m50834h2.m50856f());
            } else {
                num = null;
            }
            String str5 = this.f51949x;
            Video m50828b = this.f51948w.m50828b();
            if (m50828b != null) {
                str2 = m50828b.m52911t();
            } else {
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                num2 = AbstractC29094b.m145341c(3);
            } else {
                num2 = null;
            }
            Video m50828b2 = this.f51948w.m50828b();
            if (m50828b2 != null) {
                str4 = m50828b2.m52911t();
            }
            String str6 = this.f51950y;
            this.f51945t = 1;
            Object m96644n = InterfaceC18170g.a.m96644n(interfaceC18170g, str3, m50854d, m50856f, str, num, str5, num2, str4, null, null, null, null, str6, this, 3840, null);
            if (m96644n == m142578e) {
                return m142578e;
            }
            return m96644n;
        }

        /* renamed from: r */
        public final Continuation m53350r(Continuation continuation) {
            return new C9935n(this.f51947v, this.f51948w, this.f51949x, this.f51950y, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9935n) m53350r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.NotificationPresenterImpl$o */
    /* loaded from: classes5.dex */
    static final class C9936o extends AbstractC19075u implements InterfaceC18505l {
        C9936o() {
            super(1);
        }

        /* renamed from: a */
        public final void m53352a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22798t0) NotificationPresenterImpl.this.m52968s()).mo54617CD(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53352a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.NotificationPresenterImpl$p */
    /* loaded from: classes5.dex */
    static final class C9937p extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f51953r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9937p(String str) {
            super(1);
            this.f51953r = str;
        }

        /* renamed from: a */
        public final void m53353a(Comment comment) {
            AbstractC19074t.m100208f(comment, "result");
            ((InterfaceC22798t0) NotificationPresenterImpl.this.m52968s()).mo54633zo(this.f51953r, comment, false);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53353a((Comment) obj);
            return C24848g0.f119245a;
        }
    }

    public NotificationPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepo");
        this.f51905r = interfaceC18170g;
        this.f51909v = "";
        this.f51910w = "";
        this.f51911x = new HashMap();
        this.f51912y = new NetworkReceiver(null, new C9928g(), 1, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Xy */
    public void mo8647Xy(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        this.f51911x.clear();
        super.mo8647Xy(interfaceC1801w);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        if (((InterfaceC22798t0) m52968s()).getContext() != null) {
            this.f51912y.mo53687g();
        }
        super.mo8648Zv(interfaceC1801w);
    }

    @Override // h20.InterfaceC19726j
    /* renamed from: a */
    public void mo53326a(LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(loadMoreInfo, "next");
        m52966n(new C9925d(loadMoreInfo, null), new C9926e(), new C9927f());
    }

    @Override // h20.InterfaceC19726j
    /* renamed from: aG */
    public void mo53327aG(String str, Comment comment) {
        String m50831e;
        AbstractC19074t.m100208f(comment, "comment");
        String m50839m = comment.m50839m();
        if (m50839m == null || (m50831e = comment.m50831e()) == null) {
            return;
        }
        m52966n(new C9935n(m50839m, comment, m50831e, str, null), new C9936o(), new C9937p(str));
    }

    @Override // h20.InterfaceC19726j
    /* renamed from: f */
    public String mo53328f() {
        return this.f51910w;
    }

    @Override // h20.InterfaceC19726j
    /* renamed from: f6 */
    public void mo53329f6(String str, String str2, String str3, boolean z11) {
        AbstractC19074t.m100208f(str, "sourceId");
        AbstractC19074t.m100208f(str2, "notifyId");
        AbstractC19074t.m100208f(str3, "commentId");
        CommentReceiver.Companion.m53713d(str, str3, z11);
        if (this.f51911x.put(str3, Boolean.valueOf(z11)) != null) {
            return;
        }
        m52966n(new C9932k(z11, this, str3, null), new C9933l(str3, z11, str, str2), new C9934m(str3, z11, str, str2));
    }

    @Override // h20.InterfaceC19726j
    /* renamed from: h */
    public String mo53330h() {
        return this.f51909v;
    }

    @Override // h20.InterfaceC19726j
    /* renamed from: i */
    public void mo53331i() {
        this.f51907t = true;
        m52966n(new C9922a(null), new C9923b(), new C9924c());
    }

    @Override // h20.InterfaceC19726j
    /* renamed from: mf */
    public void mo53332mf(String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(str, "sourceId");
        AbstractC19074t.m100208f(str2, "channelName");
        AbstractC19074t.m100208f(str3, "notifyId");
        AbstractC19074t.m100208f(str4, "channelId");
        m52966n(new C9929h(str4, null), new C9930i(str2), new C9931j(str3, str2));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10053a
    /* renamed from: uo */
    public void mo52970uo(Bundle bundle) {
        String string;
        String string2;
        if (bundle != null && (string2 = bundle.getString("xID")) != null) {
            this.f51910w = string2;
        }
        if (bundle != null && (string = bundle.getString("xSource")) != null) {
            this.f51909v = string;
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8650wC(interfaceC1801w);
        Context context = ((InterfaceC22798t0) m52968s()).getContext();
        if (context != null) {
            this.f51912y.mo53685d(context);
        }
        if (!this.f51906s) {
            mo53331i();
        }
    }
}
