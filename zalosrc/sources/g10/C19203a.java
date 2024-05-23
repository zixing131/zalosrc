package g10;

import com.zing.zalo.shortvideo.data.remote.ws.request.WsRequest;
import com.zing.zalo.shortvideo.data.remote.ws.response.EmptySuccessResponse;
import com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes;
import com.zing.zalo.shortvideo.data.remote.ws.response.GetStatLivestreamRes;
import com.zing.zalo.shortvideo.data.remote.ws.response.StreamData;
import com.zing.zalo.shortvideo.data.remote.ws.response.WsError;
import com.zing.zalo.shortvideo.data.remote.ws.response.WsRawResponse;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.connection.socket.NativeWSRequestListener;
import e10.InterfaceC18165b;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import h10.C19714o;
import h10.InterfaceC19709j;
import java.util.concurrent.TimeoutException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.serialization.KSerializer;
import m10.C22714b;
import n10.InterfaceC23520c;
import o10.C23979b;
import p10.AbstractC24607k;
import p10.C24608l;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qn0.AbstractC25394i;
import un0.AbstractC27323a;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* renamed from: g10.a */
/* loaded from: classes5.dex */
public final class C19203a implements InterfaceC18165b {

    /* renamed from: a */
    private final C19714o f95331a;

    /* renamed from: g10.a$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95332t;

        /* renamed from: u */
        int f95333u;

        /* renamed from: v */
        final /* synthetic */ C19059j0 f95334v;

        /* renamed from: w */
        final /* synthetic */ C19203a f95335w;

        /* renamed from: x */
        final /* synthetic */ WsRequest f95336x;

        /* renamed from: g10.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C32823a implements InterfaceC19709j {

            /* renamed from: a */
            final /* synthetic */ Continuation f95337a;

            public C32823a(Continuation continuation) {
                this.f95337a = continuation;
            }

            @Override // h10.InterfaceC19709j
            /* renamed from: a */
            public void mo100658a(C24608l c24608l) {
                AbstractC19074t.m100208f(c24608l, "result");
                this.f95337a.mo112492g(C24861r.m129218b(c24608l));
            }

            @Override // h10.InterfaceC19709j
            /* renamed from: c */
            public void mo100659c(Exception exc) {
                AbstractC19074t.m100208f(exc, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                Continuation continuation = this.f95337a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(exc)));
            }
        }

        /* renamed from: g10.a$a$b */
        /* loaded from: classes5.dex */
        public static final class b extends NativeWSRequestListener {

            /* renamed from: a */
            final /* synthetic */ C19714o f95338a;

            /* renamed from: b */
            final /* synthetic */ WsRequest f95339b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC19709j f95340c;

            public b(C19714o c19714o, WsRequest wsRequest, InterfaceC19709j interfaceC19709j) {
                this.f95338a = c19714o;
                this.f95339b = wsRequest;
                this.f95340c = interfaceC19709j;
            }

            @Override // com.zing.zalocore.connection.socket.NativeWSRequestListener
            public void onRequestComplete(int i11, byte[] bArr) {
                boolean z11;
                InterfaceC23520c interfaceC23520c;
                C22714b c22714b;
                C24608l m128101a;
                AbstractC27323a abstractC27323a;
                AbstractC27323a abstractC27323a2;
                WsRawResponse wsRawResponse;
                AbstractC27323a abstractC27323a3;
                AbstractC27323a abstractC27323a4;
                if (bArr != null) {
                    if (bArr.length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        C19714o c19714o = this.f95338a;
                        this.f95339b.m51616d();
                        InterfaceC19709j interfaceC19709j = this.f95340c;
                        try {
                            interfaceC23520c = c19714o.f97842b;
                            String str = (String) interfaceC23520c.mo123439a(bArr).mo123437a(bArr);
                            c22714b = c19714o.f97843c;
                            if (str != null) {
                                try {
                                    abstractC27323a = c22714b.f111303a;
                                    KSerializer m131587a = AbstractC25394i.m131587a(abstractC27323a.mo131586a(), WsRawResponse.class);
                                    abstractC27323a2 = c22714b.f111303a;
                                    Object m139867d = abstractC27323a2.m139867d(m131587a, str);
                                    Object obj = null;
                                    if (m139867d instanceof WsRawResponse) {
                                        wsRawResponse = (WsRawResponse) m139867d;
                                    } else {
                                        wsRawResponse = null;
                                    }
                                    if (wsRawResponse != null) {
                                        if (AbstractC24607k.m128098a(wsRawResponse)) {
                                            String m51706a = wsRawResponse.m51706a();
                                            abstractC27323a3 = c22714b.f111303a;
                                            abstractC27323a4 = c22714b.f111303a;
                                            KSerializer m131587a2 = AbstractC25394i.m131587a(abstractC27323a4.mo131586a(), StreamData.class);
                                            if (m51706a == null) {
                                                m51706a = "{\"empty\":true}";
                                            }
                                            Object m139867d2 = abstractC27323a3.m139867d(m131587a2, m51706a);
                                            if (m139867d2 instanceof StreamData) {
                                                obj = m139867d2;
                                            }
                                            m128101a = new C24608l(wsRawResponse.m51708c(), wsRawResponse.m51707b(), (StreamData) obj, null, 8, null);
                                        } else {
                                            m128101a = new C24608l(wsRawResponse.m51708c(), wsRawResponse.m51707b(), null, new WsError("Api fail"), 4, null);
                                        }
                                    } else {
                                        m128101a = C24608l.Companion.m128101a(new WsError("Parse WsResponse is null"));
                                    }
                                } catch (Exception e11) {
                                    m128101a = C24608l.Companion.m128101a(e11);
                                }
                            } else {
                                m128101a = C24608l.Companion.m128101a(new WsError("Extract data is null"));
                            }
                            interfaceC19709j.mo100658a(m128101a);
                        } catch (Exception e12) {
                            interfaceC19709j.mo100659c(e12);
                        }
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C19059j0 c19059j0, Continuation continuation, C19203a c19203a, WsRequest wsRequest) {
            super(2, continuation);
            this.f95334v = c19059j0;
            this.f95335w = c19203a;
            this.f95336x = wsRequest;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f95334v, continuation, this.f95335w, this.f95336x);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Object m142578e2;
            C19059j0 c19059j0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95333u;
            if (i11 != 0) {
                if (i11 == 1) {
                    c19059j0 = (C19059j0) this.f95332t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19059j0 c19059j02 = this.f95334v;
                this.f95332t = c19059j02;
                this.f95333u = 1;
                m142576c = AbstractC28297c.m142576c(this);
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                cancellableContinuationImpl.m112574F();
                C19714o c19714o = this.f95335w.f95331a;
                C32823a c32823a = new C32823a(cancellableContinuationImpl);
                WsRequest wsRequest = this.f95336x;
                c19714o.m103461h(wsRequest, new b(c19714o, wsRequest, c32823a));
                Object m112571A = cancellableContinuationImpl.m112571A();
                m142578e2 = AbstractC28298d.m142578e();
                if (m112571A == m142578e2) {
                    AbstractC29100h.m145355c(this);
                }
                if (m112571A == m142578e) {
                    return m142578e;
                }
                c19059j0 = c19059j02;
                obj = m112571A;
            }
            c19059j0.f94941p = obj;
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g10.a$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f95341s;

        /* renamed from: t */
        /* synthetic */ Object f95342t;

        /* renamed from: v */
        int f95344v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f95342t = obj;
            this.f95344v |= Integer.MIN_VALUE;
            return C19203a.this.mo96483f(null, this);
        }
    }

    /* renamed from: g10.a$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95345t;

        /* renamed from: u */
        int f95346u;

        /* renamed from: v */
        final /* synthetic */ C19059j0 f95347v;

        /* renamed from: w */
        final /* synthetic */ C19203a f95348w;

        /* renamed from: x */
        final /* synthetic */ WsRequest f95349x;

        /* renamed from: g10.a$c$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC19709j {

            /* renamed from: a */
            final /* synthetic */ Continuation f95350a;

            public a(Continuation continuation) {
                this.f95350a = continuation;
            }

            @Override // h10.InterfaceC19709j
            /* renamed from: a */
            public void mo100658a(C24608l c24608l) {
                AbstractC19074t.m100208f(c24608l, "result");
                this.f95350a.mo112492g(C24861r.m129218b(c24608l));
            }

            @Override // h10.InterfaceC19709j
            /* renamed from: c */
            public void mo100659c(Exception exc) {
                AbstractC19074t.m100208f(exc, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                Continuation continuation = this.f95350a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(exc)));
            }
        }

        /* renamed from: g10.a$c$b */
        /* loaded from: classes5.dex */
        public static final class b extends NativeWSRequestListener {

            /* renamed from: a */
            final /* synthetic */ C19714o f95351a;

            /* renamed from: b */
            final /* synthetic */ WsRequest f95352b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC19709j f95353c;

            public b(C19714o c19714o, WsRequest wsRequest, InterfaceC19709j interfaceC19709j) {
                this.f95351a = c19714o;
                this.f95352b = wsRequest;
                this.f95353c = interfaceC19709j;
            }

            @Override // com.zing.zalocore.connection.socket.NativeWSRequestListener
            public void onRequestComplete(int i11, byte[] bArr) {
                boolean z11;
                InterfaceC23520c interfaceC23520c;
                C22714b c22714b;
                C24608l m128101a;
                AbstractC27323a abstractC27323a;
                AbstractC27323a abstractC27323a2;
                WsRawResponse wsRawResponse;
                AbstractC27323a abstractC27323a3;
                AbstractC27323a abstractC27323a4;
                if (bArr != null) {
                    if (bArr.length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        C19714o c19714o = this.f95351a;
                        this.f95352b.m51616d();
                        InterfaceC19709j interfaceC19709j = this.f95353c;
                        try {
                            interfaceC23520c = c19714o.f97842b;
                            String str = (String) interfaceC23520c.mo123439a(bArr).mo123437a(bArr);
                            c22714b = c19714o.f97843c;
                            if (str != null) {
                                try {
                                    abstractC27323a = c22714b.f111303a;
                                    KSerializer m131587a = AbstractC25394i.m131587a(abstractC27323a.mo131586a(), WsRawResponse.class);
                                    abstractC27323a2 = c22714b.f111303a;
                                    Object m139867d = abstractC27323a2.m139867d(m131587a, str);
                                    Object obj = null;
                                    if (m139867d instanceof WsRawResponse) {
                                        wsRawResponse = (WsRawResponse) m139867d;
                                    } else {
                                        wsRawResponse = null;
                                    }
                                    if (wsRawResponse != null) {
                                        if (AbstractC24607k.m128098a(wsRawResponse)) {
                                            String m51706a = wsRawResponse.m51706a();
                                            abstractC27323a3 = c22714b.f111303a;
                                            abstractC27323a4 = c22714b.f111303a;
                                            KSerializer m131587a2 = AbstractC25394i.m131587a(abstractC27323a4.mo131586a(), EmptySuccessResponse.class);
                                            if (m51706a == null) {
                                                m51706a = "{\"empty\":true}";
                                            }
                                            Object m139867d2 = abstractC27323a3.m139867d(m131587a2, m51706a);
                                            if (m139867d2 instanceof EmptySuccessResponse) {
                                                obj = m139867d2;
                                            }
                                            m128101a = new C24608l(wsRawResponse.m51708c(), wsRawResponse.m51707b(), (EmptySuccessResponse) obj, null, 8, null);
                                        } else {
                                            m128101a = new C24608l(wsRawResponse.m51708c(), wsRawResponse.m51707b(), null, new WsError("Api fail"), 4, null);
                                        }
                                    } else {
                                        m128101a = C24608l.Companion.m128101a(new WsError("Parse WsResponse is null"));
                                    }
                                } catch (Exception e11) {
                                    m128101a = C24608l.Companion.m128101a(e11);
                                }
                            } else {
                                m128101a = C24608l.Companion.m128101a(new WsError("Extract data is null"));
                            }
                            interfaceC19709j.mo100658a(m128101a);
                        } catch (Exception e12) {
                            interfaceC19709j.mo100659c(e12);
                        }
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C19059j0 c19059j0, Continuation continuation, C19203a c19203a, WsRequest wsRequest) {
            super(2, continuation);
            this.f95347v = c19059j0;
            this.f95348w = c19203a;
            this.f95349x = wsRequest;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f95347v, continuation, this.f95348w, this.f95349x);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Object m142578e2;
            C19059j0 c19059j0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95346u;
            if (i11 != 0) {
                if (i11 == 1) {
                    c19059j0 = (C19059j0) this.f95345t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19059j0 c19059j02 = this.f95347v;
                this.f95345t = c19059j02;
                this.f95346u = 1;
                m142576c = AbstractC28297c.m142576c(this);
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                cancellableContinuationImpl.m112574F();
                C19714o c19714o = this.f95348w.f95331a;
                a aVar = new a(cancellableContinuationImpl);
                WsRequest wsRequest = this.f95349x;
                c19714o.m103461h(wsRequest, new b(c19714o, wsRequest, aVar));
                Object m112571A = cancellableContinuationImpl.m112571A();
                m142578e2 = AbstractC28298d.m142578e();
                if (m112571A == m142578e2) {
                    AbstractC29100h.m145355c(this);
                }
                if (m112571A == m142578e) {
                    return m142578e;
                }
                c19059j0 = c19059j02;
                obj = m112571A;
            }
            c19059j0.f94941p = obj;
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g10.a$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC29096d {

        /* renamed from: s */
        Object f95354s;

        /* renamed from: t */
        /* synthetic */ Object f95355t;

        /* renamed from: v */
        int f95357v;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f95355t = obj;
            this.f95357v |= Integer.MIN_VALUE;
            return C19203a.this.mo96480c(null, 0L, this);
        }
    }

    /* renamed from: g10.a$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95358t;

        /* renamed from: u */
        int f95359u;

        /* renamed from: v */
        final /* synthetic */ C19059j0 f95360v;

        /* renamed from: w */
        final /* synthetic */ C19203a f95361w;

        /* renamed from: x */
        final /* synthetic */ WsRequest f95362x;

        /* renamed from: g10.a$e$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC19709j {

            /* renamed from: a */
            final /* synthetic */ Continuation f95363a;

            public a(Continuation continuation) {
                this.f95363a = continuation;
            }

            @Override // h10.InterfaceC19709j
            /* renamed from: a */
            public void mo100658a(C24608l c24608l) {
                AbstractC19074t.m100208f(c24608l, "result");
                this.f95363a.mo112492g(C24861r.m129218b(c24608l));
            }

            @Override // h10.InterfaceC19709j
            /* renamed from: c */
            public void mo100659c(Exception exc) {
                AbstractC19074t.m100208f(exc, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                Continuation continuation = this.f95363a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(exc)));
            }
        }

        /* renamed from: g10.a$e$b */
        /* loaded from: classes5.dex */
        public static final class b extends NativeWSRequestListener {

            /* renamed from: a */
            final /* synthetic */ C19714o f95364a;

            /* renamed from: b */
            final /* synthetic */ WsRequest f95365b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC19709j f95366c;

            public b(C19714o c19714o, WsRequest wsRequest, InterfaceC19709j interfaceC19709j) {
                this.f95364a = c19714o;
                this.f95365b = wsRequest;
                this.f95366c = interfaceC19709j;
            }

            @Override // com.zing.zalocore.connection.socket.NativeWSRequestListener
            public void onRequestComplete(int i11, byte[] bArr) {
                boolean z11;
                InterfaceC23520c interfaceC23520c;
                C22714b c22714b;
                C24608l m128101a;
                AbstractC27323a abstractC27323a;
                AbstractC27323a abstractC27323a2;
                WsRawResponse wsRawResponse;
                AbstractC27323a abstractC27323a3;
                AbstractC27323a abstractC27323a4;
                if (bArr != null) {
                    if (bArr.length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        C19714o c19714o = this.f95364a;
                        this.f95365b.m51616d();
                        InterfaceC19709j interfaceC19709j = this.f95366c;
                        try {
                            interfaceC23520c = c19714o.f97842b;
                            String str = (String) interfaceC23520c.mo123439a(bArr).mo123437a(bArr);
                            c22714b = c19714o.f97843c;
                            if (str != null) {
                                try {
                                    abstractC27323a = c22714b.f111303a;
                                    KSerializer m131587a = AbstractC25394i.m131587a(abstractC27323a.mo131586a(), WsRawResponse.class);
                                    abstractC27323a2 = c22714b.f111303a;
                                    Object m139867d = abstractC27323a2.m139867d(m131587a, str);
                                    Object obj = null;
                                    if (m139867d instanceof WsRawResponse) {
                                        wsRawResponse = (WsRawResponse) m139867d;
                                    } else {
                                        wsRawResponse = null;
                                    }
                                    if (wsRawResponse != null) {
                                        if (AbstractC24607k.m128098a(wsRawResponse)) {
                                            String m51706a = wsRawResponse.m51706a();
                                            abstractC27323a3 = c22714b.f111303a;
                                            abstractC27323a4 = c22714b.f111303a;
                                            KSerializer m131587a2 = AbstractC25394i.m131587a(abstractC27323a4.mo131586a(), GetCommentLiveRes.class);
                                            if (m51706a == null) {
                                                m51706a = "{\"empty\":true}";
                                            }
                                            Object m139867d2 = abstractC27323a3.m139867d(m131587a2, m51706a);
                                            if (m139867d2 instanceof GetCommentLiveRes) {
                                                obj = m139867d2;
                                            }
                                            m128101a = new C24608l(wsRawResponse.m51708c(), wsRawResponse.m51707b(), (GetCommentLiveRes) obj, null, 8, null);
                                        } else {
                                            m128101a = new C24608l(wsRawResponse.m51708c(), wsRawResponse.m51707b(), null, new WsError("Api fail"), 4, null);
                                        }
                                    } else {
                                        m128101a = C24608l.Companion.m128101a(new WsError("Parse WsResponse is null"));
                                    }
                                } catch (Exception e11) {
                                    m128101a = C24608l.Companion.m128101a(e11);
                                }
                            } else {
                                m128101a = C24608l.Companion.m128101a(new WsError("Extract data is null"));
                            }
                            interfaceC19709j.mo100658a(m128101a);
                        } catch (Exception e12) {
                            interfaceC19709j.mo100659c(e12);
                        }
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C19059j0 c19059j0, Continuation continuation, C19203a c19203a, WsRequest wsRequest) {
            super(2, continuation);
            this.f95360v = c19059j0;
            this.f95361w = c19203a;
            this.f95362x = wsRequest;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f95360v, continuation, this.f95361w, this.f95362x);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Object m142578e2;
            C19059j0 c19059j0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95359u;
            if (i11 != 0) {
                if (i11 == 1) {
                    c19059j0 = (C19059j0) this.f95358t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19059j0 c19059j02 = this.f95360v;
                this.f95358t = c19059j02;
                this.f95359u = 1;
                m142576c = AbstractC28297c.m142576c(this);
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                cancellableContinuationImpl.m112574F();
                C19714o c19714o = this.f95361w.f95331a;
                a aVar = new a(cancellableContinuationImpl);
                WsRequest wsRequest = this.f95362x;
                c19714o.m103461h(wsRequest, new b(c19714o, wsRequest, aVar));
                Object m112571A = cancellableContinuationImpl.m112571A();
                m142578e2 = AbstractC28298d.m142578e();
                if (m112571A == m142578e2) {
                    AbstractC29100h.m145355c(this);
                }
                if (m112571A == m142578e) {
                    return m142578e;
                }
                c19059j0 = c19059j02;
                obj = m112571A;
            }
            c19059j0.f94941p = obj;
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g10.a$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC29096d {

        /* renamed from: s */
        Object f95367s;

        /* renamed from: t */
        /* synthetic */ Object f95368t;

        /* renamed from: v */
        int f95370v;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f95368t = obj;
            this.f95370v |= Integer.MIN_VALUE;
            return C19203a.this.mo96482e(null, 0, 0L, 0, this);
        }
    }

    /* renamed from: g10.a$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95371t;

        /* renamed from: u */
        int f95372u;

        /* renamed from: v */
        final /* synthetic */ C19059j0 f95373v;

        /* renamed from: w */
        final /* synthetic */ C19203a f95374w;

        /* renamed from: x */
        final /* synthetic */ WsRequest f95375x;

        /* renamed from: g10.a$g$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC19709j {

            /* renamed from: a */
            final /* synthetic */ Continuation f95376a;

            public a(Continuation continuation) {
                this.f95376a = continuation;
            }

            @Override // h10.InterfaceC19709j
            /* renamed from: a */
            public void mo100658a(C24608l c24608l) {
                AbstractC19074t.m100208f(c24608l, "result");
                this.f95376a.mo112492g(C24861r.m129218b(c24608l));
            }

            @Override // h10.InterfaceC19709j
            /* renamed from: c */
            public void mo100659c(Exception exc) {
                AbstractC19074t.m100208f(exc, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                Continuation continuation = this.f95376a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(exc)));
            }
        }

        /* renamed from: g10.a$g$b */
        /* loaded from: classes5.dex */
        public static final class b extends NativeWSRequestListener {

            /* renamed from: a */
            final /* synthetic */ C19714o f95377a;

            /* renamed from: b */
            final /* synthetic */ WsRequest f95378b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC19709j f95379c;

            public b(C19714o c19714o, WsRequest wsRequest, InterfaceC19709j interfaceC19709j) {
                this.f95377a = c19714o;
                this.f95378b = wsRequest;
                this.f95379c = interfaceC19709j;
            }

            @Override // com.zing.zalocore.connection.socket.NativeWSRequestListener
            public void onRequestComplete(int i11, byte[] bArr) {
                boolean z11;
                InterfaceC23520c interfaceC23520c;
                C22714b c22714b;
                C24608l m128101a;
                AbstractC27323a abstractC27323a;
                AbstractC27323a abstractC27323a2;
                WsRawResponse wsRawResponse;
                AbstractC27323a abstractC27323a3;
                AbstractC27323a abstractC27323a4;
                if (bArr != null) {
                    if (bArr.length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        C19714o c19714o = this.f95377a;
                        this.f95378b.m51616d();
                        InterfaceC19709j interfaceC19709j = this.f95379c;
                        try {
                            interfaceC23520c = c19714o.f97842b;
                            String str = (String) interfaceC23520c.mo123439a(bArr).mo123437a(bArr);
                            c22714b = c19714o.f97843c;
                            if (str != null) {
                                try {
                                    abstractC27323a = c22714b.f111303a;
                                    KSerializer m131587a = AbstractC25394i.m131587a(abstractC27323a.mo131586a(), WsRawResponse.class);
                                    abstractC27323a2 = c22714b.f111303a;
                                    Object m139867d = abstractC27323a2.m139867d(m131587a, str);
                                    Object obj = null;
                                    if (m139867d instanceof WsRawResponse) {
                                        wsRawResponse = (WsRawResponse) m139867d;
                                    } else {
                                        wsRawResponse = null;
                                    }
                                    if (wsRawResponse != null) {
                                        if (AbstractC24607k.m128098a(wsRawResponse)) {
                                            String m51706a = wsRawResponse.m51706a();
                                            abstractC27323a3 = c22714b.f111303a;
                                            abstractC27323a4 = c22714b.f111303a;
                                            KSerializer m131587a2 = AbstractC25394i.m131587a(abstractC27323a4.mo131586a(), GetCommentLiveRes.CommentData.class);
                                            if (m51706a == null) {
                                                m51706a = "{\"empty\":true}";
                                            }
                                            Object m139867d2 = abstractC27323a3.m139867d(m131587a2, m51706a);
                                            if (m139867d2 instanceof GetCommentLiveRes.CommentData) {
                                                obj = m139867d2;
                                            }
                                            m128101a = new C24608l(wsRawResponse.m51708c(), wsRawResponse.m51707b(), (GetCommentLiveRes.CommentData) obj, null, 8, null);
                                        } else {
                                            m128101a = new C24608l(wsRawResponse.m51708c(), wsRawResponse.m51707b(), null, new WsError("Api fail"), 4, null);
                                        }
                                    } else {
                                        m128101a = C24608l.Companion.m128101a(new WsError("Parse WsResponse is null"));
                                    }
                                } catch (Exception e11) {
                                    m128101a = C24608l.Companion.m128101a(e11);
                                }
                            } else {
                                m128101a = C24608l.Companion.m128101a(new WsError("Extract data is null"));
                            }
                            interfaceC19709j.mo100658a(m128101a);
                        } catch (Exception e12) {
                            interfaceC19709j.mo100659c(e12);
                        }
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C19059j0 c19059j0, Continuation continuation, C19203a c19203a, WsRequest wsRequest) {
            super(2, continuation);
            this.f95373v = c19059j0;
            this.f95374w = c19203a;
            this.f95375x = wsRequest;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f95373v, continuation, this.f95374w, this.f95375x);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Object m142578e2;
            C19059j0 c19059j0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95372u;
            if (i11 != 0) {
                if (i11 == 1) {
                    c19059j0 = (C19059j0) this.f95371t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19059j0 c19059j02 = this.f95373v;
                this.f95371t = c19059j02;
                this.f95372u = 1;
                m142576c = AbstractC28297c.m142576c(this);
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                cancellableContinuationImpl.m112574F();
                C19714o c19714o = this.f95374w.f95331a;
                a aVar = new a(cancellableContinuationImpl);
                WsRequest wsRequest = this.f95375x;
                c19714o.m103461h(wsRequest, new b(c19714o, wsRequest, aVar));
                Object m112571A = cancellableContinuationImpl.m112571A();
                m142578e2 = AbstractC28298d.m142578e();
                if (m112571A == m142578e2) {
                    AbstractC29100h.m145355c(this);
                }
                if (m112571A == m142578e) {
                    return m142578e;
                }
                c19059j0 = c19059j02;
                obj = m112571A;
            }
            c19059j0.f94941p = obj;
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g10.a$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC29096d {

        /* renamed from: s */
        Object f95380s;

        /* renamed from: t */
        /* synthetic */ Object f95381t;

        /* renamed from: v */
        int f95383v;

        h(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f95381t = obj;
            this.f95383v |= Integer.MIN_VALUE;
            return C19203a.this.mo96485h(null, null, 0, 0L, this);
        }
    }

    /* renamed from: g10.a$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95384t;

        /* renamed from: u */
        int f95385u;

        /* renamed from: v */
        final /* synthetic */ C19059j0 f95386v;

        /* renamed from: w */
        final /* synthetic */ C19203a f95387w;

        /* renamed from: x */
        final /* synthetic */ WsRequest f95388x;

        /* renamed from: g10.a$i$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC19709j {

            /* renamed from: a */
            final /* synthetic */ Continuation f95389a;

            public a(Continuation continuation) {
                this.f95389a = continuation;
            }

            @Override // h10.InterfaceC19709j
            /* renamed from: a */
            public void mo100658a(C24608l c24608l) {
                AbstractC19074t.m100208f(c24608l, "result");
                this.f95389a.mo112492g(C24861r.m129218b(c24608l));
            }

            @Override // h10.InterfaceC19709j
            /* renamed from: c */
            public void mo100659c(Exception exc) {
                AbstractC19074t.m100208f(exc, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                Continuation continuation = this.f95389a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(exc)));
            }
        }

        /* renamed from: g10.a$i$b */
        /* loaded from: classes5.dex */
        public static final class b extends NativeWSRequestListener {

            /* renamed from: a */
            final /* synthetic */ C19714o f95390a;

            /* renamed from: b */
            final /* synthetic */ WsRequest f95391b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC19709j f95392c;

            public b(C19714o c19714o, WsRequest wsRequest, InterfaceC19709j interfaceC19709j) {
                this.f95390a = c19714o;
                this.f95391b = wsRequest;
                this.f95392c = interfaceC19709j;
            }

            @Override // com.zing.zalocore.connection.socket.NativeWSRequestListener
            public void onRequestComplete(int i11, byte[] bArr) {
                boolean z11;
                InterfaceC23520c interfaceC23520c;
                C22714b c22714b;
                C24608l m128101a;
                AbstractC27323a abstractC27323a;
                AbstractC27323a abstractC27323a2;
                WsRawResponse wsRawResponse;
                AbstractC27323a abstractC27323a3;
                AbstractC27323a abstractC27323a4;
                if (bArr != null) {
                    if (bArr.length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        C19714o c19714o = this.f95390a;
                        this.f95391b.m51616d();
                        InterfaceC19709j interfaceC19709j = this.f95392c;
                        try {
                            interfaceC23520c = c19714o.f97842b;
                            String str = (String) interfaceC23520c.mo123439a(bArr).mo123437a(bArr);
                            c22714b = c19714o.f97843c;
                            if (str != null) {
                                try {
                                    abstractC27323a = c22714b.f111303a;
                                    KSerializer m131587a = AbstractC25394i.m131587a(abstractC27323a.mo131586a(), WsRawResponse.class);
                                    abstractC27323a2 = c22714b.f111303a;
                                    Object m139867d = abstractC27323a2.m139867d(m131587a, str);
                                    Object obj = null;
                                    if (m139867d instanceof WsRawResponse) {
                                        wsRawResponse = (WsRawResponse) m139867d;
                                    } else {
                                        wsRawResponse = null;
                                    }
                                    if (wsRawResponse != null) {
                                        if (AbstractC24607k.m128098a(wsRawResponse)) {
                                            String m51706a = wsRawResponse.m51706a();
                                            abstractC27323a3 = c22714b.f111303a;
                                            abstractC27323a4 = c22714b.f111303a;
                                            KSerializer m131587a2 = AbstractC25394i.m131587a(abstractC27323a4.mo131586a(), EmptySuccessResponse.class);
                                            if (m51706a == null) {
                                                m51706a = "{\"empty\":true}";
                                            }
                                            Object m139867d2 = abstractC27323a3.m139867d(m131587a2, m51706a);
                                            if (m139867d2 instanceof EmptySuccessResponse) {
                                                obj = m139867d2;
                                            }
                                            m128101a = new C24608l(wsRawResponse.m51708c(), wsRawResponse.m51707b(), (EmptySuccessResponse) obj, null, 8, null);
                                        } else {
                                            m128101a = new C24608l(wsRawResponse.m51708c(), wsRawResponse.m51707b(), null, new WsError("Api fail"), 4, null);
                                        }
                                    } else {
                                        m128101a = C24608l.Companion.m128101a(new WsError("Parse WsResponse is null"));
                                    }
                                } catch (Exception e11) {
                                    m128101a = C24608l.Companion.m128101a(e11);
                                }
                            } else {
                                m128101a = C24608l.Companion.m128101a(new WsError("Extract data is null"));
                            }
                            interfaceC19709j.mo100658a(m128101a);
                        } catch (Exception e12) {
                            interfaceC19709j.mo100659c(e12);
                        }
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C19059j0 c19059j0, Continuation continuation, C19203a c19203a, WsRequest wsRequest) {
            super(2, continuation);
            this.f95386v = c19059j0;
            this.f95387w = c19203a;
            this.f95388x = wsRequest;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f95386v, continuation, this.f95387w, this.f95388x);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Object m142578e2;
            C19059j0 c19059j0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95385u;
            if (i11 != 0) {
                if (i11 == 1) {
                    c19059j0 = (C19059j0) this.f95384t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19059j0 c19059j02 = this.f95386v;
                this.f95384t = c19059j02;
                this.f95385u = 1;
                m142576c = AbstractC28297c.m142576c(this);
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                cancellableContinuationImpl.m112574F();
                C19714o c19714o = this.f95387w.f95331a;
                a aVar = new a(cancellableContinuationImpl);
                WsRequest wsRequest = this.f95388x;
                c19714o.m103461h(wsRequest, new b(c19714o, wsRequest, aVar));
                Object m112571A = cancellableContinuationImpl.m112571A();
                m142578e2 = AbstractC28298d.m142578e();
                if (m112571A == m142578e2) {
                    AbstractC29100h.m145355c(this);
                }
                if (m112571A == m142578e) {
                    return m142578e;
                }
                c19059j0 = c19059j02;
                obj = m112571A;
            }
            c19059j0.f94941p = obj;
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g10.a$j */
    /* loaded from: classes5.dex */
    public static final class j extends AbstractC29096d {

        /* renamed from: s */
        Object f95393s;

        /* renamed from: t */
        /* synthetic */ Object f95394t;

        /* renamed from: v */
        int f95396v;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f95394t = obj;
            this.f95396v |= Integer.MIN_VALUE;
            return C19203a.this.mo96478a(null, 0, 0, this);
        }
    }

    /* renamed from: g10.a$k */
    /* loaded from: classes5.dex */
    public static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95397t;

        /* renamed from: u */
        int f95398u;

        /* renamed from: v */
        final /* synthetic */ C19059j0 f95399v;

        /* renamed from: w */
        final /* synthetic */ C19203a f95400w;

        /* renamed from: x */
        final /* synthetic */ WsRequest f95401x;

        /* renamed from: g10.a$k$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC19709j {

            /* renamed from: a */
            final /* synthetic */ Continuation f95402a;

            public a(Continuation continuation) {
                this.f95402a = continuation;
            }

            @Override // h10.InterfaceC19709j
            /* renamed from: a */
            public void mo100658a(C24608l c24608l) {
                AbstractC19074t.m100208f(c24608l, "result");
                this.f95402a.mo112492g(C24861r.m129218b(c24608l));
            }

            @Override // h10.InterfaceC19709j
            /* renamed from: c */
            public void mo100659c(Exception exc) {
                AbstractC19074t.m100208f(exc, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                Continuation continuation = this.f95402a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(exc)));
            }
        }

        /* renamed from: g10.a$k$b */
        /* loaded from: classes5.dex */
        public static final class b extends NativeWSRequestListener {

            /* renamed from: a */
            final /* synthetic */ C19714o f95403a;

            /* renamed from: b */
            final /* synthetic */ WsRequest f95404b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC19709j f95405c;

            public b(C19714o c19714o, WsRequest wsRequest, InterfaceC19709j interfaceC19709j) {
                this.f95403a = c19714o;
                this.f95404b = wsRequest;
                this.f95405c = interfaceC19709j;
            }

            @Override // com.zing.zalocore.connection.socket.NativeWSRequestListener
            public void onRequestComplete(int i11, byte[] bArr) {
                boolean z11;
                InterfaceC23520c interfaceC23520c;
                C22714b c22714b;
                C24608l m128101a;
                AbstractC27323a abstractC27323a;
                AbstractC27323a abstractC27323a2;
                WsRawResponse wsRawResponse;
                AbstractC27323a abstractC27323a3;
                AbstractC27323a abstractC27323a4;
                if (bArr != null) {
                    if (bArr.length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        C19714o c19714o = this.f95403a;
                        this.f95404b.m51616d();
                        InterfaceC19709j interfaceC19709j = this.f95405c;
                        try {
                            interfaceC23520c = c19714o.f97842b;
                            String str = (String) interfaceC23520c.mo123439a(bArr).mo123437a(bArr);
                            c22714b = c19714o.f97843c;
                            if (str != null) {
                                try {
                                    abstractC27323a = c22714b.f111303a;
                                    KSerializer m131587a = AbstractC25394i.m131587a(abstractC27323a.mo131586a(), WsRawResponse.class);
                                    abstractC27323a2 = c22714b.f111303a;
                                    Object m139867d = abstractC27323a2.m139867d(m131587a, str);
                                    Object obj = null;
                                    if (m139867d instanceof WsRawResponse) {
                                        wsRawResponse = (WsRawResponse) m139867d;
                                    } else {
                                        wsRawResponse = null;
                                    }
                                    if (wsRawResponse != null) {
                                        if (AbstractC24607k.m128098a(wsRawResponse)) {
                                            String m51706a = wsRawResponse.m51706a();
                                            abstractC27323a3 = c22714b.f111303a;
                                            abstractC27323a4 = c22714b.f111303a;
                                            KSerializer m131587a2 = AbstractC25394i.m131587a(abstractC27323a4.mo131586a(), GetStatLivestreamRes.class);
                                            if (m51706a == null) {
                                                m51706a = "{\"empty\":true}";
                                            }
                                            Object m139867d2 = abstractC27323a3.m139867d(m131587a2, m51706a);
                                            if (m139867d2 instanceof GetStatLivestreamRes) {
                                                obj = m139867d2;
                                            }
                                            m128101a = new C24608l(wsRawResponse.m51708c(), wsRawResponse.m51707b(), (GetStatLivestreamRes) obj, null, 8, null);
                                        } else {
                                            m128101a = new C24608l(wsRawResponse.m51708c(), wsRawResponse.m51707b(), null, new WsError("Api fail"), 4, null);
                                        }
                                    } else {
                                        m128101a = C24608l.Companion.m128101a(new WsError("Parse WsResponse is null"));
                                    }
                                } catch (Exception e11) {
                                    m128101a = C24608l.Companion.m128101a(e11);
                                }
                            } else {
                                m128101a = C24608l.Companion.m128101a(new WsError("Extract data is null"));
                            }
                            interfaceC19709j.mo100658a(m128101a);
                        } catch (Exception e12) {
                            interfaceC19709j.mo100659c(e12);
                        }
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C19059j0 c19059j0, Continuation continuation, C19203a c19203a, WsRequest wsRequest) {
            super(2, continuation);
            this.f95399v = c19059j0;
            this.f95400w = c19203a;
            this.f95401x = wsRequest;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k(this.f95399v, continuation, this.f95400w, this.f95401x);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Object m142578e2;
            C19059j0 c19059j0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95398u;
            if (i11 != 0) {
                if (i11 == 1) {
                    c19059j0 = (C19059j0) this.f95397t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19059j0 c19059j02 = this.f95399v;
                this.f95397t = c19059j02;
                this.f95398u = 1;
                m142576c = AbstractC28297c.m142576c(this);
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                cancellableContinuationImpl.m112574F();
                C19714o c19714o = this.f95400w.f95331a;
                a aVar = new a(cancellableContinuationImpl);
                WsRequest wsRequest = this.f95401x;
                c19714o.m103461h(wsRequest, new b(c19714o, wsRequest, aVar));
                Object m112571A = cancellableContinuationImpl.m112571A();
                m142578e2 = AbstractC28298d.m142578e();
                if (m112571A == m142578e2) {
                    AbstractC29100h.m145355c(this);
                }
                if (m112571A == m142578e) {
                    return m142578e;
                }
                c19059j0 = c19059j02;
                obj = m112571A;
            }
            c19059j0.f94941p = obj;
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g10.a$l */
    /* loaded from: classes5.dex */
    public static final class l extends AbstractC29096d {

        /* renamed from: s */
        Object f95406s;

        /* renamed from: t */
        /* synthetic */ Object f95407t;

        /* renamed from: v */
        int f95409v;

        l(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f95407t = obj;
            this.f95409v |= Integer.MIN_VALUE;
            return C19203a.this.mo96479b(null, this);
        }
    }

    /* renamed from: g10.a$m */
    /* loaded from: classes5.dex */
    public static final class m extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95410t;

        /* renamed from: u */
        int f95411u;

        /* renamed from: v */
        final /* synthetic */ C19059j0 f95412v;

        /* renamed from: w */
        final /* synthetic */ C19203a f95413w;

        /* renamed from: x */
        final /* synthetic */ WsRequest f95414x;

        /* renamed from: g10.a$m$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC19709j {

            /* renamed from: a */
            final /* synthetic */ Continuation f95415a;

            public a(Continuation continuation) {
                this.f95415a = continuation;
            }

            @Override // h10.InterfaceC19709j
            /* renamed from: a */
            public void mo100658a(C24608l c24608l) {
                AbstractC19074t.m100208f(c24608l, "result");
                this.f95415a.mo112492g(C24861r.m129218b(c24608l));
            }

            @Override // h10.InterfaceC19709j
            /* renamed from: c */
            public void mo100659c(Exception exc) {
                AbstractC19074t.m100208f(exc, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                Continuation continuation = this.f95415a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(exc)));
            }
        }

        /* renamed from: g10.a$m$b */
        /* loaded from: classes5.dex */
        public static final class b extends NativeWSRequestListener {

            /* renamed from: a */
            final /* synthetic */ C19714o f95416a;

            /* renamed from: b */
            final /* synthetic */ WsRequest f95417b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC19709j f95418c;

            public b(C19714o c19714o, WsRequest wsRequest, InterfaceC19709j interfaceC19709j) {
                this.f95416a = c19714o;
                this.f95417b = wsRequest;
                this.f95418c = interfaceC19709j;
            }

            @Override // com.zing.zalocore.connection.socket.NativeWSRequestListener
            public void onRequestComplete(int i11, byte[] bArr) {
                boolean z11;
                InterfaceC23520c interfaceC23520c;
                C22714b c22714b;
                C24608l m128101a;
                AbstractC27323a abstractC27323a;
                AbstractC27323a abstractC27323a2;
                WsRawResponse wsRawResponse;
                AbstractC27323a abstractC27323a3;
                AbstractC27323a abstractC27323a4;
                if (bArr != null) {
                    if (bArr.length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        C19714o c19714o = this.f95416a;
                        this.f95417b.m51616d();
                        InterfaceC19709j interfaceC19709j = this.f95418c;
                        try {
                            interfaceC23520c = c19714o.f97842b;
                            String str = (String) interfaceC23520c.mo123439a(bArr).mo123437a(bArr);
                            c22714b = c19714o.f97843c;
                            if (str != null) {
                                try {
                                    abstractC27323a = c22714b.f111303a;
                                    KSerializer m131587a = AbstractC25394i.m131587a(abstractC27323a.mo131586a(), WsRawResponse.class);
                                    abstractC27323a2 = c22714b.f111303a;
                                    Object m139867d = abstractC27323a2.m139867d(m131587a, str);
                                    Object obj = null;
                                    if (m139867d instanceof WsRawResponse) {
                                        wsRawResponse = (WsRawResponse) m139867d;
                                    } else {
                                        wsRawResponse = null;
                                    }
                                    if (wsRawResponse != null) {
                                        if (AbstractC24607k.m128098a(wsRawResponse)) {
                                            String m51706a = wsRawResponse.m51706a();
                                            abstractC27323a3 = c22714b.f111303a;
                                            abstractC27323a4 = c22714b.f111303a;
                                            KSerializer m131587a2 = AbstractC25394i.m131587a(abstractC27323a4.mo131586a(), StreamData.class);
                                            if (m51706a == null) {
                                                m51706a = "{\"empty\":true}";
                                            }
                                            Object m139867d2 = abstractC27323a3.m139867d(m131587a2, m51706a);
                                            if (m139867d2 instanceof StreamData) {
                                                obj = m139867d2;
                                            }
                                            m128101a = new C24608l(wsRawResponse.m51708c(), wsRawResponse.m51707b(), (StreamData) obj, null, 8, null);
                                        } else {
                                            m128101a = new C24608l(wsRawResponse.m51708c(), wsRawResponse.m51707b(), null, new WsError("Api fail"), 4, null);
                                        }
                                    } else {
                                        m128101a = C24608l.Companion.m128101a(new WsError("Parse WsResponse is null"));
                                    }
                                } catch (Exception e11) {
                                    m128101a = C24608l.Companion.m128101a(e11);
                                }
                            } else {
                                m128101a = C24608l.Companion.m128101a(new WsError("Extract data is null"));
                            }
                            interfaceC19709j.mo100658a(m128101a);
                        } catch (Exception e12) {
                            interfaceC19709j.mo100659c(e12);
                        }
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C19059j0 c19059j0, Continuation continuation, C19203a c19203a, WsRequest wsRequest) {
            super(2, continuation);
            this.f95412v = c19059j0;
            this.f95413w = c19203a;
            this.f95414x = wsRequest;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new m(this.f95412v, continuation, this.f95413w, this.f95414x);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Object m142578e2;
            C19059j0 c19059j0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95411u;
            if (i11 != 0) {
                if (i11 == 1) {
                    c19059j0 = (C19059j0) this.f95410t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19059j0 c19059j02 = this.f95412v;
                this.f95410t = c19059j02;
                this.f95411u = 1;
                m142576c = AbstractC28297c.m142576c(this);
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                cancellableContinuationImpl.m112574F();
                C19714o c19714o = this.f95413w.f95331a;
                a aVar = new a(cancellableContinuationImpl);
                WsRequest wsRequest = this.f95414x;
                c19714o.m103461h(wsRequest, new b(c19714o, wsRequest, aVar));
                Object m112571A = cancellableContinuationImpl.m112571A();
                m142578e2 = AbstractC28298d.m142578e();
                if (m112571A == m142578e2) {
                    AbstractC29100h.m145355c(this);
                }
                if (m112571A == m142578e) {
                    return m142578e;
                }
                c19059j0 = c19059j02;
                obj = m112571A;
            }
            c19059j0.f94941p = obj;
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g10.a$n */
    /* loaded from: classes5.dex */
    public static final class n extends AbstractC29096d {

        /* renamed from: s */
        Object f95419s;

        /* renamed from: t */
        /* synthetic */ Object f95420t;

        /* renamed from: v */
        int f95422v;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f95420t = obj;
            this.f95422v |= Integer.MIN_VALUE;
            return C19203a.this.mo96484g(null, this);
        }
    }

    public C19203a(C19714o c19714o) {
        AbstractC19074t.m100208f(c19714o, "caller");
        this.f95331a = c19714o;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x005b, B:14:0x0061, B:22:0x0040), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // e10.InterfaceC18165b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo96478a(String str, int i11, int i12, Continuation continuation) {
        j jVar;
        Object m142578e;
        int i13;
        C19059j0 c19059j0;
        C24608l c24608l;
        try {
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i14 = jVar.f95396v;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    jVar.f95396v = i14 - Integer.MIN_VALUE;
                    Object obj = jVar.f95394t;
                    m142578e = AbstractC28298d.m142578e();
                    i13 = jVar.f95396v;
                    if (i13 == 0) {
                        if (i13 == 1) {
                            c19059j0 = (C19059j0) jVar.f95393s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        WsRequest m125483f = C23979b.f116055a.m125483f(str, i11, i12);
                        long m51619g = m125483f.m51619g();
                        C19059j0 c19059j02 = new C19059j0();
                        i iVar = new i(c19059j02, null, this, m125483f);
                        jVar.f95393s = c19059j02;
                        jVar.f95396v = 1;
                        if (TimeoutKt.m112879d(m51619g, iVar, jVar) == m142578e) {
                            return m142578e;
                        }
                        c19059j0 = c19059j02;
                    }
                    c24608l = (C24608l) c19059j0.f94941p;
                    if (c24608l != null) {
                        return C24608l.Companion.m128101a(new TimeoutException());
                    }
                    return c24608l;
                }
            }
            if (i13 == 0) {
            }
            c24608l = (C24608l) c19059j0.f94941p;
            if (c24608l != null) {
            }
        } catch (Exception e11) {
            return C24608l.Companion.m128101a(e11);
        }
        jVar = new j(continuation);
        Object obj2 = jVar.f95394t;
        m142578e = AbstractC28298d.m142578e();
        i13 = jVar.f95396v;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x005b, B:14:0x0061, B:22:0x0040), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // e10.InterfaceC18165b
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo96479b(String str, Continuation continuation) {
        l lVar;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        C24608l c24608l;
        try {
            if (continuation instanceof l) {
                lVar = (l) continuation;
                int i12 = lVar.f95409v;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    lVar.f95409v = i12 - Integer.MIN_VALUE;
                    Object obj = lVar.f95407t;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = lVar.f95409v;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            c19059j0 = (C19059j0) lVar.f95406s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        WsRequest m125478a = C23979b.f116055a.m125478a(str);
                        long m51619g = m125478a.m51619g();
                        C19059j0 c19059j02 = new C19059j0();
                        k kVar = new k(c19059j02, null, this, m125478a);
                        lVar.f95406s = c19059j02;
                        lVar.f95409v = 1;
                        if (TimeoutKt.m112879d(m51619g, kVar, lVar) == m142578e) {
                            return m142578e;
                        }
                        c19059j0 = c19059j02;
                    }
                    c24608l = (C24608l) c19059j0.f94941p;
                    if (c24608l != null) {
                        return C24608l.Companion.m128101a(new TimeoutException());
                    }
                    return c24608l;
                }
            }
            if (i11 == 0) {
            }
            c24608l = (C24608l) c19059j0.f94941p;
            if (c24608l != null) {
            }
        } catch (Exception e11) {
            return C24608l.Companion.m128101a(e11);
        }
        lVar = new l(continuation);
        Object obj2 = lVar.f95407t;
        m142578e = AbstractC28298d.m142578e();
        i11 = lVar.f95409v;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x005b, B:14:0x0061, B:22:0x0040), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // e10.InterfaceC18165b
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo96480c(String str, long j11, Continuation continuation) {
        d dVar;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        C24608l c24608l;
        try {
            if (continuation instanceof d) {
                dVar = (d) continuation;
                int i12 = dVar.f95357v;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    dVar.f95357v = i12 - Integer.MIN_VALUE;
                    Object obj = dVar.f95355t;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = dVar.f95357v;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            c19059j0 = (C19059j0) dVar.f95354s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        WsRequest m125481d = C23979b.f116055a.m125481d(str, j11);
                        long m51619g = m125481d.m51619g();
                        C19059j0 c19059j02 = new C19059j0();
                        c cVar = new c(c19059j02, null, this, m125481d);
                        dVar.f95354s = c19059j02;
                        dVar.f95357v = 1;
                        if (TimeoutKt.m112879d(m51619g, cVar, dVar) == m142578e) {
                            return m142578e;
                        }
                        c19059j0 = c19059j02;
                    }
                    c24608l = (C24608l) c19059j0.f94941p;
                    if (c24608l != null) {
                        return C24608l.Companion.m128101a(new TimeoutException());
                    }
                    return c24608l;
                }
            }
            if (i11 == 0) {
            }
            c24608l = (C24608l) c19059j0.f94941p;
            if (c24608l != null) {
            }
        } catch (Exception e11) {
            return C24608l.Companion.m128101a(e11);
        }
        dVar = new d(continuation);
        Object obj2 = dVar.f95355t;
        m142578e = AbstractC28298d.m142578e();
        i11 = dVar.f95357v;
    }

    @Override // e10.InterfaceC18165b
    /* renamed from: d */
    public void mo96481d(C19714o.a aVar) {
        AbstractC19074t.m100208f(aVar, "listener");
        try {
            this.f95331a.m103463e(aVar);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:11:0x002c, B:12:0x0063, B:14:0x0069, B:22:0x0048), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // e10.InterfaceC18165b
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo96482e(String str, int i11, long j11, int i12, Continuation continuation) {
        f fVar;
        Object m142578e;
        int i13;
        C19059j0 c19059j0;
        C24608l c24608l;
        try {
            if (continuation instanceof f) {
                fVar = (f) continuation;
                int i14 = fVar.f95370v;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    fVar.f95370v = i14 - Integer.MIN_VALUE;
                    Object obj = fVar.f95368t;
                    m142578e = AbstractC28298d.m142578e();
                    i13 = fVar.f95370v;
                    if (i13 == 0) {
                        if (i13 == 1) {
                            c19059j0 = (C19059j0) fVar.f95367s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        WsRequest m125479b = C23979b.f116055a.m125479b(str, i11, j11, i12);
                        long m51619g = m125479b.m51619g();
                        C19059j0 c19059j02 = new C19059j0();
                        e eVar = new e(c19059j02, null, this, m125479b);
                        fVar.f95367s = c19059j02;
                        fVar.f95370v = 1;
                        if (TimeoutKt.m112879d(m51619g, eVar, fVar) == m142578e) {
                            return m142578e;
                        }
                        c19059j0 = c19059j02;
                    }
                    c24608l = (C24608l) c19059j0.f94941p;
                    if (c24608l != null) {
                        return C24608l.Companion.m128101a(new TimeoutException());
                    }
                    return c24608l;
                }
            }
            if (i13 == 0) {
            }
            c24608l = (C24608l) c19059j0.f94941p;
            if (c24608l != null) {
            }
        } catch (Exception e11) {
            return C24608l.Companion.m128101a(e11);
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f95368t;
        m142578e = AbstractC28298d.m142578e();
        i13 = fVar.f95370v;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x005b, B:14:0x0061, B:22:0x0040), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // e10.InterfaceC18165b
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo96483f(String str, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        C24608l c24608l;
        try {
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i12 = bVar.f95344v;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    bVar.f95344v = i12 - Integer.MIN_VALUE;
                    Object obj = bVar.f95342t;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = bVar.f95344v;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            c19059j0 = (C19059j0) bVar.f95341s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        WsRequest m125480c = C23979b.f116055a.m125480c(str);
                        long m51619g = m125480c.m51619g();
                        C19059j0 c19059j02 = new C19059j0();
                        a aVar = new a(c19059j02, null, this, m125480c);
                        bVar.f95341s = c19059j02;
                        bVar.f95344v = 1;
                        if (TimeoutKt.m112879d(m51619g, aVar, bVar) == m142578e) {
                            return m142578e;
                        }
                        c19059j0 = c19059j02;
                    }
                    c24608l = (C24608l) c19059j0.f94941p;
                    if (c24608l != null) {
                        return C24608l.Companion.m128101a(new TimeoutException());
                    }
                    return c24608l;
                }
            }
            if (i11 == 0) {
            }
            c24608l = (C24608l) c19059j0.f94941p;
            if (c24608l != null) {
            }
        } catch (Exception e11) {
            return C24608l.Companion.m128101a(e11);
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f95342t;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f95344v;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x005b, B:14:0x0061, B:22:0x0040), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // e10.InterfaceC18165b
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo96484g(String str, Continuation continuation) {
        n nVar;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        C24608l c24608l;
        try {
            if (continuation instanceof n) {
                nVar = (n) continuation;
                int i12 = nVar.f95422v;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    nVar.f95422v = i12 - Integer.MIN_VALUE;
                    Object obj = nVar.f95420t;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = nVar.f95422v;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            c19059j0 = (C19059j0) nVar.f95419s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        WsRequest m125484g = C23979b.f116055a.m125484g(str);
                        long m51619g = m125484g.m51619g();
                        C19059j0 c19059j02 = new C19059j0();
                        m mVar = new m(c19059j02, null, this, m125484g);
                        nVar.f95419s = c19059j02;
                        nVar.f95422v = 1;
                        if (TimeoutKt.m112879d(m51619g, mVar, nVar) == m142578e) {
                            return m142578e;
                        }
                        c19059j0 = c19059j02;
                    }
                    c24608l = (C24608l) c19059j0.f94941p;
                    if (c24608l != null) {
                        return C24608l.Companion.m128101a(new TimeoutException());
                    }
                    return c24608l;
                }
            }
            if (i11 == 0) {
            }
            c24608l = (C24608l) c19059j0.f94941p;
            if (c24608l != null) {
            }
        } catch (Exception e11) {
            return C24608l.Companion.m128101a(e11);
        }
        nVar = new n(continuation);
        Object obj2 = nVar.f95420t;
        m142578e = AbstractC28298d.m142578e();
        i11 = nVar.f95422v;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:11:0x002c, B:12:0x0063, B:14:0x0069, B:22:0x0048), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // e10.InterfaceC18165b
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo96485h(String str, String str2, int i11, long j11, Continuation continuation) {
        h hVar;
        Object m142578e;
        int i12;
        C19059j0 c19059j0;
        C24608l c24608l;
        try {
            if (continuation instanceof h) {
                hVar = (h) continuation;
                int i13 = hVar.f95383v;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    hVar.f95383v = i13 - Integer.MIN_VALUE;
                    Object obj = hVar.f95381t;
                    m142578e = AbstractC28298d.m142578e();
                    i12 = hVar.f95383v;
                    if (i12 == 0) {
                        if (i12 == 1) {
                            c19059j0 = (C19059j0) hVar.f95380s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        WsRequest m125482e = C23979b.f116055a.m125482e(str, str2, i11, j11);
                        long m51619g = m125482e.m51619g();
                        C19059j0 c19059j02 = new C19059j0();
                        g gVar = new g(c19059j02, null, this, m125482e);
                        hVar.f95380s = c19059j02;
                        hVar.f95383v = 1;
                        if (TimeoutKt.m112879d(m51619g, gVar, hVar) == m142578e) {
                            return m142578e;
                        }
                        c19059j0 = c19059j02;
                    }
                    c24608l = (C24608l) c19059j0.f94941p;
                    if (c24608l != null) {
                        return C24608l.Companion.m128101a(new TimeoutException());
                    }
                    return c24608l;
                }
            }
            if (i12 == 0) {
            }
            c24608l = (C24608l) c19059j0.f94941p;
            if (c24608l != null) {
            }
        } catch (Exception e11) {
            return C24608l.Companion.m128101a(e11);
        }
        hVar = new h(continuation);
        Object obj2 = hVar.f95381t;
        m142578e = AbstractC28298d.m142578e();
        i12 = hVar.f95383v;
    }

    @Override // e10.InterfaceC18165b
    /* renamed from: i */
    public void mo96486i() {
        try {
            this.f95331a.m103464f();
        } catch (Exception unused) {
        }
    }
}
