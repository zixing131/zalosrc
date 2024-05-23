package p10;

import com.zing.zalo.shortvideo.data.remote.common.RestResponse;
import com.zing.zalo.shortvideo.data.remote.ws.response.AbstractC9459a;
import com.zing.zalo.shortvideo.data.remote.ws.response.AbstractC9460b;
import com.zing.zalo.shortvideo.data.remote.ws.response.BlockUserCommentByOwner;
import com.zing.zalo.shortvideo.data.remote.ws.response.C9461c;
import com.zing.zalo.shortvideo.data.remote.ws.response.C9462d;
import com.zing.zalo.shortvideo.data.remote.ws.response.C9463e;
import com.zing.zalo.shortvideo.data.remote.ws.response.DeleteCommentByOwner;
import com.zing.zalo.shortvideo.data.remote.ws.response.EntryEventResponse;
import com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes;
import com.zing.zalo.shortvideo.data.remote.ws.response.GetStatLivestreamRes;
import com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse;
import com.zing.zalo.shortvideo.data.remote.ws.response.StreamData;
import com.zing.zalo.shortvideo.data.remote.ws.response.WsError;
import com.zing.zalo.shortvideo.data.remote.ws.response.WsRawResponse;
import f10.C18693e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import m10.C22713a;
import m10.C22714b;
import qn0.AbstractC25394i;
import un0.AbstractC27323a;
import v00.C27417l;

/* renamed from: p10.g */
/* loaded from: classes5.dex */
public final class C24603g {

    /* renamed from: a */
    private final C22714b f118381a;

    /* renamed from: b */
    private final C22713a f118382b;

    /* renamed from: p10.g$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f118383a;

        static {
            int[] iArr = new int[EnumC24604h.values().length];
            try {
                iArr[EnumC24604h.f118388s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24604h.f118391v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24604h.f118393x.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC24604h.f118389t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC24604h.f118392w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC24604h.f118390u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC24604h.f118394y.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC24604h.f118395z.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f118383a = iArr;
        }
    }

    public C24603g(C22714b c22714b, C22713a c22713a) {
        AbstractC19074t.m100208f(c22714b, "masterRes");
        AbstractC19074t.m100208f(c22713a, "masterResV2");
        this.f118381a = c22714b;
        this.f118382b = c22713a;
    }

    /* renamed from: a */
    public final AbstractC24599c m128092a(int i11, int i12, String str) {
        C24608l m128101a;
        AbstractC27323a abstractC27323a;
        AbstractC27323a abstractC27323a2;
        C24608l c24608l;
        AbstractC27323a abstractC27323a3;
        AbstractC27323a abstractC27323a4;
        C24608l m128101a2;
        AbstractC27323a abstractC27323a5;
        AbstractC27323a abstractC27323a6;
        C24608l c24608l2;
        AbstractC27323a abstractC27323a7;
        AbstractC27323a abstractC27323a8;
        C24608l m128101a3;
        AbstractC27323a abstractC27323a9;
        AbstractC27323a abstractC27323a10;
        AbstractC27323a abstractC27323a11;
        AbstractC27323a abstractC27323a12;
        C24608l m128101a4;
        AbstractC27323a abstractC27323a13;
        AbstractC27323a abstractC27323a14;
        C24608l m128101a5;
        AbstractC27323a abstractC27323a15;
        AbstractC27323a abstractC27323a16;
        C24608l m128101a6;
        AbstractC27323a abstractC27323a17;
        AbstractC27323a abstractC27323a18;
        C24608l m128101a7;
        AbstractC27323a abstractC27323a19;
        AbstractC27323a abstractC27323a20;
        C24608l m128101a8;
        AbstractC27323a abstractC27323a21;
        AbstractC27323a abstractC27323a22;
        switch (a.f118383a[EnumC24604h.Companion.m128095a(i11).ordinal()]) {
            case 1:
                C22714b c22714b = this.f118381a;
                if (str != null) {
                    try {
                        abstractC27323a = c22714b.f111303a;
                        KSerializer m131587a = AbstractC25394i.m131587a(abstractC27323a.mo131586a(), WsRawResponse.class);
                        abstractC27323a2 = c22714b.f111303a;
                        Object m139867d = abstractC27323a2.m139867d(m131587a, str);
                        WsRawResponse wsRawResponse = m139867d instanceof WsRawResponse ? (WsRawResponse) m139867d : null;
                        if (wsRawResponse != null) {
                            if (AbstractC24607k.m128098a(wsRawResponse)) {
                                String m51706a = wsRawResponse.m51706a();
                                abstractC27323a3 = c22714b.f111303a;
                                abstractC27323a4 = c22714b.f111303a;
                                Object m139867d2 = abstractC27323a3.m139867d(AbstractC25394i.m131587a(abstractC27323a4.mo131586a(), EntryEventResponse.class), m51706a != null ? m51706a : "{\"empty\":true}");
                                if (!(m139867d2 instanceof EntryEventResponse)) {
                                    m139867d2 = null;
                                }
                                c24608l = new C24608l(wsRawResponse.m51708c(), wsRawResponse.m51707b(), (EntryEventResponse) m139867d2, null, 8, null);
                            } else {
                                c24608l = new C24608l(wsRawResponse.m51708c(), wsRawResponse.m51707b(), null, new WsError("Api fail"), 4, null);
                            }
                            m128101a = c24608l;
                        } else {
                            m128101a = C24608l.Companion.m128101a(new WsError("Parse WsResponse is null"));
                        }
                    } catch (Exception e11) {
                        m128101a = C24608l.Companion.m128101a(e11);
                    }
                } else {
                    m128101a = C24608l.Companion.m128101a(new WsError("Extract data is null"));
                }
                if (AbstractC9459a.m51709a((EntryEventResponse) m128101a.m128099a())) {
                    return new C24600d((EntryEventResponse) m128101a.m128099a());
                }
                return null;
            case 2:
                C22714b c22714b2 = this.f118381a;
                if (str != null) {
                    try {
                        abstractC27323a5 = c22714b2.f111303a;
                        KSerializer m131587a2 = AbstractC25394i.m131587a(abstractC27323a5.mo131586a(), WsRawResponse.class);
                        abstractC27323a6 = c22714b2.f111303a;
                        Object m139867d3 = abstractC27323a6.m139867d(m131587a2, str);
                        WsRawResponse wsRawResponse2 = m139867d3 instanceof WsRawResponse ? (WsRawResponse) m139867d3 : null;
                        if (wsRawResponse2 != null) {
                            if (AbstractC24607k.m128098a(wsRawResponse2)) {
                                String m51706a2 = wsRawResponse2.m51706a();
                                abstractC27323a7 = c22714b2.f111303a;
                                abstractC27323a8 = c22714b2.f111303a;
                                Object m139867d4 = abstractC27323a7.m139867d(AbstractC25394i.m131587a(abstractC27323a8.mo131586a(), GetCommentLiveRes.class), m51706a2 != null ? m51706a2 : "{\"empty\":true}");
                                if (!(m139867d4 instanceof GetCommentLiveRes)) {
                                    m139867d4 = null;
                                }
                                c24608l2 = new C24608l(wsRawResponse2.m51708c(), wsRawResponse2.m51707b(), (GetCommentLiveRes) m139867d4, null, 8, null);
                            } else {
                                c24608l2 = new C24608l(wsRawResponse2.m51708c(), wsRawResponse2.m51707b(), null, new WsError("Api fail"), 4, null);
                            }
                            m128101a2 = c24608l2;
                        } else {
                            m128101a2 = C24608l.Companion.m128101a(new WsError("Parse WsResponse is null"));
                        }
                    } catch (Exception e12) {
                        m128101a2 = C24608l.Companion.m128101a(e12);
                    }
                } else {
                    m128101a2 = C24608l.Companion.m128101a(new WsError("Extract data is null"));
                }
                if (AbstractC9460b.m51710a((GetCommentLiveRes) m128101a2.m128099a())) {
                    return new C9461c((GetCommentLiveRes) m128101a2.m128099a());
                }
                return null;
            case 3:
                C22714b c22714b3 = this.f118381a;
                if (str != null) {
                    try {
                        abstractC27323a9 = c22714b3.f111303a;
                        KSerializer m131587a3 = AbstractC25394i.m131587a(abstractC27323a9.mo131586a(), WsRawResponse.class);
                        abstractC27323a10 = c22714b3.f111303a;
                        Object m139867d5 = abstractC27323a10.m139867d(m131587a3, str);
                        WsRawResponse wsRawResponse3 = m139867d5 instanceof WsRawResponse ? (WsRawResponse) m139867d5 : null;
                        if (wsRawResponse3 != null) {
                            if (AbstractC24607k.m128098a(wsRawResponse3)) {
                                String m51706a3 = wsRawResponse3.m51706a();
                                abstractC27323a11 = c22714b3.f111303a;
                                abstractC27323a12 = c22714b3.f111303a;
                                Object m139867d6 = abstractC27323a11.m139867d(AbstractC25394i.m131587a(abstractC27323a12.mo131586a(), GetStatLivestreamRes.class), m51706a3 != null ? m51706a3 : "{\"empty\":true}");
                                m128101a3 = new C24608l(wsRawResponse3.m51708c(), wsRawResponse3.m51707b(), (GetStatLivestreamRes) (m139867d6 instanceof GetStatLivestreamRes ? m139867d6 : null), null, 8, null);
                            } else {
                                m128101a3 = new C24608l(wsRawResponse3.m51708c(), wsRawResponse3.m51707b(), null, new WsError("Api fail"), 4, null);
                            }
                        } else {
                            m128101a3 = C24608l.Companion.m128101a(new WsError("Parse WsResponse is null"));
                        }
                    } catch (Exception e13) {
                        m128101a3 = C24608l.Companion.m128101a(e13);
                    }
                } else {
                    m128101a3 = C24608l.Companion.m128101a(new WsError("Extract data is null"));
                }
                return new C24605i((GetStatLivestreamRes) m128101a3.m128099a());
            case 4:
                C22713a c22713a = this.f118382b;
                if (str != null) {
                    try {
                        abstractC27323a13 = c22713a.f111302a;
                        C18693e c18693e = new C18693e(AbstractC25394i.m131587a(abstractC27323a13.mo131586a(), InteractEventResponse.class));
                        abstractC27323a14 = c22713a.f111302a;
                        RestResponse restResponse = (RestResponse) abstractC27323a14.m139867d(c18693e, str);
                        String m51533c = restResponse.m51533c();
                        Integer valueOf = Integer.valueOf(restResponse.m51531a());
                        Object m51532b = restResponse.m51532b();
                        if (m51532b instanceof InteractEventResponse) {
                            r9 = m51532b;
                        }
                        m128101a4 = new C24608l(m51533c, valueOf, (InteractEventResponse) r9, null, 8, null);
                    } catch (Exception e14) {
                        m128101a4 = C24608l.Companion.m128101a(e14);
                    }
                } else {
                    m128101a4 = C24608l.Companion.m128101a(new WsError("Extract data is null"));
                }
                return new C9462d((InteractEventResponse) m128101a4.m128099a());
            case 5:
                C22713a c22713a2 = this.f118382b;
                if (str != null) {
                    try {
                        abstractC27323a15 = c22713a2.f111302a;
                        C18693e c18693e2 = new C18693e(AbstractC25394i.m131587a(abstractC27323a15.mo131586a(), StreamData.class));
                        abstractC27323a16 = c22713a2.f111302a;
                        RestResponse restResponse2 = (RestResponse) abstractC27323a16.m139867d(c18693e2, str);
                        String m51533c2 = restResponse2.m51533c();
                        Integer valueOf2 = Integer.valueOf(restResponse2.m51531a());
                        Object m51532b2 = restResponse2.m51532b();
                        if (m51532b2 instanceof StreamData) {
                            r9 = m51532b2;
                        }
                        m128101a5 = new C24608l(m51533c2, valueOf2, (StreamData) r9, null, 8, null);
                    } catch (Exception e15) {
                        m128101a5 = C24608l.Companion.m128101a(e15);
                    }
                } else {
                    m128101a5 = C24608l.Companion.m128101a(new WsError("Extract data is null"));
                }
                return new C24606j((StreamData) m128101a5.m128099a());
            case 6:
                C22713a c22713a3 = this.f118382b;
                if (str != null) {
                    try {
                        abstractC27323a17 = c22713a3.f111302a;
                        C18693e c18693e3 = new C18693e(AbstractC25394i.m131587a(abstractC27323a17.mo131586a(), InteractEventResponse.class));
                        abstractC27323a18 = c22713a3.f111302a;
                        RestResponse restResponse3 = (RestResponse) abstractC27323a18.m139867d(c18693e3, str);
                        String m51533c3 = restResponse3.m51533c();
                        Integer valueOf3 = Integer.valueOf(restResponse3.m51531a());
                        Object m51532b3 = restResponse3.m51532b();
                        if (m51532b3 instanceof InteractEventResponse) {
                            r9 = m51532b3;
                        }
                        m128101a6 = new C24608l(m51533c3, valueOf3, (InteractEventResponse) r9, null, 8, null);
                    } catch (Exception e16) {
                        m128101a6 = C24608l.Companion.m128101a(e16);
                    }
                } else {
                    m128101a6 = C24608l.Companion.m128101a(new WsError("Extract data is null"));
                }
                return new C9463e((InteractEventResponse) m128101a6.m128099a());
            case 7:
                C22713a c22713a4 = this.f118382b;
                if (str != null) {
                    try {
                        abstractC27323a19 = c22713a4.f111302a;
                        C18693e c18693e4 = new C18693e(AbstractC25394i.m131587a(abstractC27323a19.mo131586a(), BlockUserCommentByOwner.class));
                        abstractC27323a20 = c22713a4.f111302a;
                        RestResponse restResponse4 = (RestResponse) abstractC27323a20.m139867d(c18693e4, str);
                        String m51533c4 = restResponse4.m51533c();
                        Integer valueOf4 = Integer.valueOf(restResponse4.m51531a());
                        Object m51532b4 = restResponse4.m51532b();
                        if (m51532b4 instanceof BlockUserCommentByOwner) {
                            r9 = m51532b4;
                        }
                        m128101a7 = new C24608l(m51533c4, valueOf4, (BlockUserCommentByOwner) r9, null, 8, null);
                    } catch (Exception e17) {
                        m128101a7 = C24608l.Companion.m128101a(e17);
                    }
                } else {
                    m128101a7 = C24608l.Companion.m128101a(new WsError("Extract data is null"));
                }
                return new C24597a((BlockUserCommentByOwner) m128101a7.m128099a());
            case 8:
                C22713a c22713a5 = this.f118382b;
                if (str != null) {
                    try {
                        abstractC27323a21 = c22713a5.f111302a;
                        C18693e c18693e5 = new C18693e(AbstractC25394i.m131587a(abstractC27323a21.mo131586a(), DeleteCommentByOwner.class));
                        abstractC27323a22 = c22713a5.f111302a;
                        RestResponse restResponse5 = (RestResponse) abstractC27323a22.m139867d(c18693e5, str);
                        String m51533c5 = restResponse5.m51533c();
                        Integer valueOf5 = Integer.valueOf(restResponse5.m51531a());
                        Object m51532b5 = restResponse5.m51532b();
                        if (m51532b5 instanceof DeleteCommentByOwner) {
                            r9 = m51532b5;
                        }
                        m128101a8 = new C24608l(m51533c5, valueOf5, (DeleteCommentByOwner) r9, null, 8, null);
                    } catch (Exception e18) {
                        m128101a8 = C24608l.Companion.m128101a(e18);
                    }
                } else {
                    m128101a8 = C24608l.Companion.m128101a(new WsError("Extract data is null"));
                }
                return new C24598b((DeleteCommentByOwner) m128101a8.m128099a());
            default:
                return null;
        }
    }

    public /* synthetic */ C24603g(C22714b c22714b, C22713a c22713a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C22714b(C27417l.f129055a.m140384h()) : c22714b, (i11 & 2) != 0 ? new C22713a(C27417l.f129055a.m140384h()) : c22713a);
    }
}
