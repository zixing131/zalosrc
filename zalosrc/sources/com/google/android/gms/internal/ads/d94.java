package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class d94 implements u44, e94 {

    /* renamed from: C */
    private zzbw f19140C;

    /* renamed from: D */
    private b74 f19141D;

    /* renamed from: E */
    private b74 f19142E;

    /* renamed from: F */
    private b74 f19143F;

    /* renamed from: G */
    private C4671k3 f19144G;

    /* renamed from: H */
    private C4671k3 f19145H;

    /* renamed from: I */
    private C4671k3 f19146I;

    /* renamed from: J */
    private boolean f19147J;

    /* renamed from: K */
    private boolean f19148K;

    /* renamed from: L */
    private int f19149L;

    /* renamed from: M */
    private int f19150M;

    /* renamed from: N */
    private int f19151N;

    /* renamed from: O */
    private boolean f19152O;

    /* renamed from: p */
    private final Context f19153p;

    /* renamed from: q */
    private final f94 f19154q;

    /* renamed from: r */
    private final PlaybackSession f19155r;

    /* renamed from: x */
    private String f19161x;

    /* renamed from: y */
    private PlaybackMetrics.Builder f19162y;

    /* renamed from: z */
    private int f19163z;

    /* renamed from: t */
    private final jq0 f19157t = new jq0();

    /* renamed from: u */
    private final ho0 f19158u = new ho0();

    /* renamed from: w */
    private final HashMap f19160w = new HashMap();

    /* renamed from: v */
    private final HashMap f19159v = new HashMap();

    /* renamed from: s */
    private final long f19156s = SystemClock.elapsedRealtime();

    /* renamed from: A */
    private int f19138A = 0;

    /* renamed from: B */
    private int f19139B = 0;

    private d94(Context context, PlaybackSession playbackSession) {
        this.f19153p = context.getApplicationContext();
        this.f19155r = playbackSession;
        a74 a74Var = new a74(a74.f16959h);
        this.f19154q = a74Var;
        a74Var.mo20029c(this);
    }

    /* renamed from: g */
    public static d94 m21291g(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager m28142a = y84.m28142a(context.getSystemService("media_metrics"));
        if (m28142a != null) {
            createPlaybackSession = m28142a.createPlaybackSession();
            return new d94(context, createPlaybackSession);
        }
        return null;
    }

    /* renamed from: i */
    private static int m21292i(int i11) {
        switch (g92.m22328V(i11)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    /* renamed from: m */
    private final void m21293m() {
        long longValue;
        long longValue2;
        int i11;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f19162y;
        if (builder != null && this.f19152O) {
            builder.setAudioUnderrunCount(this.f19151N);
            this.f19162y.setVideoFramesDropped(this.f19149L);
            this.f19162y.setVideoFramesPlayed(this.f19150M);
            Long l11 = (Long) this.f19159v.get(this.f19161x);
            PlaybackMetrics.Builder builder2 = this.f19162y;
            if (l11 == null) {
                longValue = 0;
            } else {
                longValue = l11.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l12 = (Long) this.f19160w.get(this.f19161x);
            PlaybackMetrics.Builder builder3 = this.f19162y;
            if (l12 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l12.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.f19162y;
            if (l12 != null && l12.longValue() > 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            builder4.setStreamSource(i11);
            PlaybackSession playbackSession = this.f19155r;
            build = this.f19162y.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.f19162y = null;
        this.f19161x = null;
        this.f19151N = 0;
        this.f19149L = 0;
        this.f19150M = 0;
        this.f19144G = null;
        this.f19145H = null;
        this.f19146I = null;
        this.f19152O = false;
    }

    /* renamed from: n */
    private final void m21294n(long j11, C4671k3 c4671k3, int i11) {
        int i12;
        if (g92.m22362t(this.f19145H, c4671k3)) {
            return;
        }
        if (this.f19145H == null) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        this.f19145H = c4671k3;
        m21298u(0, j11, c4671k3, i12);
    }

    /* renamed from: o */
    private final void m21295o(long j11, C4671k3 c4671k3, int i11) {
        int i12;
        if (g92.m22362t(this.f19146I, c4671k3)) {
            return;
        }
        if (this.f19146I == null) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        this.f19146I = c4671k3;
        m21298u(2, j11, c4671k3, i12);
    }

    /* renamed from: p */
    private final void m21296p(mr0 mr0Var, gf4 gf4Var) {
        int mo20105a;
        PlaybackMetrics.Builder builder = this.f19162y;
        if (gf4Var == null || (mo20105a = mr0Var.mo20105a(gf4Var.f20363a)) == -1) {
            return;
        }
        int i11 = 0;
        mr0Var.mo20108d(mo20105a, this.f19158u, false);
        mr0Var.mo20109e(this.f19158u.f21855c, this.f19157t, 0L);
        AbstractC4432dm abstractC4432dm = this.f19157t.f22931b.f17245b;
        int i12 = 2;
        if (abstractC4432dm != null) {
            int m22332Z = g92.m22332Z(abstractC4432dm.f19327a);
            if (m22332Z != 0) {
                if (m22332Z != 1) {
                    if (m22332Z != 2) {
                        i11 = 1;
                    } else {
                        i11 = 4;
                    }
                } else {
                    i11 = 5;
                }
            } else {
                i11 = 3;
            }
        }
        builder.setStreamType(i11);
        jq0 jq0Var = this.f19157t;
        if (jq0Var.f22941l != -9223372036854775807L && !jq0Var.f22939j && !jq0Var.f22936g && !jq0Var.m23721b()) {
            builder.setMediaDurationMillis(g92.m22352j0(this.f19157t.f22941l));
        }
        if (true != this.f19157t.m23721b()) {
            i12 = 1;
        }
        builder.setPlaybackType(i12);
        this.f19152O = true;
    }

    /* renamed from: r */
    private final void m21297r(long j11, C4671k3 c4671k3, int i11) {
        int i12;
        if (g92.m22362t(this.f19144G, c4671k3)) {
            return;
        }
        if (this.f19144G == null) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        this.f19144G = c4671k3;
        m21298u(1, j11, c4671k3, i12);
    }

    /* renamed from: u */
    private final void m21298u(int i11, long j11, C4671k3 c4671k3, int i12) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i13;
        String str;
        timeSinceCreatedMillis = u84.m26874a(i11).setTimeSinceCreatedMillis(j11 - this.f19156s);
        if (c4671k3 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i12 != 1) {
                i13 = 1;
            } else {
                i13 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i13);
            String str2 = c4671k3.f23098k;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = c4671k3.f23099l;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = c4671k3.f23096i;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i14 = c4671k3.f23095h;
            if (i14 != -1) {
                timeSinceCreatedMillis.setBitrate(i14);
            }
            int i15 = c4671k3.f23104q;
            if (i15 != -1) {
                timeSinceCreatedMillis.setWidth(i15);
            }
            int i16 = c4671k3.f23105r;
            if (i16 != -1) {
                timeSinceCreatedMillis.setHeight(i16);
            }
            int i17 = c4671k3.f23112y;
            if (i17 != -1) {
                timeSinceCreatedMillis.setChannelCount(i17);
            }
            int i18 = c4671k3.f23113z;
            if (i18 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i18);
            }
            String str5 = c4671k3.f23090c;
            if (str5 != null) {
                String[] m22314H = g92.m22314H(str5, "-");
                String str6 = m22314H[0];
                if (m22314H.length >= 2) {
                    str = m22314H[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f11 = c4671k3.f23106s;
            if (f11 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f11);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f19152O = true;
        PlaybackSession playbackSession = this.f19155r;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    /* renamed from: x */
    private final boolean m21299x(b74 b74Var) {
        if (b74Var != null && b74Var.f17655c.equals(this.f19154q.zzd())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x01e7, code lost:            if (r8 != 1) goto L137;     */
    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo21300a(jk0 jk0Var, t44 t44Var) {
        int i11;
        int i12;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        PlaybackStateEvent build;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis2;
        NetworkEvent build2;
        int i13;
        int errorCode;
        int m21292i;
        int i14;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis3;
        PlaybackErrorEvent.Builder errorCode2;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build3;
        zzx zzxVar;
        int i15;
        int i16;
        if (t44Var.m26565b() != 0) {
            for (int i17 = 0; i17 < t44Var.m26565b(); i17++) {
                int m26564a = t44Var.m26564a(i17);
                s44 m26566c = t44Var.m26566c(m26564a);
                if (m26564a == 0) {
                    this.f19154q.mo20027a(m26566c);
                } else if (m26564a == 11) {
                    this.f19154q.mo20031e(m26566c, this.f19163z);
                } else {
                    this.f19154q.mo20032f(m26566c);
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (t44Var.m26567d(0)) {
                s44 m26566c2 = t44Var.m26566c(0);
                if (this.f19162y != null) {
                    m21296p(m26566c2.f27538b, m26566c2.f27540d);
                }
            }
            if (t44Var.m26567d(2) && this.f19162y != null) {
                c83 m25630a = jk0Var.zzo().m25630a();
                int size = m25630a.size();
                int i18 = 0;
                loop1: while (true) {
                    if (i18 < size) {
                        p11 p11Var = (p11) m25630a.get(i18);
                        int i19 = 0;
                        while (true) {
                            int i21 = p11Var.f26026a;
                            i16 = i18 + 1;
                            if (i19 <= 0) {
                                if (p11Var.m25376d(i19) && (zzxVar = p11Var.m25374b(i19).f23102o) != null) {
                                    break loop1;
                                } else {
                                    i19++;
                                }
                            }
                        }
                    } else {
                        zzxVar = null;
                        break;
                    }
                    i18 = i16;
                }
                if (zzxVar != null) {
                    PlaybackMetrics.Builder builder = this.f19162y;
                    int i22 = g92.f20474a;
                    int i23 = 0;
                    while (true) {
                        if (i23 < zzxVar.f32170s) {
                            UUID uuid = zzxVar.m28835a(i23).f32163q;
                            if (uuid.equals(da4.f19169d)) {
                                i15 = 3;
                                break;
                            } else if (uuid.equals(da4.f19170e)) {
                                i15 = 2;
                                break;
                            } else {
                                if (uuid.equals(da4.f19168c)) {
                                    i15 = 6;
                                    break;
                                }
                                i23++;
                            }
                        } else {
                            i15 = 1;
                            break;
                        }
                    }
                    builder.setDrmType(i15);
                }
            }
            if (t44Var.m26567d(1011)) {
                this.f19151N++;
            }
            zzbw zzbwVar = this.f19140C;
            if (zzbwVar != null) {
                Context context = this.f19153p;
                if (zzbwVar.f31928p == 1001) {
                    i13 = 20;
                } else {
                    zzha zzhaVar = (zzha) zzbwVar;
                    int i24 = zzhaVar.f32139s;
                    int i25 = zzhaVar.f32143w;
                    Throwable cause = zzbwVar.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        if (cause instanceof zzfs) {
                            i14 = ((zzfs) cause).f32132s;
                            i13 = 5;
                            PlaybackSession playbackSession = this.f19155r;
                            timeSinceCreatedMillis3 = c74.m20816a().setTimeSinceCreatedMillis(elapsedRealtime - this.f19156s);
                            errorCode2 = timeSinceCreatedMillis3.setErrorCode(i13);
                            subErrorCode = errorCode2.setSubErrorCode(i14);
                            exception = subErrorCode.setException(zzbwVar);
                            build3 = exception.build();
                            playbackSession.reportPlaybackErrorEvent(build3);
                            this.f19152O = true;
                            this.f19140C = null;
                        } else if ((cause instanceof zzfr) || (cause instanceof zzbu)) {
                            i13 = 11;
                        } else {
                            boolean z11 = cause instanceof zzfq;
                            if (!z11 && !(cause instanceof zzga)) {
                                if (zzbwVar.f31928p == 1002) {
                                    i13 = 21;
                                } else if (cause instanceof zzpi) {
                                    Throwable cause2 = cause.getCause();
                                    cause2.getClass();
                                    int i26 = g92.f20474a;
                                    if (i26 >= 21 && (cause2 instanceof MediaDrm.MediaDrmStateException)) {
                                        errorCode = g92.m22329W(((MediaDrm.MediaDrmStateException) cause2).getDiagnosticInfo());
                                        m21292i = m21292i(errorCode);
                                        int i27 = m21292i;
                                        i14 = errorCode;
                                        i13 = i27;
                                        PlaybackSession playbackSession2 = this.f19155r;
                                        timeSinceCreatedMillis3 = c74.m20816a().setTimeSinceCreatedMillis(elapsedRealtime - this.f19156s);
                                        errorCode2 = timeSinceCreatedMillis3.setErrorCode(i13);
                                        subErrorCode = errorCode2.setSubErrorCode(i14);
                                        exception = subErrorCode.setException(zzbwVar);
                                        build3 = exception.build();
                                        playbackSession2.reportPlaybackErrorEvent(build3);
                                        this.f19152O = true;
                                        this.f19140C = null;
                                    } else if (i26 >= 23 && h74.m22718a(cause2)) {
                                        i13 = 27;
                                    } else if (cause2 instanceof NotProvisionedException) {
                                        i13 = 24;
                                    } else if (cause2 instanceof DeniedByServerException) {
                                        i13 = 29;
                                    } else {
                                        if (!(cause2 instanceof zzpt)) {
                                            i13 = cause2 instanceof zzpg ? 28 : 30;
                                        }
                                        i13 = 23;
                                    }
                                } else if ((cause instanceof zzfm) && (cause.getCause() instanceof FileNotFoundException)) {
                                    Throwable cause3 = cause.getCause();
                                    cause3.getClass();
                                    Throwable cause4 = cause3.getCause();
                                    i13 = (g92.f20474a >= 21 && (cause4 instanceof ErrnoException) && ((ErrnoException) cause4).errno == OsConstants.EACCES) ? 32 : 31;
                                } else {
                                    i13 = 9;
                                }
                            } else if (wy1.m27734b(context).m27736a() == 1) {
                                i13 = 3;
                            } else {
                                Throwable cause5 = cause.getCause();
                                i13 = cause5 instanceof UnknownHostException ? 6 : cause5 instanceof SocketTimeoutException ? 7 : (z11 && ((zzfq) cause).f32131r == 1) ? 4 : 8;
                            }
                        }
                    } else {
                        if (i24 == 1) {
                            i13 = 35;
                            if (i25 != 0) {
                            }
                        }
                        if (i24 == 1 && i25 == 3) {
                            i13 = 15;
                        } else {
                            if (i24 != 1 || i25 != 2) {
                                if (cause instanceof zzqp) {
                                    i14 = g92.m22329W(((zzqp) cause).f32159s);
                                    i13 = 13;
                                } else if (cause instanceof zzqm) {
                                    i14 = g92.m22329W(((zzqm) cause).f32155q);
                                    i13 = 14;
                                } else if (cause instanceof OutOfMemoryError) {
                                    i13 = 14;
                                } else if (cause instanceof zznu) {
                                    i14 = ((zznu) cause).f32147p;
                                    i13 = 17;
                                } else if (cause instanceof zznx) {
                                    i14 = ((zznx) cause).f32150p;
                                    i13 = 18;
                                } else {
                                    int i28 = g92.f20474a;
                                    if (cause instanceof MediaCodec.CryptoException) {
                                        errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                        m21292i = m21292i(errorCode);
                                        int i272 = m21292i;
                                        i14 = errorCode;
                                        i13 = i272;
                                    } else {
                                        i13 = 22;
                                    }
                                }
                                PlaybackSession playbackSession22 = this.f19155r;
                                timeSinceCreatedMillis3 = c74.m20816a().setTimeSinceCreatedMillis(elapsedRealtime - this.f19156s);
                                errorCode2 = timeSinceCreatedMillis3.setErrorCode(i13);
                                subErrorCode = errorCode2.setSubErrorCode(i14);
                                exception = subErrorCode.setException(zzbwVar);
                                build3 = exception.build();
                                playbackSession22.reportPlaybackErrorEvent(build3);
                                this.f19152O = true;
                                this.f19140C = null;
                            }
                            i13 = 23;
                        }
                    }
                }
                i14 = 0;
                PlaybackSession playbackSession222 = this.f19155r;
                timeSinceCreatedMillis3 = c74.m20816a().setTimeSinceCreatedMillis(elapsedRealtime - this.f19156s);
                errorCode2 = timeSinceCreatedMillis3.setErrorCode(i13);
                subErrorCode = errorCode2.setSubErrorCode(i14);
                exception = subErrorCode.setException(zzbwVar);
                build3 = exception.build();
                playbackSession222.reportPlaybackErrorEvent(build3);
                this.f19152O = true;
                this.f19140C = null;
            }
            if (t44Var.m26567d(2)) {
                q21 zzo = jk0Var.zzo();
                boolean m25631b = zzo.m25631b(2);
                boolean m25631b2 = zzo.m25631b(1);
                boolean m25631b3 = zzo.m25631b(3);
                if (!m25631b && !m25631b2) {
                    if (m25631b3) {
                        m25631b3 = true;
                    }
                }
                if (!m25631b) {
                    m21297r(elapsedRealtime, null, 0);
                }
                if (!m25631b2) {
                    m21294n(elapsedRealtime, null, 0);
                }
                if (!m25631b3) {
                    m21295o(elapsedRealtime, null, 0);
                }
            }
            if (m21299x(this.f19141D)) {
                C4671k3 c4671k3 = this.f19141D.f17653a;
                if (c4671k3.f23105r != -1) {
                    m21297r(elapsedRealtime, c4671k3, 0);
                    this.f19141D = null;
                }
            }
            if (m21299x(this.f19142E)) {
                m21294n(elapsedRealtime, this.f19142E.f17653a, 0);
                this.f19142E = null;
            }
            if (m21299x(this.f19143F)) {
                m21295o(elapsedRealtime, this.f19143F.f17653a, 0);
                this.f19143F = null;
            }
            switch (wy1.m27734b(this.f19153p).m27736a()) {
                case 0:
                    i11 = 0;
                    break;
                case 1:
                    i11 = 9;
                    break;
                case 2:
                    i11 = 2;
                    break;
                case 3:
                    i11 = 4;
                    break;
                case 4:
                    i11 = 5;
                    break;
                case 5:
                    i11 = 6;
                    break;
                case 6:
                case 8:
                default:
                    i11 = 1;
                    break;
                case 7:
                    i11 = 3;
                    break;
                case 9:
                    i11 = 8;
                    break;
                case 10:
                    i11 = 7;
                    break;
            }
            if (i11 != this.f19139B) {
                this.f19139B = i11;
                PlaybackSession playbackSession3 = this.f19155r;
                networkType = n74.m24861a().setNetworkType(i11);
                timeSinceCreatedMillis2 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.f19156s);
                build2 = timeSinceCreatedMillis2.build();
                playbackSession3.reportNetworkEvent(build2);
            }
            if (jk0Var.zzh() != 2) {
                this.f19147J = false;
            }
            if (((h44) jk0Var).m22704l() == null) {
                this.f19148K = false;
            } else if (t44Var.m26567d(10)) {
                this.f19148K = true;
            }
            int zzh = jk0Var.zzh();
            if (this.f19147J) {
                i12 = 5;
            } else if (this.f19148K) {
                i12 = 13;
            } else {
                i12 = 4;
                if (zzh == 4) {
                    i12 = 11;
                } else if (zzh == 2) {
                    int i29 = this.f19138A;
                    if (i29 == 0 || i29 == 2) {
                        i12 = 2;
                    } else if (!jk0Var.zzq()) {
                        i12 = 7;
                    } else if (jk0Var.zzi() != 0) {
                        i12 = 10;
                    } else {
                        i12 = 6;
                    }
                } else if (zzh == 3) {
                    if (jk0Var.zzq()) {
                        if (jk0Var.zzi() != 0) {
                            i12 = 9;
                        } else {
                            i12 = 3;
                        }
                    }
                } else if (zzh == 1 && this.f19138A != 0) {
                    i12 = 12;
                } else {
                    i12 = this.f19138A;
                }
            }
            if (this.f19138A != i12) {
                this.f19138A = i12;
                this.f19152O = true;
                PlaybackSession playbackSession4 = this.f19155r;
                state = y74.m28138a().setState(this.f19138A);
                timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(elapsedRealtime - this.f19156s);
                build = timeSinceCreatedMillis.build();
                playbackSession4.reportPlaybackStateEvent(build);
            }
            if (t44Var.m26567d(1028)) {
                this.f19154q.mo20030d(t44Var.m26566c(1028));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.e94
    /* renamed from: b */
    public final void mo21301b(s44 s44Var, String str, boolean z11) {
        gf4 gf4Var = s44Var.f27540d;
        if ((gf4Var == null || !gf4Var.m22262b()) && str.equals(this.f19161x)) {
            m21293m();
        }
        this.f19159v.remove(str);
        this.f19160w.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: c */
    public final void mo21302c(s44 s44Var, cf4 cf4Var) {
        gf4 gf4Var = s44Var.f27540d;
        if (gf4Var == null) {
            return;
        }
        C4671k3 c4671k3 = cf4Var.f18388b;
        c4671k3.getClass();
        b74 b74Var = new b74(c4671k3, 0, this.f19154q.mo20028b(s44Var.f27538b, gf4Var));
        int i11 = cf4Var.f18387a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return;
                    }
                    this.f19143F = b74Var;
                    return;
                }
            } else {
                this.f19142E = b74Var;
                return;
            }
        }
        this.f19141D = b74Var;
    }

    @Override // com.google.android.gms.internal.ads.e94
    /* renamed from: d */
    public final void mo21303d(s44 s44Var, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        gf4 gf4Var = s44Var.f27540d;
        if (gf4Var != null && gf4Var.m22262b()) {
            return;
        }
        m21293m();
        this.f19161x = str;
        playerName = j84.m23562a().setPlayerName("AndroidXMedia3");
        playerVersion = playerName.setPlayerVersion("1.0.0-beta02");
        this.f19162y = playerVersion;
        m21296p(s44Var.f27538b, s44Var.f27540d);
    }

    /* renamed from: e */
    public final LogSessionId m21304e() {
        LogSessionId sessionId;
        sessionId = this.f19155r.getSessionId();
        return sessionId;
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: f */
    public final /* synthetic */ void mo21305f(s44 s44Var, C4671k3 c4671k3, lw3 lw3Var) {
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: h */
    public final void mo21306h(s44 s44Var, int i11, long j11, long j12) {
        long longValue;
        gf4 gf4Var = s44Var.f27540d;
        if (gf4Var != null) {
            String mo20028b = this.f19154q.mo20028b(s44Var.f27538b, gf4Var);
            Long l11 = (Long) this.f19160w.get(mo20028b);
            Long l12 = (Long) this.f19159v.get(mo20028b);
            HashMap hashMap = this.f19160w;
            long j13 = 0;
            if (l11 == null) {
                longValue = 0;
            } else {
                longValue = l11.longValue();
            }
            hashMap.put(mo20028b, Long.valueOf(longValue + j11));
            HashMap hashMap2 = this.f19159v;
            if (l12 != null) {
                j13 = l12.longValue();
            }
            hashMap2.put(mo20028b, Long.valueOf(j13 + i11));
        }
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: j */
    public final void mo21307j(s44 s44Var, jj0 jj0Var, jj0 jj0Var2, int i11) {
        if (i11 == 1) {
            this.f19147J = true;
            i11 = 1;
        }
        this.f19163z = i11;
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: k */
    public final /* synthetic */ void mo21308k(s44 s44Var, C4671k3 c4671k3, lw3 lw3Var) {
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: l */
    public final /* synthetic */ void mo21309l(s44 s44Var, Object obj, long j11) {
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: q */
    public final void mo21310q(s44 s44Var, s41 s41Var) {
        b74 b74Var = this.f19141D;
        if (b74Var != null) {
            C4671k3 c4671k3 = b74Var.f17653a;
            if (c4671k3.f23105r == -1) {
                C5004t1 m23809b = c4671k3.m23809b();
                m23809b.m26528x(s41Var.f27529a);
                m23809b.m26507f(s41Var.f27530b);
                this.f19141D = new b74(m23809b.m26529y(), 0, b74Var.f17655c);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: s */
    public final void mo21311s(s44 s44Var, lv3 lv3Var) {
        this.f19149L += lv3Var.f24132g;
        this.f19150M += lv3Var.f24130e;
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: t */
    public final void mo21312t(s44 s44Var, zzbw zzbwVar) {
        this.f19140C = zzbwVar;
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: v */
    public final /* synthetic */ void mo21313v(s44 s44Var, int i11, long j11) {
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: w */
    public final void mo21314w(s44 s44Var, we4 we4Var, cf4 cf4Var, IOException iOException, boolean z11) {
    }

    @Override // com.google.android.gms.internal.ads.u44
    /* renamed from: y */
    public final /* synthetic */ void mo21315y(s44 s44Var, int i11) {
    }
}
