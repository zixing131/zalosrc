package com.zing.zalo.shortvideo.p072ui.presenter;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.PersonalizeComment;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.receiver.CommentReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import com.zing.zalo.shortvideo.utils.other.CommentSource;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import f10.EnumC18694f;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22809w;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class CommentPresenterImpl extends BasePresenterImpl<InterfaceC22809w> implements InterfaceC10055c {

    /* renamed from: A */
    private Integer f51629A;

    /* renamed from: B */
    private Integer f51630B;

    /* renamed from: r */
    private final InterfaceC18170g f51631r;

    /* renamed from: s */
    private CommentSource f51632s;

    /* renamed from: t */
    private LoadMoreInfo f51633t;

    /* renamed from: u */
    private LoadMoreInfo f51634u;

    /* renamed from: v */
    private boolean f51635v;

    /* renamed from: w */
    private NetworkReceiver f51636w;

    /* renamed from: x */
    private final HashMap f51637x;

    /* renamed from: y */
    private String f51638y;

    /* renamed from: z */
    private String f51639z;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9844a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51640t;

        /* renamed from: v */
        final /* synthetic */ String f51642v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f51643w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9844a(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f51642v = str;
            this.f51643w = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51640t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = CommentPresenterImpl.this.f51631r;
                String m56271d = CommentPresenterImpl.this.f51632s.m56271d();
                String str = this.f51642v;
                LoadMoreInfo loadMoreInfo = this.f51643w;
                this.f51640t = 1;
                obj = interfaceC18170g.mo96586d(m56271d, str, loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53128r(Continuation continuation) {
            return new C9844a(this.f51642v, this.f51643w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9844a) m53128r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C9845b extends AbstractC19075u implements InterfaceC18505l {
        C9845b() {
            super(1);
        }

        /* renamed from: a */
        public final void m53130a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22809w) CommentPresenterImpl.this.m52968s()).mo54162d(th2);
            CommentPresenterImpl.this.f51633t = null;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53130a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9846c extends AbstractC19075u implements InterfaceC18505l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ CommentPresenterImpl f51646q;

            /* renamed from: r */
            final /* synthetic */ Section f51647r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CommentPresenterImpl commentPresenterImpl, Section section) {
                super(0);
                this.f51646q = commentPresenterImpl;
                this.f51647r = section;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53132a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53132a() {
                ((InterfaceC22809w) this.f51646q.m52968s()).mo54168xn(this.f51647r);
                this.f51646q.f51633t = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$c$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ CommentPresenterImpl f51648q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(CommentPresenterImpl commentPresenterImpl) {
                super(1);
                this.f51648q = commentPresenterImpl;
            }

            /* renamed from: a */
            public final void m53133a(Throwable th2) {
                AbstractC19074t.m100208f(th2, "throwable");
                ((InterfaceC22809w) this.f51648q.m52968s()).mo54162d(th2);
                this.f51648q.f51633t = null;
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m53133a((Throwable) obj);
                return C24848g0.f119245a;
            }
        }

        C9846c() {
            super(1);
        }

        /* renamed from: a */
        public final void m53131a(Section section) {
            AbstractC19074t.m100208f(section, "section");
            if (!section.m51168m().isEmpty()) {
                CommentPresenterImpl.this.m53124M(section.m51168m(), new a(CommentPresenterImpl.this, section), new b(CommentPresenterImpl.this));
            } else {
                ((InterfaceC22809w) CommentPresenterImpl.this.m52968s()).mo54168xn(section);
                CommentPresenterImpl.this.f51633t = null;
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53131a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$d */
    /* loaded from: classes5.dex */
    public static final class C9847d extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51649t;

        /* renamed from: v */
        final /* synthetic */ HashMap f51651v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9847d(HashMap hashMap, Continuation continuation) {
            super(1, continuation);
            this.f51651v = hashMap;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            List m131185M0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51649t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = CommentPresenterImpl.this.f51631r;
                Set keySet = this.f51651v.keySet();
                AbstractC19074t.m100207e(keySet, "<get-keys>(...)");
                m131185M0 = AbstractC25332a0.m131185M0(keySet);
                this.f51649t = 1;
                obj = interfaceC18170g.mo96613q0(m131185M0, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53134r(Continuation continuation) {
            return new C9847d(this.f51651v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9847d) m53134r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$e */
    /* loaded from: classes5.dex */
    public static final class C9848e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f51652q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9848e(InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f51652q = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m53136a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            this.f51652q.mo205i9(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53136a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$f */
    /* loaded from: classes5.dex */
    public static final class C9849f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ HashMap f51653q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18494a f51654r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9849f(HashMap hashMap, InterfaceC18494a interfaceC18494a) {
            super(1);
            this.f51653q = hashMap;
            this.f51654r = interfaceC18494a;
        }

        /* renamed from: a */
        public final void m53137a(List list) {
            AbstractC19074t.m100208f(list, "results");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PersonalizeComment personalizeComment = (PersonalizeComment) it.next();
                Comment comment = (Comment) this.f51653q.get(personalizeComment.m51108a());
                if (comment != null) {
                    comment.m50811B(personalizeComment);
                }
            }
            this.f51654r.mo12V4();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53137a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$g */
    /* loaded from: classes5.dex */
    static final class C9850g extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51655t;

        /* renamed from: v */
        final /* synthetic */ Comment f51657v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f51658w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9850g(Comment comment, LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f51657v = comment;
            this.f51658w = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51655t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = CommentPresenterImpl.this.f51631r;
                String m50833g = this.f51657v.m50833g();
                LoadMoreInfo loadMoreInfo = this.f51658w;
                this.f51655t = 1;
                obj = interfaceC18170g.mo96621v(m50833g, loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53138r(Continuation continuation) {
            return new C9850g(this.f51657v, this.f51658w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9850g) m53138r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$h */
    /* loaded from: classes5.dex */
    static final class C9851h extends AbstractC19075u implements InterfaceC18505l {
        C9851h() {
            super(1);
        }

        /* renamed from: a */
        public final void m53140a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22809w) CommentPresenterImpl.this.m52968s()).mo54167xd(th2);
            CommentPresenterImpl.this.f51634u = null;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53140a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$i */
    /* loaded from: classes5.dex */
    static final class C9852i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Comment f51661r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$i$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ CommentPresenterImpl f51662q;

            /* renamed from: r */
            final /* synthetic */ Section f51663r;

            /* renamed from: s */
            final /* synthetic */ Comment f51664s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CommentPresenterImpl commentPresenterImpl, Section section, Comment comment) {
                super(0);
                this.f51662q = commentPresenterImpl;
                this.f51663r = section;
                this.f51664s = comment;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53142a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53142a() {
                ((InterfaceC22809w) this.f51662q.m52968s()).mo54166vE(this.f51663r, this.f51664s);
                this.f51662q.f51634u = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$i$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ CommentPresenterImpl f51665q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(CommentPresenterImpl commentPresenterImpl) {
                super(1);
                this.f51665q = commentPresenterImpl;
            }

            /* renamed from: a */
            public final void m53143a(Throwable th2) {
                AbstractC19074t.m100208f(th2, "throwable");
                ((InterfaceC22809w) this.f51665q.m52968s()).mo54167xd(th2);
                this.f51665q.f51634u = null;
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m53143a((Throwable) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9852i(Comment comment) {
            super(1);
            this.f51661r = comment;
        }

        /* renamed from: a */
        public final void m53141a(Section section) {
            AbstractC19074t.m100208f(section, "section");
            CommentPresenterImpl.this.m53124M(section.m51168m(), new a(CommentPresenterImpl.this, section, this.f51661r), new b(CommentPresenterImpl.this));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53141a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$j */
    /* loaded from: classes5.dex */
    static final class C9853j extends AbstractC19075u implements InterfaceC18494a {
        C9853j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53144a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53144a() {
            if (CommentPresenterImpl.this.f51635v) {
                CommentPresenterImpl.this.f51635v = false;
                ((InterfaceC22809w) CommentPresenterImpl.this.m52968s()).mo54161b(CommentPresenterImpl.this.f51635v);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$k */
    /* loaded from: classes5.dex */
    static final class C9854k extends AbstractC19075u implements InterfaceC18494a {
        C9854k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53145a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53145a() {
            if (!CommentPresenterImpl.this.f51635v) {
                CommentPresenterImpl.this.f51635v = true;
                ((InterfaceC22809w) CommentPresenterImpl.this.m52968s()).mo54161b(CommentPresenterImpl.this.f51635v);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$l */
    /* loaded from: classes5.dex */
    static final class C9855l extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51668t;

        /* renamed from: v */
        final /* synthetic */ Comment f51670v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9855l(Comment comment, Continuation continuation) {
            super(1, continuation);
            this.f51670v = comment;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51668t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = CommentPresenterImpl.this.f51631r;
                String m50833g = this.f51670v.m50833g();
                this.f51668t = 1;
                obj = interfaceC18170g.mo96581a0(m50833g, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53146r(Continuation continuation) {
            return new C9855l(this.f51670v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9855l) m53146r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$m */
    /* loaded from: classes5.dex */
    static final class C9856m extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Comment f51672r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9856m(Comment comment) {
            super(1);
            this.f51672r = comment;
        }

        /* renamed from: a */
        public final void m53148a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22809w) CommentPresenterImpl.this.m52968s()).mo54159YF(this.f51672r, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53148a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$n */
    /* loaded from: classes5.dex */
    static final class C9857n extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Comment f51674r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9857n(Comment comment) {
            super(1);
            this.f51674r = comment;
        }

        /* renamed from: a */
        public final void m53149a(EnumC18694f enumC18694f) {
            AbstractC19074t.m100208f(enumC18694f, "it");
            InterfaceC22809w.a.m117530b((InterfaceC22809w) CommentPresenterImpl.this.m52968s(), this.f51674r, null, 2, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53149a((EnumC18694f) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$o */
    /* loaded from: classes5.dex */
    public static final class C9858o extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51675t;

        /* renamed from: u */
        final /* synthetic */ boolean f51676u;

        /* renamed from: v */
        final /* synthetic */ CommentPresenterImpl f51677v;

        /* renamed from: w */
        final /* synthetic */ String f51678w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9858o(boolean z11, CommentPresenterImpl commentPresenterImpl, String str, Continuation continuation) {
            super(1, continuation);
            this.f51676u = z11;
            this.f51677v = commentPresenterImpl;
            this.f51678w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51675t;
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
            if (this.f51676u) {
                InterfaceC18170g interfaceC18170g = this.f51677v.f51631r;
                String str = this.f51678w;
                this.f51675t = 1;
                obj = interfaceC18170g.mo96604m(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
                return (EnumC18694f) obj;
            }
            InterfaceC18170g interfaceC18170g2 = this.f51677v.f51631r;
            String str2 = this.f51678w;
            this.f51675t = 2;
            obj = interfaceC18170g2.mo96576W(str2, this);
            if (obj == m142578e) {
                return m142578e;
            }
            return (EnumC18694f) obj;
        }

        /* renamed from: r */
        public final Continuation m53150r(Continuation continuation) {
            return new C9858o(this.f51676u, this.f51677v, this.f51678w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9858o) m53150r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$p */
    /* loaded from: classes5.dex */
    public static final class C9859p extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f51680r;

        /* renamed from: s */
        final /* synthetic */ boolean f51681s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9859p(String str, boolean z11) {
            super(1);
            this.f51680r = str;
            this.f51681s = z11;
        }

        /* renamed from: a */
        public final void m53152a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            if (AbstractC19074t.m100204b(CommentPresenterImpl.this.f51637x.remove(this.f51680r), Boolean.valueOf(this.f51681s))) {
                CommentReceiver.Companion.m53713d(CommentPresenterImpl.this.f51632s.m56271d(), this.f51680r, !this.f51681s);
                ((InterfaceC22809w) CommentPresenterImpl.this.m52968s()).mo54158X2(this.f51680r, !this.f51681s, th2);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53152a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$q */
    /* loaded from: classes5.dex */
    public static final class C9860q extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f51683r;

        /* renamed from: s */
        final /* synthetic */ boolean f51684s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9860q(String str, boolean z11) {
            super(1);
            this.f51683r = str;
            this.f51684s = z11;
        }

        /* renamed from: a */
        public final void m53153a(EnumC18694f enumC18694f) {
            AbstractC19074t.m100208f(enumC18694f, "it");
            if (!AbstractC19074t.m100204b(CommentPresenterImpl.this.f51637x.remove(this.f51683r), Boolean.valueOf(this.f51684s))) {
                CommentPresenterImpl.this.mo53127tI(this.f51683r, !this.f51684s);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53153a((EnumC18694f) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$r */
    /* loaded from: classes5.dex */
    static final class C9861r extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51685t;

        /* renamed from: u */
        final /* synthetic */ boolean f51686u;

        /* renamed from: v */
        final /* synthetic */ CommentPresenterImpl f51687v;

        /* renamed from: w */
        final /* synthetic */ String f51688w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9861r(boolean z11, CommentPresenterImpl commentPresenterImpl, String str, Continuation continuation) {
            super(1, continuation);
            this.f51686u = z11;
            this.f51687v = commentPresenterImpl;
            this.f51688w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51685t;
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
            if (this.f51686u) {
                InterfaceC18170g interfaceC18170g = this.f51687v.f51631r;
                String str = this.f51688w;
                this.f51685t = 1;
                obj = interfaceC18170g.mo96580a(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
                return (EnumC18694f) obj;
            }
            InterfaceC18170g interfaceC18170g2 = this.f51687v.f51631r;
            String str2 = this.f51688w;
            this.f51685t = 2;
            obj = interfaceC18170g2.mo96614r(str2, this);
            if (obj == m142578e) {
                return m142578e;
            }
            return (EnumC18694f) obj;
        }

        /* renamed from: r */
        public final Continuation m53154r(Continuation continuation) {
            return new C9861r(this.f51686u, this.f51687v, this.f51688w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9861r) m53154r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$s */
    /* loaded from: classes5.dex */
    static final class C9862s extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ boolean f51690r;

        /* renamed from: s */
        final /* synthetic */ String f51691s;

        /* renamed from: t */
        final /* synthetic */ int f51692t;

        /* renamed from: u */
        final /* synthetic */ Integer f51693u;

        /* renamed from: v */
        final /* synthetic */ String f51694v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9862s(boolean z11, String str, int i11, Integer num, String str2) {
            super(1);
            this.f51690r = z11;
            this.f51691s = str;
            this.f51692t = i11;
            this.f51693u = num;
            this.f51694v = str2;
        }

        /* renamed from: a */
        public final void m53156a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22809w) CommentPresenterImpl.this.m52968s()).mo54165pz(this.f51690r, this.f51691s, this.f51692t, this.f51693u, this.f51694v, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53156a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$t */
    /* loaded from: classes5.dex */
    static final class C9863t extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ boolean f51696r;

        /* renamed from: s */
        final /* synthetic */ String f51697s;

        /* renamed from: t */
        final /* synthetic */ int f51698t;

        /* renamed from: u */
        final /* synthetic */ Integer f51699u;

        /* renamed from: v */
        final /* synthetic */ String f51700v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9863t(boolean z11, String str, int i11, Integer num, String str2) {
            super(1);
            this.f51696r = z11;
            this.f51697s = str;
            this.f51698t = i11;
            this.f51699u = num;
            this.f51700v = str2;
        }

        /* renamed from: a */
        public final void m53157a(EnumC18694f enumC18694f) {
            AbstractC19074t.m100208f(enumC18694f, "it");
            InterfaceC22809w.a.m117529a((InterfaceC22809w) CommentPresenterImpl.this.m52968s(), this.f51696r, this.f51697s, this.f51698t, this.f51699u, this.f51700v, null, 32, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53157a((EnumC18694f) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$u */
    /* loaded from: classes5.dex */
    static final class C9864u extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51701t;

        /* renamed from: u */
        final /* synthetic */ boolean f51702u;

        /* renamed from: v */
        final /* synthetic */ CommentPresenterImpl f51703v;

        /* renamed from: w */
        final /* synthetic */ Comment f51704w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9864u(boolean z11, CommentPresenterImpl commentPresenterImpl, Comment comment, Continuation continuation) {
            super(1, continuation);
            this.f51702u = z11;
            this.f51703v = commentPresenterImpl;
            this.f51704w = comment;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            Integer num;
            String str2;
            Integer num2;
            String str3;
            Object mo96598j;
            String str4;
            Integer num3;
            String str5;
            Integer num4;
            String str6;
            Object m96644n;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51701t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        mo96598j = obj;
                        return (Comment) mo96598j;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                m96644n = obj;
                return (Comment) m96644n;
            }
            AbstractC24862s.m129228b(obj);
            if (this.f51702u) {
                InterfaceC18170g interfaceC18170g = this.f51703v.f51631r;
                String m50839m = this.f51704w.m50839m();
                AbstractC19074t.m100205c(m50839m);
                String m50854d = this.f51704w.m50838l().m50854d();
                int m50856f = this.f51704w.m50838l().m50856f();
                Comment.Identity m50834h = this.f51704w.m50834h();
                if (m50834h != null) {
                    str4 = m50834h.m50854d();
                } else {
                    str4 = null;
                }
                Comment.Identity m50834h2 = this.f51704w.m50834h();
                if (m50834h2 != null) {
                    num3 = AbstractC29094b.m145341c(m50834h2.m50856f());
                } else {
                    num3 = null;
                }
                String m50831e = this.f51704w.m50831e();
                AbstractC19074t.m100205c(m50831e);
                Video m50828b = this.f51704w.m50828b();
                if (m50828b != null) {
                    str5 = m50828b.m52911t();
                } else {
                    str5 = null;
                }
                if (str5 != null && str5.length() != 0) {
                    num4 = AbstractC29094b.m145341c(3);
                } else {
                    num4 = null;
                }
                Video m50828b2 = this.f51704w.m50828b();
                if (m50828b2 != null) {
                    str6 = m50828b2.m52911t();
                } else {
                    str6 = null;
                }
                String str7 = this.f51703v.f51638y;
                String str8 = this.f51703v.f51639z;
                Integer num5 = this.f51703v.f51629A;
                Integer num6 = this.f51703v.f51630B;
                this.f51701t = 1;
                m96644n = InterfaceC18170g.a.m96644n(interfaceC18170g, m50839m, m50854d, m50856f, str4, num3, m50831e, num4, str6, str7, str8, num5, num6, null, this, 4096, null);
                if (m96644n == m142578e) {
                    return m142578e;
                }
                return (Comment) m96644n;
            }
            InterfaceC18170g interfaceC18170g2 = this.f51703v.f51631r;
            String m50844t = this.f51704w.m50844t();
            String m50854d2 = this.f51704w.m50838l().m50854d();
            int m50856f2 = this.f51704w.m50838l().m50856f();
            Comment.Identity m50834h3 = this.f51704w.m50834h();
            if (m50834h3 != null) {
                str = m50834h3.m50854d();
            } else {
                str = null;
            }
            Comment.Identity m50834h4 = this.f51704w.m50834h();
            if (m50834h4 != null) {
                num = AbstractC29094b.m145341c(m50834h4.m50856f());
            } else {
                num = null;
            }
            String m50831e2 = this.f51704w.m50831e();
            AbstractC19074t.m100205c(m50831e2);
            Video m50828b3 = this.f51704w.m50828b();
            if (m50828b3 != null) {
                str2 = m50828b3.m52911t();
            } else {
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                num2 = AbstractC29094b.m145341c(3);
            } else {
                num2 = null;
            }
            Video m50828b4 = this.f51704w.m50828b();
            if (m50828b4 != null) {
                str3 = m50828b4.m52911t();
            } else {
                str3 = null;
            }
            String str9 = this.f51703v.f51638y;
            String str10 = this.f51703v.f51639z;
            Integer num7 = this.f51703v.f51629A;
            Integer num8 = this.f51703v.f51630B;
            this.f51701t = 2;
            mo96598j = interfaceC18170g2.mo96598j(m50844t, m50854d2, m50856f2, str, num, m50831e2, num2, str3, str9, str10, num7, num8, this);
            if (mo96598j == m142578e) {
                return m142578e;
            }
            return (Comment) mo96598j;
        }

        /* renamed from: r */
        public final Continuation m53158r(Continuation continuation) {
            return new C9864u(this.f51702u, this.f51703v, this.f51704w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9864u) m53158r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$v */
    /* loaded from: classes5.dex */
    static final class C9865v extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Comment f51706r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9865v(Comment comment) {
            super(1);
            this.f51706r = comment;
        }

        /* renamed from: a */
        public final void m53160a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22809w) CommentPresenterImpl.this.m52968s()).mo54157Vw(th2, this.f51706r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53160a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CommentPresenterImpl$w */
    /* loaded from: classes5.dex */
    static final class C9866w extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Comment f51708r;

        /* renamed from: s */
        final /* synthetic */ boolean f51709s;

        /* renamed from: t */
        final /* synthetic */ boolean f51710t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9866w(Comment comment, boolean z11, boolean z12) {
            super(1);
            this.f51708r = comment;
            this.f51709s = z11;
            this.f51710t = z12;
        }

        /* renamed from: a */
        public final void m53161a(Comment comment) {
            AbstractC19074t.m100208f(comment, "result");
            ((InterfaceC22809w) CommentPresenterImpl.this.m52968s()).mo54156Uj(this.f51708r, comment, this.f51709s, this.f51710t);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53161a((Comment) obj);
            return C24848g0.f119245a;
        }
    }

    public CommentPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepository");
        this.f51631r = interfaceC18170g;
        this.f51632s = new CommentSource();
        this.f51635v = true;
        this.f51636w = new NetworkReceiver(new C9853j(), new C9854k());
        this.f51637x = new HashMap();
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10055c
    /* renamed from: AA */
    public void mo53120AA(boolean z11, String str, int i11, Integer num, String str2) {
        AbstractC19074t.m100208f(str, "commentId");
        m52966n(new C9861r(z11, this, str, null), new C9862s(z11, str, i11, num, str2), new C9863t(z11, str, i11, num, str2));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10055c
    /* renamed from: Ct */
    public void mo53121Ct(Comment comment, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(comment, "comment");
        m52966n(new C9864u(z11, this, comment, null), new C9865v(comment), new C9866w(comment, z11, z12));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10055c
    /* renamed from: H4 */
    public void mo53122H4(Comment comment, LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(comment, "comment");
        AbstractC19074t.m100208f(loadMoreInfo, "loadMore");
        if (this.f51634u != null) {
            return;
        }
        this.f51634u = loadMoreInfo;
        m52966n(new C9850g(comment, loadMoreInfo, null), new C9851h(), new C9852i(comment));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10055c
    /* renamed from: HF */
    public void mo53123HF(LoadMoreInfo loadMoreInfo, String str) {
        if (this.f51633t != null) {
            return;
        }
        this.f51633t = loadMoreInfo;
        m52966n(new C9844a(str, loadMoreInfo, null), new C9845b(), new C9846c());
    }

    /* renamed from: M */
    public final void m53124M(List list, InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l) {
        List<Comment> m51168m;
        String str;
        AbstractC19074t.m100208f(list, "comments");
        AbstractC19074t.m100208f(interfaceC18494a, "consumer");
        AbstractC19074t.m100208f(interfaceC18505l, "fallback");
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Comment comment = (Comment) it.next();
            hashMap.put(comment.m50833g(), comment);
            Section m50840n = comment.m50840n();
            if (m50840n != null && (m51168m = m50840n.m51168m()) != null) {
                for (Comment comment2 : m51168m) {
                    hashMap.put(comment2.m50833g(), comment2);
                    String m50833g = comment2.m50833g();
                    Comment m50841o = comment.m50841o();
                    if (m50841o != null) {
                        str = m50841o.m50833g();
                    } else {
                        str = null;
                    }
                    if (AbstractC19074t.m100204b(m50833g, str)) {
                        comment.m50825T(comment2);
                    }
                }
            }
        }
        m52966n(new C9847d(hashMap, null), new C9848e(interfaceC18505l), new C9849f(hashMap, interfaceC18494a));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10055c
    /* renamed from: Of */
    public void mo53125Of(Comment comment) {
        AbstractC19074t.m100208f(comment, "comment");
        m52966n(new C9855l(comment, null), new C9856m(comment), new C9857n(comment));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        if (((InterfaceC22809w) m52968s()).getContext() != null) {
            this.f51636w.mo53687g();
        }
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10055c
    /* renamed from: h */
    public CommentSource mo53126h() {
        return this.f51632s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl
    /* renamed from: p */
    public void mo52967p(boolean z11) {
        super.mo52967p(z11);
        this.f51637x.clear();
        this.f51634u = null;
        this.f51633t = null;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10055c
    /* renamed from: tI */
    public void mo53127tI(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "commentId");
        CommentReceiver.Companion.m53713d(this.f51632s.m56271d(), str, z11);
        if (this.f51637x.put(str, Boolean.valueOf(z11)) != null) {
            return;
        }
        m52966n(new C9858o(z11, this, str, null), new C9859p(str, z11), new C9860q(str, z11));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10053a
    /* renamed from: uo */
    public void mo52970uo(Bundle bundle) {
        CommentSource commentSource = null;
        BasePresenterImpl.m52964r(this, false, 1, null);
        if (bundle != null) {
            commentSource = (CommentSource) bundle.getParcelable("CMT_SOURCE");
        }
        if (commentSource == null) {
            return;
        }
        this.f51632s = commentSource;
        this.f51638y = bundle.getString("AD_ID");
        this.f51639z = bundle.getString("AD_SOURCE");
        this.f51629A = Integer.valueOf(bundle.getInt("AD_INDEX"));
        this.f51630B = Integer.valueOf(bundle.getInt("AD_DISPLAYED_COUNT"));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8650wC(interfaceC1801w);
        Context context = ((InterfaceC22809w) m52968s()).getContext();
        if (context != null) {
            this.f51636w.mo53685d(context);
        }
    }
}
