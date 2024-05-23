package com.zing.zalo.shortvideo.data.remote.common;

import ag0.AbstractC0837p0;
import com.zing.zalo.shortvideo.data.model.CursorLoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.PagingLoadMoreInfo;
import com.zing.zalo.shortvideo.data.remote.common.C9447a;
import com.zing.zalo.shortvideo.data.remote.common.UploadResult;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import e10.C18164a;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import f10.C18691c;
import f10.C18692d;
import f10.C18693e;
import f10.EnumC18694f;
import f10.InterfaceC18689a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import im0.AbstractC20626a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jm0.AbstractC21298h;
import jm0.AbstractC21302l;
import jm0.C21296f;
import jm0.EnumC21297g;
import jm0.InterfaceC21299i;
import jm0.InterfaceC21303m;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.KSerializer;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.C24321d;
import org.json.JSONObject;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25370t;
import qm0.AbstractC25376w;
import un0.AbstractC27323a;
import v00.C27417l;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.shortvideo.data.remote.common.a */
/* loaded from: classes5.dex */
public class C9447a extends AbstractC21298h {
    public static final b Companion = new b(null);

    /* renamed from: com.zing.zalo.shortvideo.data.remote.common.a$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final InterfaceC18689a f50201a;

        /* renamed from: b */
        private final String f50202b;

        /* renamed from: c */
        private String f50203c;

        /* renamed from: d */
        private final int f50204d;

        /* renamed from: e */
        private final Map f50205e;

        /* renamed from: f */
        private final Map f50206f;

        /* renamed from: g */
        private final Map f50207g;

        /* renamed from: h */
        private final Map f50208h;

        /* renamed from: i */
        private int f50209i;

        /* renamed from: com.zing.zalo.shortvideo.data.remote.common.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C32724a implements InterfaceC21299i {

            /* renamed from: a */
            final /* synthetic */ C19059j0 f50210a;

            /* renamed from: b */
            final /* synthetic */ CancellableContinuation f50211b;

            /* renamed from: c */
            final /* synthetic */ a f50212c;

            C32724a(C19059j0 c19059j0, CancellableContinuation cancellableContinuation, a aVar) {
                this.f50210a = c19059j0;
                this.f50211b = cancellableContinuation;
                this.f50212c = aVar;
            }

            @Override // jm0.InterfaceC21299i
            /* renamed from: c */
            public void mo1342c(C20096c c20096c) {
                C9447a c9447a;
                AbstractC19074t.m100208f(c20096c, "err");
                Object obj = this.f50210a.f94941p;
                if (obj == null) {
                    AbstractC19074t.m100223u("request");
                    c9447a = null;
                } else {
                    c9447a = (C9447a) obj;
                }
                if (c9447a.mo110257a()) {
                    return;
                }
                CancellableContinuation cancellableContinuation = this.f50211b;
                a aVar = this.f50212c;
                int m104491c = c20096c.m104491c();
                String m104492d = c20096c.m104492d();
                AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                CancellationException m51573o = aVar.m51573o(m104491c, m104492d);
                C24861r.a aVar2 = C24861r.f119264q;
                cancellableContinuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(m51573o)));
            }

            @Override // jm0.InterfaceC21299i
            /* renamed from: f */
            public void mo1343f(JSONObject jSONObject) {
                C9447a c9447a;
                AbstractC19074t.m100208f(jSONObject, "data");
                Object obj = this.f50210a.f94941p;
                if (obj == null) {
                    AbstractC19074t.m100223u("request");
                    c9447a = null;
                } else {
                    c9447a = (C9447a) obj;
                }
                if (c9447a.mo110257a()) {
                    return;
                }
                try {
                    C27417l c27417l = C27417l.f129055a;
                    AbstractC27323a m140384h = c27417l.m140384h();
                    KSerializer serializer = SimpleRestResponse.Companion.serializer();
                    String jSONObject2 = jSONObject.toString();
                    AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                    SimpleRestResponse simpleRestResponse = (SimpleRestResponse) m140384h.m139867d(serializer, jSONObject2);
                    if (simpleRestResponse.m51538c() > 0) {
                        c27417l.m140382f().m130132b(simpleRestResponse.m51538c());
                    }
                    if (simpleRestResponse.m51536a() == 0) {
                        CancellableContinuation cancellableContinuation = this.f50211b;
                        C24861r.a aVar = C24861r.f119264q;
                        cancellableContinuation.mo112492g(C24861r.m129218b(EnumC18694f.f93916p));
                    } else {
                        CancellableContinuation cancellableContinuation2 = this.f50211b;
                        C24861r.a aVar2 = C24861r.f119264q;
                        cancellableContinuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(this.f50212c.m51572n(simpleRestResponse.m51536a(), simpleRestResponse.m51537b()))));
                    }
                } catch (Throwable th2) {
                    CancellableContinuation cancellableContinuation3 = this.f50211b;
                    C24861r.a aVar3 = C24861r.f119264q;
                    cancellableContinuation3.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new SerializeException(th2.getMessage()))));
                }
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.remote.common.a$a$b */
        /* loaded from: classes5.dex */
        static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C19059j0 f50213q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C19059j0 c19059j0) {
                super(1);
                this.f50213q = c19059j0;
            }

            /* renamed from: a */
            public final void m51586a(Throwable th2) {
                C9447a c9447a;
                Object obj = this.f50213q.f94941p;
                C9447a c9447a2 = null;
                if (obj == null) {
                    AbstractC19074t.m100223u("request");
                    c9447a = null;
                } else {
                    c9447a = (C9447a) obj;
                }
                if (c9447a.mo110258b()) {
                    Object obj2 = this.f50213q.f94941p;
                    if (obj2 == null) {
                        AbstractC19074t.m100223u("request");
                    } else {
                        c9447a2 = (C9447a) obj2;
                    }
                    c9447a2.mo51554n();
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m51586a((Throwable) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.remote.common.a$a$c */
        /* loaded from: classes5.dex */
        public static final class c implements InterfaceC21299i {

            /* renamed from: a */
            final /* synthetic */ C19059j0 f50214a;

            /* renamed from: b */
            final /* synthetic */ KSerializer f50215b;

            /* renamed from: c */
            final /* synthetic */ CancellableContinuation f50216c;

            /* renamed from: d */
            final /* synthetic */ a f50217d;

            c(C19059j0 c19059j0, KSerializer kSerializer, CancellableContinuation cancellableContinuation, a aVar) {
                this.f50214a = c19059j0;
                this.f50215b = kSerializer;
                this.f50216c = cancellableContinuation;
                this.f50217d = aVar;
            }

            @Override // jm0.InterfaceC21299i
            /* renamed from: c */
            public void mo1342c(C20096c c20096c) {
                C9447a c9447a;
                AbstractC19074t.m100208f(c20096c, "err");
                Object obj = this.f50214a.f94941p;
                if (obj == null) {
                    AbstractC19074t.m100223u("request");
                    c9447a = null;
                } else {
                    c9447a = (C9447a) obj;
                }
                if (c9447a.mo110257a()) {
                    return;
                }
                CancellableContinuation cancellableContinuation = this.f50216c;
                a aVar = this.f50217d;
                int m104491c = c20096c.m104491c();
                String m104492d = c20096c.m104492d();
                AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                CancellationException m51573o = aVar.m51573o(m104491c, m104492d);
                C24861r.a aVar2 = C24861r.f119264q;
                cancellableContinuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(m51573o)));
            }

            @Override // jm0.InterfaceC21299i
            /* renamed from: f */
            public void mo1343f(JSONObject jSONObject) {
                C9447a c9447a;
                AbstractC19074t.m100208f(jSONObject, "data");
                Object obj = this.f50214a.f94941p;
                if (obj == null) {
                    AbstractC19074t.m100223u("request");
                    c9447a = null;
                } else {
                    c9447a = (C9447a) obj;
                }
                if (c9447a.mo110257a()) {
                    return;
                }
                try {
                    C27417l c27417l = C27417l.f129055a;
                    AbstractC27323a m140384h = c27417l.m140384h();
                    C18693e c18693e = new C18693e(this.f50215b);
                    String jSONObject2 = jSONObject.toString();
                    AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                    RestResponse restResponse = (RestResponse) m140384h.m139867d(c18693e, jSONObject2);
                    if (restResponse.m51534d() > 0) {
                        c27417l.m140382f().m130132b(restResponse.m51534d());
                    }
                    if (restResponse.m51531a() == 0) {
                        if (restResponse.m51532b() != null) {
                            CancellableContinuation cancellableContinuation = this.f50216c;
                            C24861r.a aVar = C24861r.f119264q;
                            cancellableContinuation.mo112492g(C24861r.m129218b(restResponse.m51532b()));
                            return;
                        } else {
                            CancellableContinuation cancellableContinuation2 = this.f50216c;
                            C24861r.a aVar2 = C24861r.f119264q;
                            cancellableContinuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new NoDataException(0, null, 3, null))));
                            return;
                        }
                    }
                    CancellableContinuation cancellableContinuation3 = this.f50216c;
                    C24861r.a aVar3 = C24861r.f119264q;
                    cancellableContinuation3.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(this.f50217d.m51572n(restResponse.m51531a(), restResponse.m51533c()))));
                } catch (Throwable th2) {
                    CancellableContinuation cancellableContinuation4 = this.f50216c;
                    C24861r.a aVar4 = C24861r.f119264q;
                    cancellableContinuation4.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new SerializeException(th2.getMessage()))));
                }
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.remote.common.a$a$d */
        /* loaded from: classes5.dex */
        static final class d extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C19059j0 f50218q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C19059j0 c19059j0) {
                super(1);
                this.f50218q = c19059j0;
            }

            /* renamed from: a */
            public final void m51587a(Throwable th2) {
                C9447a c9447a;
                Object obj = this.f50218q.f94941p;
                C9447a c9447a2 = null;
                if (obj == null) {
                    AbstractC19074t.m100223u("request");
                    c9447a = null;
                } else {
                    c9447a = (C9447a) obj;
                }
                if (c9447a.mo110258b()) {
                    Object obj2 = this.f50218q.f94941p;
                    if (obj2 == null) {
                        AbstractC19074t.m100223u("request");
                    } else {
                        c9447a2 = (C9447a) obj2;
                    }
                    c9447a2.mo51554n();
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m51587a((Throwable) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.remote.common.a$a$e */
        /* loaded from: classes5.dex */
        public static final class e implements InterfaceC21299i {

            /* renamed from: a */
            final /* synthetic */ C19059j0 f50219a;

            /* renamed from: b */
            final /* synthetic */ KSerializer f50220b;

            /* renamed from: c */
            final /* synthetic */ CancellableContinuation f50221c;

            /* renamed from: d */
            final /* synthetic */ a f50222d;

            e(C19059j0 c19059j0, KSerializer kSerializer, CancellableContinuation cancellableContinuation, a aVar) {
                this.f50219a = c19059j0;
                this.f50220b = kSerializer;
                this.f50221c = cancellableContinuation;
                this.f50222d = aVar;
            }

            @Override // jm0.InterfaceC21299i
            /* renamed from: c */
            public void mo1342c(C20096c c20096c) {
                C9447a c9447a;
                AbstractC19074t.m100208f(c20096c, "err");
                Object obj = this.f50219a.f94941p;
                if (obj == null) {
                    AbstractC19074t.m100223u("request");
                    c9447a = null;
                } else {
                    c9447a = (C9447a) obj;
                }
                if (c9447a.mo110257a()) {
                    return;
                }
                CancellableContinuation cancellableContinuation = this.f50221c;
                a aVar = this.f50222d;
                int m104491c = c20096c.m104491c();
                String m104492d = c20096c.m104492d();
                AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                CancellationException m51573o = aVar.m51573o(m104491c, m104492d);
                C24861r.a aVar2 = C24861r.f119264q;
                cancellableContinuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(m51573o)));
            }

            @Override // jm0.InterfaceC21299i
            /* renamed from: f */
            public void mo1343f(JSONObject jSONObject) {
                C9447a c9447a;
                AbstractC19074t.m100208f(jSONObject, "data");
                Object obj = this.f50219a.f94941p;
                if (obj == null) {
                    AbstractC19074t.m100223u("request");
                    c9447a = null;
                } else {
                    c9447a = (C9447a) obj;
                }
                if (c9447a.mo110257a()) {
                    return;
                }
                try {
                    C27417l c27417l = C27417l.f129055a;
                    AbstractC27323a m140384h = c27417l.m140384h();
                    C18693e c18693e = new C18693e(this.f50220b);
                    String jSONObject2 = jSONObject.toString();
                    AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                    RestResponse restResponse = (RestResponse) m140384h.m139867d(c18693e, jSONObject2);
                    if (restResponse.m51534d() > 0) {
                        c27417l.m140382f().m130132b(restResponse.m51534d());
                    }
                    if (restResponse.m51531a() == 0) {
                        if (restResponse.m51532b() != null) {
                            CancellableContinuation cancellableContinuation = this.f50221c;
                            C24861r.a aVar = C24861r.f119264q;
                            cancellableContinuation.mo112492g(C24861r.m129218b(restResponse.m51532b()));
                            return;
                        } else {
                            CancellableContinuation cancellableContinuation2 = this.f50221c;
                            C24861r.a aVar2 = C24861r.f119264q;
                            cancellableContinuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new NoDataException(0, null, 3, null))));
                            return;
                        }
                    }
                    CancellableContinuation cancellableContinuation3 = this.f50221c;
                    C24861r.a aVar3 = C24861r.f119264q;
                    cancellableContinuation3.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(this.f50222d.m51573o(restResponse.m51531a(), restResponse.m51533c()))));
                } catch (Throwable th2) {
                    CancellableContinuation cancellableContinuation4 = this.f50221c;
                    C24861r.a aVar4 = C24861r.f119264q;
                    cancellableContinuation4.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new SerializeException(th2.getMessage()))));
                }
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.remote.common.a$a$f */
        /* loaded from: classes5.dex */
        static final class f extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C19059j0 f50223q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(C19059j0 c19059j0) {
                super(1);
                this.f50223q = c19059j0;
            }

            /* renamed from: a */
            public final void m51588a(Throwable th2) {
                C9447a c9447a;
                Object obj = this.f50223q.f94941p;
                C9447a c9447a2 = null;
                if (obj == null) {
                    AbstractC19074t.m100223u("request");
                    c9447a = null;
                } else {
                    c9447a = (C9447a) obj;
                }
                if (c9447a.mo110258b()) {
                    Object obj2 = this.f50223q.f94941p;
                    if (obj2 == null) {
                        AbstractC19074t.m100223u("request");
                    } else {
                        c9447a2 = (C9447a) obj2;
                    }
                    c9447a2.mo51554n();
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m51588a((Throwable) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.remote.common.a$a$g */
        /* loaded from: classes5.dex */
        static final class g extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f50224t;

            /* renamed from: u */
            private /* synthetic */ Object f50225u;

            /* renamed from: w */
            final /* synthetic */ C21296f f50227w;

            /* renamed from: com.zing.zalo.shortvideo.data.remote.common.a$a$g$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32725a implements InterfaceC21303m {

                /* renamed from: a */
                final /* synthetic */ C19059j0 f50228a;

                /* renamed from: b */
                final /* synthetic */ ProducerScope f50229b;

                /* renamed from: c */
                final /* synthetic */ a f50230c;

                C32725a(C19059j0 c19059j0, ProducerScope producerScope, a aVar) {
                    this.f50228a = c19059j0;
                    this.f50229b = producerScope;
                    this.f50230c = aVar;
                }

                @Override // jm0.InterfaceC21303m
                /* renamed from: a */
                public void mo51590a(int i11) {
                    C9447a c9447a;
                    Object obj = this.f50228a.f94941p;
                    if (obj == null) {
                        AbstractC19074t.m100223u("request");
                        c9447a = null;
                    } else {
                        c9447a = (C9447a) obj;
                    }
                    if (c9447a.mo110257a()) {
                        return;
                    }
                    ChannelsKt.m113129w(this.f50229b, new C18692d(i11 / 100.0f));
                }

                @Override // jm0.InterfaceC21303m
                /* renamed from: b */
                public void mo51591b(JSONObject jSONObject, boolean z11) {
                    C9447a c9447a;
                    String str;
                    boolean m127128x;
                    AbstractC19074t.m100208f(jSONObject, "data");
                    Object obj = this.f50228a.f94941p;
                    if (obj == null) {
                        AbstractC19074t.m100223u("request");
                        c9447a = null;
                    } else {
                        c9447a = (C9447a) obj;
                    }
                    if (c9447a.mo110257a()) {
                        return;
                    }
                    C27417l c27417l = C27417l.f129055a;
                    AbstractC27323a m140384h = c27417l.m140384h();
                    C18693e c18693e = new C18693e(new UploadResult.C9446a());
                    String jSONObject2 = jSONObject.toString();
                    AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                    RestResponse restResponse = (RestResponse) m140384h.m139867d(c18693e, jSONObject2);
                    if (restResponse.m51534d() > 0) {
                        c27417l.m140382f().m130132b(restResponse.m51534d());
                    }
                    if (restResponse.m51531a() == 0) {
                        UploadResult uploadResult = (UploadResult) restResponse.m51532b();
                        if (uploadResult != null) {
                            str = uploadResult.m51541a();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            m127128x = AbstractC24341v.m127128x(str);
                            if (!m127128x) {
                                ChannelsKt.m113129w(this.f50229b, new C18691c(str));
                            }
                        }
                        CoroutineScopeKt.m112638b(this.f50229b, new NoDataException(0, null, 3, null));
                    } else {
                        CoroutineScopeKt.m112638b(this.f50229b, this.f50230c.m51572n(restResponse.m51531a(), restResponse.m51533c()));
                    }
                    SendChannel.DefaultImpls.m113195a(this.f50229b.mo112918q(), null, 1, null);
                }

                @Override // jm0.InterfaceC21299i
                /* renamed from: c */
                public void mo1342c(C20096c c20096c) {
                    C9447a c9447a;
                    AbstractC19074t.m100208f(c20096c, "err");
                    Object obj = this.f50228a.f94941p;
                    if (obj == null) {
                        AbstractC19074t.m100223u("request");
                        c9447a = null;
                    } else {
                        c9447a = (C9447a) obj;
                    }
                    if (c9447a.mo110257a()) {
                        return;
                    }
                    ProducerScope producerScope = this.f50229b;
                    int m104491c = c20096c.m104491c();
                    String m104492d = c20096c.m104492d();
                    AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                    CoroutineScopeKt.m112638b(producerScope, new RestException(m104491c, m104492d));
                }

                @Override // jm0.InterfaceC21299i
                /* renamed from: f */
                public /* synthetic */ void mo1343f(JSONObject jSONObject) {
                    AbstractC21302l.m110331a(this, jSONObject);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.data.remote.common.a$a$g$b */
            /* loaded from: classes5.dex */
            public static final class b extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ C19059j0 f50231q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C19059j0 c19059j0) {
                    super(0);
                    this.f50231q = c19059j0;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m51592a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m51592a() {
                    C9447a c9447a;
                    Object obj = this.f50231q.f94941p;
                    C9447a c9447a2 = null;
                    if (obj == null) {
                        AbstractC19074t.m100223u("request");
                        c9447a = null;
                    } else {
                        c9447a = (C9447a) obj;
                    }
                    if (c9447a.mo110258b()) {
                        Object obj2 = this.f50231q.f94941p;
                        if (obj2 == null) {
                            AbstractC19074t.m100223u("request");
                        } else {
                            c9447a2 = (C9447a) obj2;
                        }
                        c9447a2.mo51554n();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(C21296f c21296f, Continuation continuation) {
                super(2, continuation);
                this.f50227w = c21296f;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                g gVar = new g(this.f50227w, continuation);
                gVar.f50225u = obj;
                return gVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                C9447a c9447a;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f50224t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    ProducerScope producerScope = (ProducerScope) this.f50225u;
                    C19059j0 c19059j0 = new C19059j0();
                    a aVar = a.this;
                    c19059j0.f94941p = aVar.m51568j(new C32725a(c19059j0, producerScope, aVar));
                    this.f50227w.m110271n(true);
                    Object obj2 = c19059j0.f94941p;
                    C9447a c9447a2 = null;
                    if (obj2 == null) {
                        AbstractC19074t.m100223u("request");
                        c9447a = null;
                    } else {
                        c9447a = (C9447a) obj2;
                    }
                    c9447a.m110309g0(this.f50227w);
                    if (AbstractC20626a.m107394j(CoreUtility.getAppContext())) {
                        Object obj3 = c19059j0.f94941p;
                        if (obj3 == null) {
                            AbstractC19074t.m100223u("request");
                        } else {
                            c9447a2 = (C9447a) obj3;
                        }
                        c9447a2.mo110303Z();
                    } else {
                        CoroutineScopeKt.m112638b(producerScope, new NetworkException("No internet"));
                    }
                    b bVar = new b(c19059j0);
                    this.f50224t = 1;
                    if (ProduceKt.m113184a(producerScope, bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
                return ((g) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        public a(InterfaceC18689a interfaceC18689a, String str, String str2, int i11) {
            AbstractC19074t.m100208f(interfaceC18689a, "provider");
            AbstractC19074t.m100208f(str, "host");
            AbstractC19074t.m100208f(str2, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            this.f50201a = interfaceC18689a;
            this.f50202b = str;
            this.f50203c = str2;
            this.f50204d = i11;
            this.f50205e = new LinkedHashMap();
            this.f50206f = new LinkedHashMap();
            this.f50207g = new LinkedHashMap();
            this.f50208h = new LinkedHashMap();
            this.f50209i = 880000;
        }

        /* renamed from: d */
        private final void m51565d() {
            Map mo96668r0 = this.f50201a.mo96668r0();
            m51570l(mo96668r0, true, "appVersion", "os", "osVersion", "deviceId", "zDeviceId", "session");
            m51570l(mo96668r0, false, "appId", "model", "manufacturer", "language", "publicKey", "Authorization", "featureVersion", "versionCode");
        }

        /* renamed from: g */
        public static /* synthetic */ a m51566g(a aVar, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = true;
            }
            return aVar.m51577f(str, str2, z11);
        }

        /* renamed from: i */
        public static /* synthetic */ a m51567i(a aVar, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = true;
            }
            return aVar.m51578h(str, str2, z11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public final C9447a m51568j(InterfaceC21299i interfaceC21299i) {
            int m131511r;
            int m131511r2;
            m51565d();
            C9447a c9447a = new C9447a(interfaceC21299i);
            for (Map.Entry entry : this.f50205e.entrySet()) {
                c9447a.m110308g((String) entry.getKey(), (String) entry.getValue());
            }
            c9447a.f103775r = this.f50204d;
            c9447a.m110305c0(this.f50209i);
            c9447a.m110311h0(EnumC21297g.WITHOUT_AUTHENTICATION_INFO);
            String str = this.f50202b + this.f50203c + m51569k() + m51575r();
            Set entrySet = this.f50207g.entrySet();
            m131511r = AbstractC25370t.m131511r(entrySet, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Map.Entry) it.next()).getKey());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            Set entrySet2 = this.f50207g.entrySet();
            m131511r2 = AbstractC25370t.m131511r(entrySet2, 10);
            ArrayList arrayList2 = new ArrayList(m131511r2);
            Iterator it2 = entrySet2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
            }
            c9447a.m110314j(str, "", strArr, (String[]) arrayList2.toArray(new String[0]));
            if (AbstractC19074t.m100204b(this.f50202b, C18164a.f91843a.m96473b())) {
                c9447a.m110316k0(60000L);
                c9447a.f103763f = 0;
                c9447a.m110307f0(true);
            }
            return c9447a;
        }

        /* renamed from: k */
        private final String m51569k() {
            long m130131a = C27417l.f129055a.m140382f().m130131a();
            this.f50208h.put("cTime", String.valueOf(m130131a));
            return "?cTime=" + m130131a + "&sig=" + m51574q(m51571m(this.f50208h) + C18164a.f91843a.m96474c());
        }

        /* renamed from: l */
        private final void m51570l(Map map, boolean z11, String... strArr) {
            for (String str : strArr) {
                String str2 = (String) map.get(str);
                if (str2 != null) {
                    m51576e(str, str2, z11);
                }
            }
        }

        /* renamed from: m */
        private final String m51571m(Map map) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(map.keySet());
            AbstractC25376w.m131533v(arrayList);
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String str2 = (String) map.get(str);
                if (str2 != null && str2.length() != 0) {
                    sb2.append(str);
                    sb2.append(str2);
                }
            }
            String sb3 = sb2.toString();
            AbstractC19074t.m100207e(sb3, "toString(...)");
            return sb3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public final CancellationException m51572n(int i11, String str) {
            if (i11 != -2101 && i11 != -2100) {
                if (i11 != -1405) {
                    if (i11 != -1404) {
                        if (i11 != -901) {
                            if (i11 != -613) {
                                if (i11 != -404) {
                                    if (i11 != -102) {
                                        if (i11 != -101) {
                                            switch (i11) {
                                                case -2115:
                                                    return new NoNewFriendVideoException(i11, str);
                                                case -2114:
                                                    return new NoFriendDataException(i11, str);
                                                case -2113:
                                                    return new AdsDeletionDeniedException(i11, str);
                                                case -2112:
                                                case -2111:
                                                    return new LimitationReachedException(i11, str);
                                                default:
                                                    switch (i11) {
                                                        case -811:
                                                            return new CommentInvalidException(i11, str);
                                                        case -810:
                                                        case -809:
                                                        case -808:
                                                        case -807:
                                                            return new EditChannelInvalidException(i11, str);
                                                        default:
                                                            switch (i11) {
                                                                case -805:
                                                                case -802:
                                                                    break;
                                                                case -804:
                                                                    return new NotKycException(i11, str);
                                                                case -803:
                                                                    return new PermissionDeniedException(i11, str);
                                                                case -801:
                                                                    break;
                                                                default:
                                                                    return new RestException(i11, str);
                                                            }
                                                    }
                                            }
                                        } else {
                                            return new NoDataException(i11, str);
                                        }
                                    } else {
                                        return new InvalidTimeException(i11, str);
                                    }
                                } else {
                                    return new NotFoundException(i11, str);
                                }
                            }
                            return new UnauthorizedException(i11, str);
                        }
                        return new LockCommentException(i11, str);
                    }
                } else {
                    return new AlreadyExistsException(i11, str);
                }
            }
            return new NotExistsException(i11, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public final CancellationException m51573o(int i11, String str) {
            if (i11 != -1) {
                if (i11 != 28) {
                    return new RestException(i11, str);
                }
                return new NativeTimeOutException(i11, str);
            }
            return new DataEmptyException(i11, str);
        }

        /* renamed from: q */
        private final String m51574q(String str) {
            String m127183l0;
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(C24321d.f117408b);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            String bigInteger = new BigInteger(1, messageDigest.digest(bytes)).toString(16);
            AbstractC19074t.m100207e(bigInteger, "toString(...)");
            m127183l0 = AbstractC24342w.m127183l0(bigInteger, 32, '0');
            return m127183l0;
        }

        /* renamed from: r */
        private final String m51575r() {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry : this.f50206f.entrySet()) {
                sb2.append("&" + entry.getKey() + "=" + entry.getValue());
            }
            String sb3 = sb2.toString();
            AbstractC19074t.m100207e(sb3, "toString(...)");
            return sb3;
        }

        /* renamed from: e */
        public final a m51576e(String str, String str2, boolean z11) {
            AbstractC19074t.m100208f(str, "key");
            AbstractC19074t.m100208f(str2, "value");
            this.f50205e.put(str, str2);
            if (z11) {
                this.f50208h.put(str, str2);
            }
            return this;
        }

        /* renamed from: f */
        public final a m51577f(String str, String str2, boolean z11) {
            AbstractC19074t.m100208f(str, "key");
            AbstractC19074t.m100208f(str2, "value");
            this.f50207g.put(str, str2);
            if (z11) {
                this.f50208h.put(str, str2);
            }
            return this;
        }

        /* renamed from: h */
        public final a m51578h(String str, String str2, boolean z11) {
            AbstractC19074t.m100208f(str, "key");
            AbstractC19074t.m100208f(str2, "value");
            this.f50206f.put(str, str2);
            if (z11) {
                this.f50208h.put(str, str2);
            }
            return this;
        }

        /* renamed from: p */
        public final a m51579p(LoadMoreInfo loadMoreInfo) {
            String m127189r0;
            String m127189r02;
            if (loadMoreInfo != null && loadMoreInfo.isValid()) {
                if (loadMoreInfo instanceof PagingLoadMoreInfo) {
                    PagingLoadMoreInfo pagingLoadMoreInfo = (PagingLoadMoreInfo) loadMoreInfo;
                    m51567i(this, "lastId", pagingLoadMoreInfo.m51095d(), false, 4, null);
                    m51567i(this, "lastIndex", pagingLoadMoreInfo.m51096e(), false, 4, null);
                    m51567i(this, "pagingExt", pagingLoadMoreInfo.m51097f(), false, 4, null);
                    m127189r02 = AbstractC24342w.m127189r0(pagingLoadMoreInfo.m51098g(), "/");
                    this.f50203c = m127189r02;
                } else if (loadMoreInfo instanceof CursorLoadMoreInfo) {
                    CursorLoadMoreInfo cursorLoadMoreInfo = (CursorLoadMoreInfo) loadMoreInfo;
                    m51567i(this, "cursor", cursorLoadMoreInfo.m50914a(), false, 4, null);
                    m51567i(this, "pagingExt", cursorLoadMoreInfo.m50915b(), false, 4, null);
                    m127189r0 = AbstractC24342w.m127189r0(cursorLoadMoreInfo.m50916c(), "/");
                    this.f50203c = m127189r0;
                }
            }
            return this;
        }

        /* renamed from: s */
        public final Object m51580s(Continuation continuation) {
            Continuation m142576c;
            Object m142578e;
            C9447a c9447a;
            m142576c = AbstractC28297c.m142576c(continuation);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
            cancellableContinuationImpl.m112574F();
            C19059j0 c19059j0 = new C19059j0();
            c19059j0.f94941p = m51568j(new C32724a(c19059j0, cancellableContinuationImpl, this));
            if (AbstractC20626a.m107394j(CoreUtility.getAppContext())) {
                Object obj = c19059j0.f94941p;
                if (obj == null) {
                    AbstractC19074t.m100223u("request");
                    c9447a = null;
                } else {
                    c9447a = (C9447a) obj;
                }
                c9447a.mo110303Z();
            } else {
                C24861r.a aVar = C24861r.f119264q;
                cancellableContinuationImpl.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new NetworkException("No internet"))));
            }
            cancellableContinuationImpl.mo112543I(new b(c19059j0));
            Object m112571A = cancellableContinuationImpl.m112571A();
            m142578e = AbstractC28298d.m142578e();
            if (m112571A == m142578e) {
                AbstractC29100h.m145355c(continuation);
            }
            return m112571A;
        }

        /* renamed from: t */
        public final Object m51581t(KSerializer kSerializer, Continuation continuation) {
            Continuation m142576c;
            Object m142578e;
            C9447a c9447a;
            m142576c = AbstractC28297c.m142576c(continuation);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
            cancellableContinuationImpl.m112574F();
            C19059j0 c19059j0 = new C19059j0();
            c19059j0.f94941p = m51568j(new c(c19059j0, kSerializer, cancellableContinuationImpl, this));
            if (AbstractC20626a.m107394j(CoreUtility.getAppContext())) {
                Object obj = c19059j0.f94941p;
                if (obj == null) {
                    AbstractC19074t.m100223u("request");
                    c9447a = null;
                } else {
                    c9447a = (C9447a) obj;
                }
                c9447a.mo110303Z();
            } else {
                C24861r.a aVar = C24861r.f119264q;
                cancellableContinuationImpl.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new NetworkException("No internet"))));
            }
            cancellableContinuationImpl.mo112543I(new d(c19059j0));
            Object m112571A = cancellableContinuationImpl.m112571A();
            m142578e = AbstractC28298d.m142578e();
            if (m112571A == m142578e) {
                AbstractC29100h.m145355c(continuation);
            }
            return m112571A;
        }

        /* renamed from: u */
        public final Object m51582u(KSerializer kSerializer, Continuation continuation) {
            Continuation m142576c;
            Object m142578e;
            C9447a c9447a;
            m142576c = AbstractC28297c.m142576c(continuation);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
            cancellableContinuationImpl.m112574F();
            C19059j0 c19059j0 = new C19059j0();
            c19059j0.f94941p = m51568j(new e(c19059j0, kSerializer, cancellableContinuationImpl, this));
            if (AbstractC20626a.m107394j(CoreUtility.getAppContext())) {
                Object obj = c19059j0.f94941p;
                if (obj == null) {
                    AbstractC19074t.m100223u("request");
                    c9447a = null;
                } else {
                    c9447a = (C9447a) obj;
                }
                c9447a.mo110303Z();
            } else {
                C24861r.a aVar = C24861r.f119264q;
                cancellableContinuationImpl.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new NetworkException("No internet"))));
            }
            cancellableContinuationImpl.mo112543I(new f(c19059j0));
            Object m112571A = cancellableContinuationImpl.m112571A();
            m142578e = AbstractC28298d.m142578e();
            if (m112571A == m142578e) {
                AbstractC29100h.m145355c(continuation);
            }
            return m112571A;
        }

        /* renamed from: v */
        public final a m51583v(int i11) {
            this.f50209i = i11;
            return this;
        }

        /* renamed from: w */
        public final void m51584w(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f50203c = str;
        }

        /* renamed from: x */
        public final Flow m51585x(C21296f c21296f) {
            AbstractC19074t.m100208f(c21296f, "fileEntity");
            return FlowKt.m113287e(new g(c21296f, null));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.remote.common.a$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final a m51593a(InterfaceC18689a interfaceC18689a, String str) {
            AbstractC19074t.m100208f(interfaceC18689a, "provider");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            return new a(interfaceC18689a, C18164a.f91843a.m96476e(), str, 10);
        }

        /* renamed from: b */
        public final a m51594b(InterfaceC18689a interfaceC18689a, String str) {
            AbstractC19074t.m100208f(interfaceC18689a, "provider");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            return new a(interfaceC18689a, C18164a.f91843a.m96473b(), str, 10);
        }

        /* renamed from: c */
        public final a m51595c(InterfaceC18689a interfaceC18689a, String str) {
            AbstractC19074t.m100208f(interfaceC18689a, "provider");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            return new a(interfaceC18689a, C18164a.f91843a.m96477f(), str, 9);
        }

        /* renamed from: d */
        public final a m51596d(InterfaceC18689a interfaceC18689a, String str) {
            AbstractC19074t.m100208f(interfaceC18689a, "provider");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            return new a(interfaceC18689a, C18164a.f91843a.m96476e(), str, 11);
        }

        /* renamed from: e */
        public final a m51597e(InterfaceC18689a interfaceC18689a, String str) {
            AbstractC19074t.m100208f(interfaceC18689a, "provider");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            return new a(interfaceC18689a, C18164a.f91843a.m96472a(), str, 11);
        }
    }

    public C9447a(InterfaceC21299i interfaceC21299i) {
        super(interfaceC21299i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public static final void m51545o0(C9447a c9447a) {
        AbstractC19074t.m100208f(c9447a, "this$0");
        super.mo51554n();
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: E */
    public String mo51546E() {
        return "";
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: Q */
    protected boolean mo51547Q() {
        return true;
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: R */
    public void mo51548R(String str, int i11, String str2, long j11, int i12, int i13) {
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: V */
    public void mo51549V(JSONObject jSONObject) {
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: X */
    public void mo51550X(int i11, String str, String str2) {
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: Y */
    public void mo51551Y() {
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: a0 */
    public void mo51552a0() {
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: m0 */
    public void mo51553m0(boolean z11, boolean z12, int i11, int i12, int i13, long j11, String str, long j12, long j13) {
        if (this.f103775r == 5) {
            if (i12 >= 0 && i12 < 66000) {
                mo51553m0(z11, z12, i11, i12 + 300000, i13, j11, str, j12, j13);
                return;
            }
            return;
        }
        mo51553m0(z11, z12, i11, i12, i13, j11, str, j12, j13);
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: n */
    public void mo51554n() {
        if (AbstractC19444a.m101693a()) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: f10.b
                @Override // java.lang.Runnable
                public final void run() {
                    C9447a.m51545o0(C9447a.this);
                }
            });
        } else {
            super.mo51554n();
        }
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: o */
    public void mo51555o() {
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: q */
    public void mo51556q(Exception exc) {
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: s */
    public void mo51557s() {
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: t */
    public void mo51558t() {
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: u */
    public void mo51559u() {
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: y */
    public String mo51560y(int i11, String str) {
        return ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR;
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: z */
    public long mo51561z() {
        return 0L;
    }
}
