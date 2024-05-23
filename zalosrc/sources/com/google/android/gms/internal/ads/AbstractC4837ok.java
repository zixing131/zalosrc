package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ok */
/* loaded from: classes2.dex */
public abstract class AbstractC4837ok {

    /* renamed from: a */
    private static final int f25667a = AbstractC4916qo.m25831g("vide");

    /* renamed from: b */
    private static final int f25668b = AbstractC4916qo.m25831g("soun");

    /* renamed from: c */
    private static final int f25669c = AbstractC4916qo.m25831g("text");

    /* renamed from: d */
    private static final int f25670d = AbstractC4916qo.m25831g("sbtl");

    /* renamed from: e */
    private static final int f25671e = AbstractC4916qo.m25831g("subt");

    /* renamed from: f */
    private static final int f25672f = AbstractC4916qo.m25831g("clcp");

    /* renamed from: g */
    private static final int f25673g = AbstractC4916qo.m25831g("cenc");

    /* renamed from: h */
    private static final int f25674h = AbstractC4916qo.m25831g("meta");

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:            if (r12 == 0) goto L489;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x082b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c2  */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.List] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C5209yk m25198a(C4467ek c4467ek, C4504fk c4504fk, long j11, zzauv zzauvVar, boolean z11) {
        long j12;
        int i11;
        C4504fk c4504fk2;
        long j13;
        int i12;
        int i13;
        int m23669e;
        int i14;
        C4651jk c4651jk;
        C4467ek m21732d;
        C5209yk c5209yk;
        Pair create;
        int i15;
        C4504fk m21733e;
        int i16;
        boolean z12;
        int i17;
        String str;
        C4655jo c4655jo;
        Pair pair;
        C4800nk c4800nk;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        C4651jk c4651jk2;
        int i24;
        int i25;
        boolean z13;
        byte[] bArr;
        String str2;
        int i26;
        int i27;
        int i28;
        int i29;
        int m23667c;
        int i31;
        String str3;
        int i32;
        int i33;
        int i34;
        C4651jk c4651jk3;
        int i35;
        int i36;
        String str4;
        int i37;
        String str5;
        C4651jk c4651jk4;
        int m23667c2;
        String str6;
        int i38;
        int i39;
        String str7;
        String str8;
        Object obj;
        long j14;
        zzauv zzauvVar2 = zzauvVar;
        C4467ek m21732d2 = c4467ek.m21732d(AbstractC4541gk.f20631F);
        C4655jo c4655jo2 = m21732d2.m21733e(AbstractC4541gk.f20655T).f20142P0;
        c4655jo2.m23686v(16);
        int m23669e2 = c4655jo2.m23669e();
        int i41 = -1;
        int i42 = m23669e2 == f25668b ? 1 : m23669e2 == f25667a ? 2 : (m23669e2 == f25669c || m23669e2 == f25670d || m23669e2 == f25671e || m23669e2 == f25672f) ? 3 : m23669e2 == f25674h ? 4 : -1;
        String str9 = null;
        if (i42 == -1) {
            return null;
        }
        C4655jo c4655jo3 = c4467ek.m21733e(AbstractC4541gk.f20651P).f20142P0;
        c4655jo3.m23686v(8);
        int m22461b = AbstractC4541gk.m22461b(c4655jo3.m23669e());
        c4655jo3.m23687w(m22461b == 0 ? 8 : 16);
        int m23669e3 = c4655jo3.m23669e();
        c4655jo3.m23687w(4);
        int m23667c3 = c4655jo3.m23667c();
        int i43 = m22461b == 0 ? 4 : 8;
        int i44 = 0;
        while (true) {
            if (i44 < i43) {
                if (c4655jo3.f22891a[m23667c3 + i44] != -1) {
                    j12 = m22461b == 0 ? c4655jo3.m23677m() : c4655jo3.m23678n();
                } else {
                    i44++;
                }
            } else {
                c4655jo3.m23687w(i43);
                break;
            }
        }
        j12 = -9223372036854775807L;
        c4655jo3.m23687w(16);
        int m23669e4 = c4655jo3.m23669e();
        int m23669e5 = c4655jo3.m23669e();
        c4655jo3.m23687w(4);
        int m23669e6 = c4655jo3.m23669e();
        int m23669e7 = c4655jo3.m23669e();
        int i45 = 65536;
        if (m23669e4 == 0) {
            if (m23669e5 != 65536) {
                m23669e4 = 0;
            } else if (m23669e6 != -65536) {
                m23669e4 = 0;
                m23669e5 = 65536;
            } else {
                if (m23669e7 == 0) {
                    i11 = 90;
                    C4800nk c4800nk2 = new C4800nk(m23669e3, j12, i11);
                    if (j11 == -9223372036854775807L) {
                        j14 = c4800nk2.f25219b;
                        j13 = j14;
                        c4504fk2 = c4504fk;
                    } else {
                        c4504fk2 = c4504fk;
                        j13 = j11;
                    }
                    C4655jo c4655jo4 = c4504fk2.f20142P0;
                    c4655jo4.m23686v(8);
                    c4655jo4.m23687w(AbstractC4541gk.m22461b(c4655jo4.m23669e()) == 0 ? 8 : 16);
                    long m23677m = c4655jo4.m23677m();
                    long m25834j = j13 == -9223372036854775807L ? -9223372036854775807L : AbstractC4916qo.m25834j(j13, 1000000L, m23677m);
                    C4467ek m21732d3 = m21732d2.m21732d(AbstractC4541gk.f20633G).m21732d(AbstractC4541gk.f20635H);
                    C4655jo c4655jo5 = m21732d2.m21733e(AbstractC4541gk.f20654S).f20142P0;
                    c4655jo5.m23686v(8);
                    int m22461b2 = AbstractC4541gk.m22461b(c4655jo5.m23669e());
                    c4655jo5.m23687w(m22461b2 == 0 ? 8 : 16);
                    long m23677m2 = c4655jo5.m23677m();
                    c4655jo5.m23687w(m22461b2 == 0 ? 4 : 8);
                    int m23674j = c4655jo5.m23674j();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((char) (((m23674j >> 10) & 31) + 96));
                    sb2.append((char) (((m23674j >> 5) & 31) + 96));
                    sb2.append((char) ((m23674j & 31) + 96));
                    Pair create2 = Pair.create(Long.valueOf(m23677m2), sb2.toString());
                    C4655jo c4655jo6 = m21732d3.m21733e(AbstractC4541gk.f20656U).f20142P0;
                    i12 = c4800nk2.f25218a;
                    i13 = c4800nk2.f25220c;
                    String str10 = (String) create2.second;
                    c4655jo6.m23686v(12);
                    m23669e = c4655jo6.m23669e();
                    C4651jk c4651jk5 = new C4651jk(m23669e);
                    i14 = 0;
                    while (i14 < m23669e) {
                        int m23667c4 = c4655jo6.m23667c();
                        int m23669e8 = c4655jo6.m23669e();
                        if (m23669e8 > 0) {
                            i16 = i42;
                            z12 = true;
                        } else {
                            i16 = i42;
                            z12 = false;
                        }
                        String str11 = "childAtomSize should be positive";
                        AbstractC4361bo.m20612d(z12, "childAtomSize should be positive");
                        int m23669e9 = c4655jo6.m23669e();
                        if (m23669e9 != AbstractC4541gk.f20665c && m23669e9 != AbstractC4541gk.f20667d && m23669e9 != AbstractC4541gk.f20662a0 && m23669e9 != AbstractC4541gk.f20684l0 && m23669e9 != AbstractC4541gk.f20669e && m23669e9 != AbstractC4541gk.f20671f && m23669e9 != AbstractC4541gk.f20673g && m23669e9 != AbstractC4541gk.f20642K0 && m23669e9 != AbstractC4541gk.f20644L0) {
                            if (m23669e9 != AbstractC4541gk.f20679j && m23669e9 != AbstractC4541gk.f20664b0 && m23669e9 != AbstractC4541gk.f20689o && m23669e9 != AbstractC4541gk.f20693q && m23669e9 != AbstractC4541gk.f20697s && m23669e9 != AbstractC4541gk.f20703v && m23669e9 != AbstractC4541gk.f20699t && m23669e9 != AbstractC4541gk.f20701u && m23669e9 != AbstractC4541gk.f20710y0 && m23669e9 != AbstractC4541gk.f20712z0 && m23669e9 != AbstractC4541gk.f20685m && m23669e9 != AbstractC4541gk.f20687n && m23669e9 != AbstractC4541gk.f20681k && m23669e9 != AbstractC4541gk.f20650O0) {
                                int i46 = AbstractC4541gk.f20682k0;
                                if (m23669e9 != i46 && m23669e9 != AbstractC4541gk.f20702u0 && m23669e9 != AbstractC4541gk.f20704v0 && m23669e9 != AbstractC4541gk.f20706w0 && m23669e9 != AbstractC4541gk.f20708x0) {
                                    if (m23669e9 == AbstractC4541gk.f20648N0) {
                                        c4651jk5.f22854b = zzasw.m28682j(Integer.toString(i12), "application/x-camera-motion", str9, i41, zzauvVar2);
                                    }
                                    i24 = m23669e8;
                                    i23 = m23667c4;
                                    i22 = i14;
                                    c4651jk2 = c4651jk5;
                                    i17 = m23669e;
                                    str = str10;
                                    c4655jo = c4655jo6;
                                    pair = create2;
                                    c4800nk = c4800nk2;
                                    c4655jo.m23686v(i23 + i24);
                                    i14 = i22 + 1;
                                    zzauvVar2 = zzauvVar;
                                    c4655jo6 = c4655jo;
                                    c4651jk5 = c4651jk2;
                                    c4800nk2 = c4800nk;
                                    i42 = i16;
                                    m23669e = i17;
                                    str10 = str;
                                    create2 = pair;
                                    str9 = null;
                                    i41 = -1;
                                } else {
                                    c4655jo6.m23686v(m23667c4 + 16);
                                    long j15 = Long.MAX_VALUE;
                                    if (m23669e9 == i46) {
                                        obj = str9;
                                        str8 = "application/ttml+xml";
                                    } else if (m23669e9 == AbstractC4541gk.f20702u0) {
                                        int i47 = m23669e8 - 16;
                                        byte[] bArr2 = new byte[i47];
                                        c4655jo6.m23681q(bArr2, 0, i47);
                                        Object singletonList = Collections.singletonList(bArr2);
                                        str8 = "application/x-quicktime-tx3g";
                                        obj = singletonList;
                                    } else if (m23669e9 == AbstractC4541gk.f20704v0) {
                                        str8 = "application/x-mp4-vtt";
                                        obj = str9;
                                    } else if (m23669e9 == AbstractC4541gk.f20706w0) {
                                        obj = str9;
                                        str8 = "application/ttml+xml";
                                        j15 = 0;
                                    } else if (m23669e9 == AbstractC4541gk.f20708x0) {
                                        c4651jk5.f22856d = 1;
                                        str8 = "application/x-mp4-cea-608";
                                        obj = str9;
                                        C4651jk c4651jk6 = c4651jk5;
                                        i17 = m23669e;
                                        str2 = str10;
                                        c4651jk6.f22854b = zzasw.m28683k(Integer.toString(i12), str8, null, -1, 0, str10, -1, zzauvVar, j15, obj);
                                        pair = create2;
                                        c4651jk2 = c4651jk6;
                                        c4655jo = c4655jo6;
                                        i24 = m23669e8;
                                        c4800nk = c4800nk2;
                                        i22 = i14;
                                        i23 = m23667c4;
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                    C4651jk c4651jk62 = c4651jk5;
                                    i17 = m23669e;
                                    str2 = str10;
                                    c4651jk62.f22854b = zzasw.m28683k(Integer.toString(i12), str8, null, -1, 0, str10, -1, zzauvVar, j15, obj);
                                    pair = create2;
                                    c4651jk2 = c4651jk62;
                                    c4655jo = c4655jo6;
                                    i24 = m23669e8;
                                    c4800nk = c4800nk2;
                                    i22 = i14;
                                    i23 = m23667c4;
                                }
                            } else {
                                int i48 = i14;
                                C4651jk c4651jk7 = c4651jk5;
                                i17 = m23669e;
                                str2 = str10;
                                Pair pair2 = create2;
                                int i49 = m23669e8;
                                int i51 = m23667c4;
                                c4655jo6.m23686v(i51 + 16);
                                if (z11) {
                                    i26 = c4655jo6.m23674j();
                                    c4655jo6.m23687w(6);
                                } else {
                                    c4655jo6.m23687w(8);
                                    i26 = 0;
                                }
                                if (i26 != 0) {
                                    i27 = 1;
                                    if (i26 != 1) {
                                        if (i26 == 2) {
                                            c4655jo6.m23687w(16);
                                            i28 = (int) Math.round(Double.longBitsToDouble(c4655jo6.m23676l()));
                                            i29 = c4655jo6.m23673i();
                                            c4655jo6.m23687w(20);
                                            m23667c = c4655jo6.m23667c();
                                            if (m23669e9 != AbstractC4541gk.f20664b0) {
                                                i31 = i48;
                                                m23669e9 = m25202e(c4655jo6, i51, i49, c4651jk7, i31);
                                                c4655jo6.m23686v(m23667c);
                                            } else {
                                                i31 = i48;
                                            }
                                            if (m23669e9 != AbstractC4541gk.f20689o) {
                                                str3 = "audio/ac3";
                                            } else {
                                                str3 = m23669e9 == AbstractC4541gk.f20693q ? "audio/eac3" : m23669e9 == AbstractC4541gk.f20697s ? "audio/vnd.dts" : (m23669e9 == AbstractC4541gk.f20699t || m23669e9 == AbstractC4541gk.f20701u) ? "audio/vnd.dts.hd" : m23669e9 == AbstractC4541gk.f20703v ? "audio/vnd.dts.hd;profile=lbr" : m23669e9 == AbstractC4541gk.f20710y0 ? "audio/3gpp" : m23669e9 == AbstractC4541gk.f20712z0 ? "audio/amr-wb" : (m23669e9 == AbstractC4541gk.f20685m || m23669e9 == AbstractC4541gk.f20687n) ? "audio/raw" : m23669e9 == AbstractC4541gk.f20681k ? "audio/mpeg" : m23669e9 == AbstractC4541gk.f20650O0 ? "audio/alac" : null;
                                            }
                                            String str12 = str3;
                                            int i52 = i29;
                                            int i53 = i28;
                                            byte[] bArr3 = null;
                                            while (m23667c - i51 < i49) {
                                                c4655jo6.m23686v(m23667c);
                                                int m23669e10 = c4655jo6.m23669e();
                                                AbstractC4361bo.m20612d(m23669e10 > 0, str11);
                                                int m23669e11 = c4655jo6.m23669e();
                                                int i54 = AbstractC4541gk.f20641K;
                                                if (m23669e11 == i54 || (z11 && m23669e11 == AbstractC4541gk.f20683l)) {
                                                    i35 = i31;
                                                    String str13 = str12;
                                                    i36 = i51;
                                                    str4 = str11;
                                                    i37 = i49;
                                                    str5 = str2;
                                                    c4651jk4 = c4651jk7;
                                                    if (m23669e11 != i54) {
                                                        m23667c2 = c4655jo6.m23667c();
                                                        while (true) {
                                                            if (m23667c2 - m23667c >= m23669e10) {
                                                                m23667c2 = -1;
                                                                break;
                                                            }
                                                            c4655jo6.m23686v(m23667c2);
                                                            int m23669e12 = c4655jo6.m23669e();
                                                            AbstractC4361bo.m20612d(m23669e12 > 0, str4);
                                                            if (c4655jo6.m23669e() == AbstractC4541gk.f20641K) {
                                                                break;
                                                            }
                                                            m23667c2 += m23669e12;
                                                        }
                                                    } else {
                                                        m23667c2 = m23667c;
                                                    }
                                                    if (m23667c2 != -1) {
                                                        Pair m25203f = m25203f(c4655jo6, m23667c2);
                                                        str12 = (String) m25203f.first;
                                                        bArr3 = (byte[]) m25203f.second;
                                                        if ("audio/mp4a-latm".equals(str12)) {
                                                            Pair m20961a = AbstractC4397co.m20961a(bArr3);
                                                            i53 = ((Integer) m20961a.first).intValue();
                                                            i52 = ((Integer) m20961a.second).intValue();
                                                        }
                                                    } else {
                                                        str12 = str13;
                                                    }
                                                } else {
                                                    if (m23669e11 == AbstractC4541gk.f20691p) {
                                                        c4655jo6.m23686v(m23667c + 8);
                                                        str6 = str2;
                                                        c4651jk7.f22854b = AbstractC5020th.m26612b(c4655jo6, Integer.toString(i12), str6, zzauvVar2);
                                                    } else {
                                                        str6 = str2;
                                                        if (m23669e11 == AbstractC4541gk.f20695r) {
                                                            c4655jo6.m23686v(m23667c + 8);
                                                            c4651jk7.f22854b = AbstractC5020th.m26613c(c4655jo6, Integer.toString(i12), str6, zzauvVar2);
                                                        } else {
                                                            if (m23669e11 == AbstractC4541gk.f20705w) {
                                                                i38 = m23669e10;
                                                                i39 = m23667c;
                                                                i35 = i31;
                                                                str7 = str12;
                                                                str5 = str6;
                                                                i36 = i51;
                                                                str4 = str11;
                                                                i37 = i49;
                                                                c4651jk4 = c4651jk7;
                                                                c4651jk4.f22854b = zzasw.m28679g(Integer.toString(i12), str12, null, -1, -1, i52, i53, null, zzauvVar, 0, str5);
                                                            } else {
                                                                i38 = m23669e10;
                                                                i39 = m23667c;
                                                                i35 = i31;
                                                                str7 = str12;
                                                                str5 = str6;
                                                                i36 = i51;
                                                                str4 = str11;
                                                                i37 = i49;
                                                                c4651jk4 = c4651jk7;
                                                                if (m23669e11 == AbstractC4541gk.f20650O0) {
                                                                    m23669e10 = i38;
                                                                    byte[] bArr4 = new byte[m23669e10];
                                                                    m23667c = i39;
                                                                    c4655jo6.m23686v(m23667c);
                                                                    c4655jo6.m23681q(bArr4, 0, m23669e10);
                                                                    bArr3 = bArr4;
                                                                    str12 = str7;
                                                                }
                                                            }
                                                            m23669e10 = i38;
                                                            m23667c = i39;
                                                            str12 = str7;
                                                        }
                                                    }
                                                    i35 = i31;
                                                    str7 = str12;
                                                    str5 = str6;
                                                    i36 = i51;
                                                    str4 = str11;
                                                    i37 = i49;
                                                    c4651jk4 = c4651jk7;
                                                    str12 = str7;
                                                }
                                                m23667c += m23669e10;
                                                c4651jk7 = c4651jk4;
                                                str11 = str4;
                                                str2 = str5;
                                                i49 = i37;
                                                i31 = i35;
                                                i51 = i36;
                                                zzauvVar2 = zzauvVar;
                                            }
                                            i32 = i31;
                                            String str14 = str12;
                                            i33 = i51;
                                            i34 = i49;
                                            str = str2;
                                            c4651jk3 = c4651jk7;
                                            if (c4651jk3.f22854b != null && str14 != null) {
                                                c4655jo = c4655jo6;
                                                pair = pair2;
                                                i21 = i34;
                                                c4800nk = c4800nk2;
                                                c4651jk3.f22854b = zzasw.m28680h(Integer.toString(i12), str14, null, -1, -1, i52, i53, true != "audio/raw".equals(str14) ? -1 : 2, -1, -1, bArr3 == null ? null : Collections.singletonList(bArr3), zzauvVar, 0, str, null);
                                                c4651jk2 = c4651jk3;
                                                i22 = i32;
                                                i23 = i33;
                                            } else {
                                                pair = pair2;
                                                c4655jo = c4655jo6;
                                                c4800nk = c4800nk2;
                                                c4651jk2 = c4651jk3;
                                                i24 = i34;
                                                i22 = i32;
                                                i23 = i33;
                                                c4655jo.m23686v(i23 + i24);
                                                i14 = i22 + 1;
                                                zzauvVar2 = zzauvVar;
                                                c4655jo6 = c4655jo;
                                                c4651jk5 = c4651jk2;
                                                c4800nk2 = c4800nk;
                                                i42 = i16;
                                                m23669e = i17;
                                                str10 = str;
                                                create2 = pair;
                                                str9 = null;
                                                i41 = -1;
                                            }
                                        } else {
                                            pair = pair2;
                                            i23 = i51;
                                            c4651jk2 = c4651jk7;
                                            c4655jo = c4655jo6;
                                            i24 = i49;
                                            c4800nk = c4800nk2;
                                            i22 = i48;
                                        }
                                    }
                                } else {
                                    i27 = 1;
                                }
                                int m23674j2 = c4655jo6.m23674j();
                                c4655jo6.m23687w(6);
                                int m23672h = c4655jo6.m23672h();
                                if (i26 == i27) {
                                    c4655jo6.m23687w(16);
                                }
                                i28 = m23672h;
                                i29 = m23674j2;
                                m23667c = c4655jo6.m23667c();
                                if (m23669e9 != AbstractC4541gk.f20664b0) {
                                }
                                if (m23669e9 != AbstractC4541gk.f20689o) {
                                }
                                String str122 = str3;
                                int i522 = i29;
                                int i532 = i28;
                                byte[] bArr32 = null;
                                while (m23667c - i51 < i49) {
                                }
                                i32 = i31;
                                String str142 = str122;
                                i33 = i51;
                                i34 = i49;
                                str = str2;
                                c4651jk3 = c4651jk7;
                                if (c4651jk3.f22854b != null) {
                                }
                                pair = pair2;
                                c4655jo = c4655jo6;
                                c4800nk = c4800nk2;
                                c4651jk2 = c4651jk3;
                                i24 = i34;
                                i22 = i32;
                                i23 = i33;
                                c4655jo.m23686v(i23 + i24);
                                i14 = i22 + 1;
                                zzauvVar2 = zzauvVar;
                                c4655jo6 = c4655jo;
                                c4651jk5 = c4651jk2;
                                c4800nk2 = c4800nk;
                                i42 = i16;
                                m23669e = i17;
                                str10 = str;
                                create2 = pair;
                                str9 = null;
                                i41 = -1;
                            }
                            str = str2;
                            c4655jo.m23686v(i23 + i24);
                            i14 = i22 + 1;
                            zzauvVar2 = zzauvVar;
                            c4655jo6 = c4655jo;
                            c4651jk5 = c4651jk2;
                            c4800nk2 = c4800nk;
                            i42 = i16;
                            m23669e = i17;
                            str10 = str;
                            create2 = pair;
                            str9 = null;
                            i41 = -1;
                        } else {
                            int i55 = i14;
                            i17 = m23669e;
                            str = str10;
                            c4655jo = c4655jo6;
                            pair = create2;
                            c4800nk = c4800nk2;
                            C4651jk c4651jk8 = c4651jk5;
                            c4655jo.m23686v(m23667c4 + 16);
                            c4655jo.m23687w(16);
                            int m23674j3 = c4655jo.m23674j();
                            int m23674j4 = c4655jo.m23674j();
                            c4655jo.m23687w(50);
                            int m23667c5 = c4655jo.m23667c();
                            if (m23669e9 == AbstractC4541gk.f20662a0) {
                                i18 = i55;
                                i19 = m23669e8;
                                m23669e9 = m25202e(c4655jo, m23667c4, i19, c4651jk8, i18);
                                c4655jo.m23686v(m23667c5);
                            } else {
                                i18 = i55;
                                i19 = m23669e8;
                            }
                            String str15 = null;
                            boolean z14 = false;
                            List list = null;
                            float f11 = 1.0f;
                            byte[] bArr5 = null;
                            int i56 = -1;
                            while (m23667c5 - m23667c4 < i19) {
                                c4655jo.m23686v(m23667c5);
                                int m23667c6 = c4655jo.m23667c();
                                int m23669e13 = c4655jo.m23669e();
                                if (m23669e13 == 0) {
                                    if (c4655jo.m23667c() - m23667c4 == i19) {
                                        break;
                                    }
                                    m23669e13 = 0;
                                }
                                AbstractC4361bo.m20612d(m23669e13 > 0, "childAtomSize should be positive");
                                int m23669e14 = c4655jo.m23669e();
                                int i57 = i19;
                                if (m23669e14 == AbstractC4541gk.f20637I) {
                                    AbstractC4361bo.m20613e(str15 == null);
                                    c4655jo.m23686v(m23667c6 + 8);
                                    C4953ro m26146a = C4953ro.m26146a(c4655jo);
                                    list = m26146a.f27327a;
                                    c4651jk8.f22855c = m26146a.f27328b;
                                    if (!z14) {
                                        f11 = m26146a.f27329c;
                                    }
                                    str15 = "video/avc";
                                } else if (m23669e14 == AbstractC4541gk.f20639J) {
                                    AbstractC4361bo.m20613e(str15 == null);
                                    c4655jo.m23686v(m23667c6 + 8);
                                    C5101vo m27323a = C5101vo.m27323a(c4655jo);
                                    list = m27323a.f29421a;
                                    c4651jk8.f22855c = m27323a.f29422b;
                                    str15 = "video/hevc";
                                } else if (m23669e14 == AbstractC4541gk.f20646M0) {
                                    AbstractC4361bo.m20613e(str15 == null);
                                    str15 = m23669e9 == AbstractC4541gk.f20642K0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                } else if (m23669e14 == AbstractC4541gk.f20675h) {
                                    AbstractC4361bo.m20613e(str15 == null);
                                    str15 = "video/3gpp";
                                } else {
                                    if (m23669e14 == AbstractC4541gk.f20641K) {
                                        AbstractC4361bo.m20613e(str15 == null);
                                        Pair m25203f2 = m25203f(c4655jo, m23667c6);
                                        String str16 = (String) m25203f2.first;
                                        list = Collections.singletonList((byte[]) m25203f2.second);
                                        i25 = m23669e9;
                                        str15 = str16;
                                    } else if (m23669e14 == AbstractC4541gk.f20680j0) {
                                        c4655jo.m23686v(m23667c6 + 8);
                                        f11 = c4655jo.m23673i() / c4655jo.m23673i();
                                        i25 = m23669e9;
                                        z14 = true;
                                    } else if (m23669e14 == AbstractC4541gk.f20638I0) {
                                        int i58 = m23667c6 + 8;
                                        while (true) {
                                            if (i58 - m23667c6 >= m23669e13) {
                                                i25 = m23669e9;
                                                z13 = z14;
                                                bArr = null;
                                                break;
                                            }
                                            c4655jo.m23686v(i58);
                                            int m23669e15 = c4655jo.m23669e();
                                            i25 = m23669e9;
                                            z13 = z14;
                                            if (c4655jo.m23669e() == AbstractC4541gk.f20640J0) {
                                                bArr = Arrays.copyOfRange(c4655jo.f22891a, i58, m23669e15 + i58);
                                                break;
                                            }
                                            i58 += m23669e15;
                                            z14 = z13;
                                            m23669e9 = i25;
                                        }
                                        z14 = z13;
                                        bArr5 = bArr;
                                    } else {
                                        i25 = m23669e9;
                                        boolean z15 = z14;
                                        if (m23669e14 == AbstractC4541gk.f20636H0) {
                                            int m23671g = c4655jo.m23671g();
                                            c4655jo.m23687w(3);
                                            if (m23671g == 0) {
                                                int m23671g2 = c4655jo.m23671g();
                                                if (m23671g2 == 0) {
                                                    z14 = z15;
                                                    i56 = 0;
                                                } else if (m23671g2 == 1) {
                                                    z14 = z15;
                                                    i56 = 1;
                                                } else if (m23671g2 == 2) {
                                                    z14 = z15;
                                                    i56 = 2;
                                                } else if (m23671g2 == 3) {
                                                    z14 = z15;
                                                    i56 = 3;
                                                }
                                                m23667c5 += m23669e13;
                                                m23669e9 = i25;
                                                i19 = i57;
                                            }
                                        }
                                        z14 = z15;
                                        m23667c5 += m23669e13;
                                        m23669e9 = i25;
                                        i19 = i57;
                                    }
                                    m23667c5 += m23669e13;
                                    m23669e9 = i25;
                                    i19 = i57;
                                }
                                i25 = m23669e9;
                                m23667c5 += m23669e13;
                                m23669e9 = i25;
                                i19 = i57;
                            }
                            i21 = i19;
                            if (str15 != null) {
                                i24 = i21;
                                i22 = i18;
                                byte[] bArr6 = bArr5;
                                i23 = m23667c4;
                                c4651jk2 = c4651jk8;
                                c4651jk2.f22854b = zzasw.m28684l(Integer.toString(i12), str15, null, -1, -1, m23674j3, m23674j4, -1.0f, list, i13, f11, bArr6, i56, null, zzauvVar);
                                c4655jo.m23686v(i23 + i24);
                                i14 = i22 + 1;
                                zzauvVar2 = zzauvVar;
                                c4655jo6 = c4655jo;
                                c4651jk5 = c4651jk2;
                                c4800nk2 = c4800nk;
                                i42 = i16;
                                m23669e = i17;
                                str10 = str;
                                create2 = pair;
                                str9 = null;
                                i41 = -1;
                            } else {
                                i22 = i18;
                                i23 = m23667c4;
                                c4651jk2 = c4651jk8;
                            }
                        }
                        i24 = i21;
                        c4655jo.m23686v(i23 + i24);
                        i14 = i22 + 1;
                        zzauvVar2 = zzauvVar;
                        c4655jo6 = c4655jo;
                        c4651jk5 = c4651jk2;
                        c4800nk2 = c4800nk;
                        i42 = i16;
                        m23669e = i17;
                        str10 = str;
                        create2 = pair;
                        str9 = null;
                        i41 = -1;
                    }
                    c4651jk = c4651jk5;
                    int i59 = i42;
                    Pair pair3 = create2;
                    C4800nk c4800nk3 = c4800nk2;
                    m21732d = c4467ek.m21732d(AbstractC4541gk.f20652Q);
                    if (m21732d == null && (m21733e = m21732d.m21733e(AbstractC4541gk.f20653R)) != null) {
                        C4655jo c4655jo7 = m21733e.f20142P0;
                        c4655jo7.m23686v(8);
                        int m22461b3 = AbstractC4541gk.m22461b(c4655jo7.m23669e());
                        int m23673i = c4655jo7.m23673i();
                        long[] jArr = new long[m23673i];
                        long[] jArr2 = new long[m23673i];
                        for (int i61 = 0; i61 < m23673i; i61++) {
                            jArr[i61] = m22461b3 == 1 ? c4655jo7.m23678n() : c4655jo7.m23677m();
                            jArr2[i61] = m22461b3 == 1 ? c4655jo7.m23676l() : c4655jo7.m23669e();
                            if (c4655jo7.m23680p() == 1) {
                                c4655jo7.m23687w(2);
                            } else {
                                throw new IllegalArgumentException("Unsupported media rate.");
                            }
                        }
                        create = Pair.create(jArr, jArr2);
                        c5209yk = null;
                    } else {
                        c5209yk = null;
                        create = Pair.create(null, null);
                    }
                    if (c4651jk.f22854b == null) {
                        return c5209yk;
                    }
                    i15 = c4800nk3.f25218a;
                    return new C5209yk(i15, i59, ((Long) pair3.first).longValue(), m23677m, m25834j, c4651jk.f22854b, c4651jk.f22856d, c4651jk.f22853a, c4651jk.f22855c, (long[]) create.first, (long[]) create.second);
                }
                m23669e4 = 0;
                m23669e5 = 65536;
                m23669e6 = -65536;
            }
        }
        if (m23669e4 != 0) {
            i45 = m23669e6;
        } else if (m23669e5 == -65536) {
            if (m23669e6 != 65536) {
                i45 = m23669e6;
            } else if (m23669e7 == 0) {
                i11 = 270;
                C4800nk c4800nk22 = new C4800nk(m23669e3, j12, i11);
                if (j11 == -9223372036854775807L) {
                }
                C4655jo c4655jo42 = c4504fk2.f20142P0;
                c4655jo42.m23686v(8);
                c4655jo42.m23687w(AbstractC4541gk.m22461b(c4655jo42.m23669e()) == 0 ? 8 : 16);
                long m23677m3 = c4655jo42.m23677m();
                if (j13 == -9223372036854775807L) {
                }
                C4467ek m21732d32 = m21732d2.m21732d(AbstractC4541gk.f20633G).m21732d(AbstractC4541gk.f20635H);
                C4655jo c4655jo52 = m21732d2.m21733e(AbstractC4541gk.f20654S).f20142P0;
                c4655jo52.m23686v(8);
                int m22461b22 = AbstractC4541gk.m22461b(c4655jo52.m23669e());
                c4655jo52.m23687w(m22461b22 == 0 ? 8 : 16);
                long m23677m22 = c4655jo52.m23677m();
                c4655jo52.m23687w(m22461b22 == 0 ? 4 : 8);
                int m23674j5 = c4655jo52.m23674j();
                StringBuilder sb22 = new StringBuilder();
                sb22.append((char) (((m23674j5 >> 10) & 31) + 96));
                sb22.append((char) (((m23674j5 >> 5) & 31) + 96));
                sb22.append((char) ((m23674j5 & 31) + 96));
                Pair create22 = Pair.create(Long.valueOf(m23677m22), sb22.toString());
                C4655jo c4655jo62 = m21732d32.m21733e(AbstractC4541gk.f20656U).f20142P0;
                i12 = c4800nk22.f25218a;
                i13 = c4800nk22.f25220c;
                String str102 = (String) create22.second;
                c4655jo62.m23686v(12);
                m23669e = c4655jo62.m23669e();
                C4651jk c4651jk52 = new C4651jk(m23669e);
                i14 = 0;
                while (i14 < m23669e) {
                }
                c4651jk = c4651jk52;
                int i592 = i42;
                Pair pair32 = create22;
                C4800nk c4800nk32 = c4800nk22;
                m21732d = c4467ek.m21732d(AbstractC4541gk.f20652Q);
                if (m21732d == null) {
                }
                c5209yk = null;
                create = Pair.create(null, null);
                if (c4651jk.f22854b == null) {
                }
            }
            m23669e4 = 0;
            m23669e5 = -65536;
        } else {
            i45 = m23669e6;
            m23669e4 = 0;
        }
        i11 = (m23669e4 == -65536 && m23669e5 == 0 && i45 == 0 && m23669e7 == -65536) ? 180 : 0;
        C4800nk c4800nk222 = new C4800nk(m23669e3, j12, i11);
        if (j11 == -9223372036854775807L) {
        }
        C4655jo c4655jo422 = c4504fk2.f20142P0;
        c4655jo422.m23686v(8);
        c4655jo422.m23687w(AbstractC4541gk.m22461b(c4655jo422.m23669e()) == 0 ? 8 : 16);
        long m23677m32 = c4655jo422.m23677m();
        if (j13 == -9223372036854775807L) {
        }
        C4467ek m21732d322 = m21732d2.m21732d(AbstractC4541gk.f20633G).m21732d(AbstractC4541gk.f20635H);
        C4655jo c4655jo522 = m21732d2.m21733e(AbstractC4541gk.f20654S).f20142P0;
        c4655jo522.m23686v(8);
        int m22461b222 = AbstractC4541gk.m22461b(c4655jo522.m23669e());
        c4655jo522.m23687w(m22461b222 == 0 ? 8 : 16);
        long m23677m222 = c4655jo522.m23677m();
        c4655jo522.m23687w(m22461b222 == 0 ? 4 : 8);
        int m23674j52 = c4655jo522.m23674j();
        StringBuilder sb222 = new StringBuilder();
        sb222.append((char) (((m23674j52 >> 10) & 31) + 96));
        sb222.append((char) (((m23674j52 >> 5) & 31) + 96));
        sb222.append((char) ((m23674j52 & 31) + 96));
        Pair create222 = Pair.create(Long.valueOf(m23677m222), sb222.toString());
        C4655jo c4655jo622 = m21732d322.m21733e(AbstractC4541gk.f20656U).f20142P0;
        i12 = c4800nk222.f25218a;
        i13 = c4800nk222.f25220c;
        String str1022 = (String) create222.second;
        c4655jo622.m23686v(12);
        m23669e = c4655jo622.m23669e();
        C4651jk c4651jk522 = new C4651jk(m23669e);
        i14 = 0;
        while (i14 < m23669e) {
        }
        c4651jk = c4651jk522;
        int i5922 = i42;
        Pair pair322 = create222;
        C4800nk c4800nk322 = c4800nk222;
        m21732d = c4467ek.m21732d(AbstractC4541gk.f20652Q);
        if (m21732d == null) {
        }
        c5209yk = null;
        create = Pair.create(null, null);
        if (c4651jk.f22854b == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0176 A[ADDED_TO_REGION, LOOP:10: B:172:0x0176->B:173:0x0178, LOOP_START, PHI: r14 r15 r22 r25
  0x0176: PHI (r14v3 int) = (r14v1 int), (r14v10 int) binds: [B:171:0x0174, B:173:0x0178] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r15v3 int) = (r15v1 int), (r15v9 int) binds: [B:171:0x0174, B:173:0x0178] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r22v2 int) = (r22v1 int), (r22v5 int) binds: [B:171:0x0174, B:173:0x0178] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r25v2 long) = (r25v1 long), (r25v4 long) binds: [B:171:0x0174, B:173:0x0178] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x029d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4358bl m25199b(C5209yk c5209yk, C4467ek c4467ek, C4799nj c4799nj) {
        InterfaceC4615ik c4763mk;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        long j11;
        int i15;
        C5209yk c5209yk2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int[] iArr;
        long[] jArr;
        long[] jArr2;
        int[] iArr2;
        InterfaceC4615ik interfaceC4615ik;
        long[] jArr3;
        int i22;
        int i23;
        long[] jArr4;
        int[] iArr3;
        int[] iArr4;
        long[] jArr5;
        boolean z12;
        long[] jArr6;
        int[] iArr5;
        long[] jArr7;
        int length;
        C4504fk m21733e = c4467ek.m21733e(AbstractC4541gk.f20694q0);
        if (m21733e != null) {
            c4763mk = new C4725lk(m21733e);
        } else {
            C4504fk m21733e2 = c4467ek.m21733e(AbstractC4541gk.f20696r0);
            if (m21733e2 != null) {
                c4763mk = new C4763mk(m21733e2);
            } else {
                throw new zzasz("Track has no sample table size information");
            }
        }
        int zza = c4763mk.zza();
        if (zza == 0) {
            return new C4358bl(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        C4504fk m21733e3 = c4467ek.m21733e(AbstractC4541gk.f20698s0);
        if (m21733e3 == null) {
            m21733e3 = c4467ek.m21733e(AbstractC4541gk.f20700t0);
            z11 = true;
        } else {
            z11 = false;
        }
        C4655jo c4655jo = m21733e3.f20142P0;
        C4655jo c4655jo2 = c4467ek.m21733e(AbstractC4541gk.f20692p0).f20142P0;
        C4655jo c4655jo3 = c4467ek.m21733e(AbstractC4541gk.f20686m0).f20142P0;
        C4504fk m21733e4 = c4467ek.m21733e(AbstractC4541gk.f20688n0);
        C4655jo c4655jo4 = m21733e4 != null ? m21733e4.f20142P0 : null;
        C4504fk m21733e5 = c4467ek.m21733e(AbstractC4541gk.f20690o0);
        C4655jo c4655jo5 = m21733e5 != null ? m21733e5.f20142P0 : null;
        C4578hk c4578hk = new C4578hk(c4655jo2, c4655jo, z11);
        c4655jo3.m23686v(12);
        int m23673i = c4655jo3.m23673i() - 1;
        int m23673i2 = c4655jo3.m23673i();
        int m23673i3 = c4655jo3.m23673i();
        if (c4655jo5 != null) {
            c4655jo5.m23686v(12);
            i11 = c4655jo5.m23673i();
        } else {
            i11 = 0;
        }
        if (c4655jo4 != null) {
            c4655jo4.m23686v(12);
            i12 = c4655jo4.m23673i();
            if (i12 > 0) {
                i13 = c4655jo4.m23673i() - 1;
                if (c4763mk.zzc() && "audio/raw".equals(c5209yk.f30975f.f31836u) && m23673i == 0) {
                    if (i11 != 0 && i12 == 0) {
                        int i24 = c4578hk.f21793a;
                        long[] jArr8 = new long[i24];
                        int[] iArr6 = new int[i24];
                        while (c4578hk.m22925a()) {
                            int i25 = c4578hk.f21794b;
                            jArr8[i25] = c4578hk.f21796d;
                            iArr6[i25] = c4578hk.f21795c;
                        }
                        int zzb = c4763mk.zzb();
                        long j12 = m23673i3;
                        int i26 = 8192 / zzb;
                        int i27 = 0;
                        for (int i28 = 0; i28 < i24; i28++) {
                            i27 += AbstractC4916qo.m25828d(iArr6[i28], i26);
                        }
                        long[] jArr9 = new long[i27];
                        iArr = new int[i27];
                        long[] jArr10 = new long[i27];
                        int[] iArr7 = new int[i27];
                        int i29 = 0;
                        int i31 = 0;
                        int i32 = 0;
                        int i33 = 0;
                        while (i29 < i24) {
                            int i34 = iArr6[i29];
                            long j13 = jArr8[i29];
                            int i35 = i31;
                            int i36 = i32;
                            int i37 = i24;
                            int i38 = i36;
                            long[] jArr11 = jArr8;
                            int i39 = i34;
                            while (i39 > 0) {
                                int min = Math.min(i26, i39);
                                jArr9[i33] = j13;
                                int[] iArr8 = iArr6;
                                int i41 = zzb * min;
                                iArr[i33] = i41;
                                int max = Math.max(i35, i41);
                                jArr10[i33] = i38 * j12;
                                iArr7[i33] = 1;
                                j13 += iArr[i33];
                                i38 += min;
                                i39 -= min;
                                i33++;
                                iArr6 = iArr8;
                                i35 = max;
                            }
                            i29++;
                            i31 = i35;
                            jArr8 = jArr11;
                            i32 = i38;
                            i24 = i37;
                        }
                        c5209yk2 = c5209yk;
                        iArr2 = iArr7;
                        jArr = jArr10;
                        i21 = i31;
                        j11 = 0;
                        jArr2 = jArr9;
                        jArr4 = c5209yk2.f30978i;
                        if (jArr4 == null && !c4799nj.m24930a()) {
                            if (jArr4.length == 1 && c5209yk2.f30971b == 1 && (length = jArr.length) >= 2) {
                                long j14 = c5209yk2.f30979j[0];
                                long m25834j = j14 + AbstractC4916qo.m25834j(jArr4[0], c5209yk2.f30972c, c5209yk2.f30973d);
                                long j15 = jArr[0];
                                if (j15 <= j14 && j14 < jArr[1] && jArr[length - 1] < m25834j && m25834j <= j11) {
                                    long m25834j2 = AbstractC4916qo.m25834j(j14 - j15, c5209yk2.f30975f.f31822H, c5209yk2.f30972c);
                                    long m25834j3 = AbstractC4916qo.m25834j(j11 - m25834j, c5209yk2.f30975f.f31822H, c5209yk2.f30972c);
                                    if (m25834j2 == 0) {
                                        if (m25834j3 != 0) {
                                            m25834j2 = 0;
                                        }
                                    }
                                    if (m25834j2 <= 2147483647L && m25834j3 <= 2147483647L) {
                                        c4799nj.f25211a = (int) m25834j2;
                                        c4799nj.f25212b = (int) m25834j3;
                                        AbstractC4916qo.m25838n(jArr, 1000000L, c5209yk2.f30972c);
                                        return new C4358bl(jArr2, iArr, i21, jArr, iArr2);
                                    }
                                }
                            }
                            long[] jArr12 = c5209yk2.f30978i;
                            if (jArr12.length == 1) {
                                char c11 = 0;
                                if (jArr12[0] == 0) {
                                    int i42 = 0;
                                    while (i42 < jArr.length) {
                                        jArr[i42] = AbstractC4916qo.m25834j(jArr[i42] - c5209yk2.f30979j[c11], 1000000L, c5209yk2.f30972c);
                                        i42++;
                                        c11 = 0;
                                    }
                                    return new C4358bl(jArr2, iArr, i21, jArr, iArr2);
                                }
                            }
                            boolean z13 = c5209yk2.f30971b == 1;
                            int i43 = 0;
                            int i44 = 0;
                            boolean z14 = false;
                            int i45 = 0;
                            while (true) {
                                long[] jArr13 = c5209yk2.f30978i;
                                if (i45 >= jArr13.length) {
                                    break;
                                }
                                int[] iArr9 = iArr;
                                int i46 = i21;
                                long j16 = c5209yk2.f30979j[i45];
                                if (j16 != -1) {
                                    jArr7 = jArr2;
                                    long m25834j4 = AbstractC4916qo.m25834j(jArr13[i45], c5209yk2.f30972c, c5209yk2.f30973d);
                                    int m25826b = AbstractC4916qo.m25826b(jArr, j16, true, true);
                                    int m25826b2 = AbstractC4916qo.m25826b(jArr, j16 + m25834j4, z13, false);
                                    i43 += m25826b2 - m25826b;
                                    z14 = (i44 != m25826b) | z14;
                                    i44 = m25826b2;
                                } else {
                                    jArr7 = jArr2;
                                }
                                i45++;
                                iArr = iArr9;
                                jArr2 = jArr7;
                                i21 = i46;
                            }
                            long[] jArr14 = jArr2;
                            int[] iArr10 = iArr;
                            int i47 = i21;
                            boolean z15 = (i43 != zza) | z14;
                            long[] jArr15 = z15 ? new long[i43] : jArr14;
                            int[] iArr11 = z15 ? new int[i43] : iArr10;
                            int i48 = true == z15 ? 0 : i47;
                            int[] iArr12 = z15 ? new int[i43] : iArr2;
                            long[] jArr16 = new long[i43];
                            int i49 = i48;
                            long j17 = 0;
                            int i51 = 0;
                            int i52 = 0;
                            while (true) {
                                long[] jArr17 = c5209yk2.f30978i;
                                if (i51 >= jArr17.length) {
                                    break;
                                }
                                long j18 = j17;
                                long j19 = c5209yk2.f30979j[i51];
                                long j21 = jArr17[i51];
                                if (j19 != -1) {
                                    int[] iArr13 = iArr2;
                                    jArr5 = jArr16;
                                    long m25834j5 = AbstractC4916qo.m25834j(j21, c5209yk2.f30972c, c5209yk2.f30973d);
                                    int m25826b3 = AbstractC4916qo.m25826b(jArr, j19, true, true);
                                    int m25826b4 = AbstractC4916qo.m25826b(jArr, m25834j5 + j19, z13, false);
                                    if (z15) {
                                        int i53 = m25826b4 - m25826b3;
                                        System.arraycopy(jArr14, m25826b3, jArr15, i52, i53);
                                        iArr3 = iArr10;
                                        System.arraycopy(iArr3, m25826b3, iArr11, i52, i53);
                                        z12 = z13;
                                        iArr5 = iArr13;
                                        System.arraycopy(iArr5, m25826b3, iArr12, i52, i53);
                                    } else {
                                        iArr3 = iArr10;
                                        z12 = z13;
                                        iArr5 = iArr13;
                                    }
                                    int i54 = i49;
                                    while (m25826b3 < m25826b4) {
                                        int[] iArr14 = iArr5;
                                        long[] jArr18 = jArr14;
                                        long j22 = j19;
                                        jArr5[i52] = AbstractC4916qo.m25834j(j18, 1000000L, c5209yk2.f30973d) + AbstractC4916qo.m25834j(jArr[m25826b3] - j19, 1000000L, c5209yk2.f30972c);
                                        if (z15 && iArr11[i52] > i54) {
                                            i54 = iArr3[m25826b3];
                                        }
                                        i52++;
                                        m25826b3++;
                                        j19 = j22;
                                        jArr14 = jArr18;
                                        iArr5 = iArr14;
                                    }
                                    iArr4 = iArr5;
                                    jArr6 = jArr14;
                                    i49 = i54;
                                } else {
                                    iArr3 = iArr10;
                                    iArr4 = iArr2;
                                    jArr5 = jArr16;
                                    z12 = z13;
                                    jArr6 = jArr14;
                                }
                                j17 = j18 + j21;
                                i51++;
                                iArr10 = iArr3;
                                jArr16 = jArr5;
                                jArr14 = jArr6;
                                z13 = z12;
                                iArr2 = iArr4;
                            }
                            long[] jArr19 = jArr16;
                            int i55 = 0;
                            int i56 = 0;
                            while (true) {
                                if (i55 < iArr12.length) {
                                    if (i56 != 0) {
                                        break;
                                    }
                                    i56 = iArr12[i55] & 1;
                                    i55++;
                                } else if (i56 == 0) {
                                    throw new zzasz("The edited sample sequence does not contain a sync sample.");
                                }
                            }
                            return new C4358bl(jArr15, iArr11, i49, jArr19, iArr12);
                        }
                        int[] iArr15 = iArr2;
                        long[] jArr20 = jArr2;
                        int[] iArr16 = iArr;
                        int i57 = i21;
                        AbstractC4916qo.m25838n(jArr, 1000000L, c5209yk2.f30972c);
                        return new C4358bl(jArr20, iArr16, i57, jArr, iArr15);
                    }
                    m23673i = 0;
                }
                long[] jArr21 = new long[zza];
                int[] iArr17 = new int[zza];
                long[] jArr22 = new long[zza];
                i14 = i12;
                int[] iArr18 = new int[zza];
                long j23 = 0;
                j11 = 0;
                int i58 = 0;
                i15 = 0;
                int i59 = 0;
                int i61 = 0;
                int i62 = 0;
                while (i15 < zza) {
                    while (i61 == 0) {
                        AbstractC4361bo.m20613e(c4578hk.m22925a());
                        j23 = c4578hk.f21796d;
                        i61 = c4578hk.f21795c;
                        m23673i2 = m23673i2;
                        m23673i3 = m23673i3;
                    }
                    int i63 = m23673i2;
                    int i64 = m23673i3;
                    if (c4655jo5 != null) {
                        while (true) {
                            if (i59 != 0) {
                                break;
                            }
                            if (i11 <= 0) {
                                i59 = 0;
                                break;
                            }
                            i59 = c4655jo5.m23673i();
                            i62 = c4655jo5.m23669e();
                            i11--;
                        }
                        i59--;
                    }
                    int i65 = i62;
                    jArr21[i15] = j23;
                    int zzb2 = c4763mk.zzb();
                    iArr17[i15] = zzb2;
                    if (zzb2 > i58) {
                        jArr3 = jArr21;
                        i58 = zzb2;
                        interfaceC4615ik = c4763mk;
                    } else {
                        interfaceC4615ik = c4763mk;
                        jArr3 = jArr21;
                    }
                    jArr22[i15] = j11 + i65;
                    iArr18[i15] = c4655jo4 == null ? 1 : 0;
                    if (i15 == i13) {
                        iArr18[i15] = 1;
                        i14--;
                        if (i14 > 0) {
                            i13 = c4655jo4.m23673i() - 1;
                        }
                    }
                    int[] iArr19 = iArr18;
                    j11 += i64;
                    int i66 = i63 - 1;
                    if (i66 != 0) {
                        i22 = i64;
                        i23 = i66;
                    } else if (m23673i > 0) {
                        i23 = c4655jo3.m23673i();
                        i22 = c4655jo3.m23673i();
                        m23673i--;
                    } else {
                        i22 = i64;
                        i23 = 0;
                    }
                    int i67 = i23;
                    int i68 = i22;
                    j23 += iArr17[i15];
                    i61--;
                    i15++;
                    c4763mk = interfaceC4615ik;
                    jArr21 = jArr3;
                    iArr18 = iArr19;
                    m23673i3 = i68;
                    i62 = i65;
                    m23673i2 = i67;
                }
                long[] jArr23 = jArr21;
                int[] iArr20 = iArr18;
                int i69 = m23673i2;
                AbstractC4361bo.m20611c(i59 != 0);
                while (i11 > 0) {
                    AbstractC4361bo.m20611c(c4655jo5.m23673i() == 0);
                    c4655jo5.m23669e();
                    i11--;
                }
                if (i14 != 0) {
                    if (i69 != 0) {
                        c5209yk2 = c5209yk;
                        i16 = i58;
                        i18 = i61;
                        i19 = i69;
                    } else if (i61 != 0) {
                        i19 = 0;
                        c5209yk2 = c5209yk;
                        i16 = i58;
                        i18 = i61;
                    } else {
                        if (m23673i == 0) {
                            c5209yk2 = c5209yk;
                            i16 = i58;
                            i21 = i16;
                            iArr = iArr17;
                            jArr = jArr22;
                            jArr2 = jArr23;
                            iArr2 = iArr20;
                            jArr4 = c5209yk2.f30978i;
                            if (jArr4 == null) {
                            }
                            int[] iArr152 = iArr2;
                            long[] jArr202 = jArr2;
                            int[] iArr162 = iArr;
                            int i572 = i21;
                            AbstractC4916qo.m25838n(jArr, 1000000L, c5209yk2.f30972c);
                            return new C4358bl(jArr202, iArr162, i572, jArr, iArr152);
                        }
                        i19 = 0;
                        i18 = 0;
                        c5209yk2 = c5209yk;
                        i16 = i58;
                    }
                    i17 = 0;
                } else {
                    c5209yk2 = c5209yk;
                    i16 = i58;
                    i17 = i14;
                    i18 = i61;
                    i19 = i69;
                }
                int i71 = c5209yk2.f30970a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Inconsistent stbl box for track ");
                sb2.append(i71);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(i17);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(i19);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i18);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(m23673i);
                i21 = i16;
                iArr = iArr17;
                jArr = jArr22;
                jArr2 = jArr23;
                iArr2 = iArr20;
                jArr4 = c5209yk2.f30978i;
                if (jArr4 == null) {
                }
                int[] iArr1522 = iArr2;
                long[] jArr2022 = jArr2;
                int[] iArr1622 = iArr;
                int i5722 = i21;
                AbstractC4916qo.m25838n(jArr, 1000000L, c5209yk2.f30972c);
                return new C4358bl(jArr2022, iArr1622, i5722, jArr, iArr1522);
            }
            c4655jo4 = null;
        } else {
            i12 = 0;
        }
        i13 = -1;
        if (c4763mk.zzc()) {
            if (i11 != 0) {
            }
            m23673i = 0;
        }
        long[] jArr212 = new long[zza];
        int[] iArr172 = new int[zza];
        long[] jArr222 = new long[zza];
        i14 = i12;
        int[] iArr182 = new int[zza];
        long j232 = 0;
        j11 = 0;
        int i582 = 0;
        i15 = 0;
        int i592 = 0;
        int i612 = 0;
        int i622 = 0;
        while (i15 < zza) {
        }
        long[] jArr232 = jArr212;
        int[] iArr202 = iArr182;
        int i692 = m23673i2;
        AbstractC4361bo.m20611c(i592 != 0);
        while (i11 > 0) {
        }
        if (i14 != 0) {
        }
        int i712 = c5209yk2.f30970a;
        StringBuilder sb22 = new StringBuilder();
        sb22.append("Inconsistent stbl box for track ");
        sb22.append(i712);
        sb22.append(": remainingSynchronizationSamples ");
        sb22.append(i17);
        sb22.append(", remainingSamplesAtTimestampDelta ");
        sb22.append(i19);
        sb22.append(", remainingSamplesInChunk ");
        sb22.append(i18);
        sb22.append(", remainingTimestampDeltaChanges ");
        sb22.append(m23673i);
        i21 = i16;
        iArr = iArr172;
        jArr = jArr222;
        jArr2 = jArr232;
        iArr2 = iArr202;
        jArr4 = c5209yk2.f30978i;
        if (jArr4 == null) {
        }
        int[] iArr15222 = iArr2;
        long[] jArr20222 = jArr2;
        int[] iArr16222 = iArr;
        int i57222 = i21;
        AbstractC4916qo.m25838n(jArr, 1000000L, c5209yk2.f30972c);
        return new C4358bl(jArr20222, iArr16222, i57222, jArr, iArr15222);
    }

    /* renamed from: c */
    public static zzaxh m25200c(C4504fk c4504fk, boolean z11) {
        if (z11) {
            return null;
        }
        C4655jo c4655jo = c4504fk.f20142P0;
        c4655jo.m23686v(8);
        while (c4655jo.m23665a() >= 8) {
            int m23667c = c4655jo.m23667c();
            int m23669e = c4655jo.m23669e();
            if (c4655jo.m23669e() == AbstractC4541gk.f20624B0) {
                c4655jo.m23686v(m23667c);
                int i11 = m23667c + m23669e;
                c4655jo.m23687w(12);
                while (c4655jo.m23667c() < i11) {
                    int m23667c2 = c4655jo.m23667c();
                    int m23669e2 = c4655jo.m23669e();
                    if (c4655jo.m23669e() == AbstractC4541gk.f20626C0) {
                        c4655jo.m23686v(m23667c2);
                        int i12 = m23667c2 + m23669e2;
                        c4655jo.m23687w(8);
                        ArrayList arrayList = new ArrayList();
                        while (c4655jo.m23667c() < i12) {
                            zzaxg m26622a = AbstractC5023tk.m26622a(c4655jo);
                            if (m26622a != null) {
                                arrayList.add(m26622a);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return new zzaxh(arrayList);
                    }
                    c4655jo.m23687w(m23669e2 - 8);
                }
                return null;
            }
            c4655jo.m23687w(m23669e - 8);
        }
        return null;
    }

    /* renamed from: d */
    private static int m25201d(C4655jo c4655jo) {
        int m23671g = c4655jo.m23671g();
        int i11 = m23671g & 127;
        while ((m23671g & 128) == 128) {
            m23671g = c4655jo.m23671g();
            i11 = (i11 << 7) | (m23671g & 127);
        }
        return i11;
    }

    /* renamed from: e */
    private static int m25202e(C4655jo c4655jo, int i11, int i12, C4651jk c4651jk, int i13) {
        boolean z11;
        boolean z12;
        boolean z13;
        int m23667c = c4655jo.m23667c();
        while (true) {
            boolean z14 = false;
            if (m23667c - i11 >= i12) {
                return 0;
            }
            c4655jo.m23686v(m23667c);
            int m23669e = c4655jo.m23669e();
            if (m23669e > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC4361bo.m20612d(z11, "childAtomSize should be positive");
            if (c4655jo.m23669e() == AbstractC4541gk.f20658W) {
                int i14 = m23667c + 8;
                Pair pair = null;
                Integer num = null;
                C5246zk c5246zk = null;
                boolean z15 = false;
                while (i14 - m23667c < m23669e) {
                    c4655jo.m23686v(i14);
                    int m23669e2 = c4655jo.m23669e();
                    int m23669e3 = c4655jo.m23669e();
                    if (m23669e3 == AbstractC4541gk.f20666c0) {
                        num = Integer.valueOf(c4655jo.m23669e());
                    } else if (m23669e3 == AbstractC4541gk.f20659X) {
                        c4655jo.m23687w(4);
                        if (c4655jo.m23669e() == f25673g) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else if (m23669e3 == AbstractC4541gk.f20660Y) {
                        int i15 = i14 + 8;
                        while (true) {
                            if (i15 - i14 < m23669e2) {
                                c4655jo.m23686v(i15);
                                int m23669e4 = c4655jo.m23669e();
                                if (c4655jo.m23669e() == AbstractC4541gk.f20661Z) {
                                    c4655jo.m23687w(6);
                                    if (c4655jo.m23671g() == 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    int m23671g = c4655jo.m23671g();
                                    byte[] bArr = new byte[16];
                                    c4655jo.m23681q(bArr, 0, 16);
                                    c5246zk = new C5246zk(z13, m23671g, bArr);
                                } else {
                                    i15 += m23669e4;
                                }
                            } else {
                                c5246zk = null;
                                break;
                            }
                        }
                    }
                    i14 += m23669e2;
                }
                if (z15) {
                    if (num != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    AbstractC4361bo.m20612d(z12, "frma atom is mandatory");
                    if (c5246zk != null) {
                        z14 = true;
                    }
                    AbstractC4361bo.m20612d(z14, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, c5246zk);
                }
                if (pair != null) {
                    c4651jk.f22853a[i13] = (C5246zk) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            m23667c += m23669e;
        }
    }

    /* renamed from: f */
    private static Pair m25203f(C4655jo c4655jo, int i11) {
        String str;
        c4655jo.m23686v(i11 + 12);
        c4655jo.m23687w(1);
        m25201d(c4655jo);
        c4655jo.m23687w(2);
        int m23671g = c4655jo.m23671g();
        if ((m23671g & 128) != 0) {
            c4655jo.m23687w(2);
        }
        if ((m23671g & 64) != 0) {
            c4655jo.m23687w(c4655jo.m23674j());
        }
        if ((m23671g & 32) != 0) {
            c4655jo.m23687w(2);
        }
        c4655jo.m23687w(1);
        m25201d(c4655jo);
        int m23671g2 = c4655jo.m23671g();
        if (m23671g2 != 32) {
            if (m23671g2 != 33) {
                if (m23671g2 != 35) {
                    if (m23671g2 != 64) {
                        str = null;
                        if (m23671g2 != 107) {
                            if (m23671g2 != 165) {
                                if (m23671g2 != 166) {
                                    switch (m23671g2) {
                                        case 102:
                                        case 103:
                                        case 104:
                                            break;
                                        default:
                                            switch (m23671g2) {
                                                case 169:
                                                case 172:
                                                    return Pair.create("audio/vnd.dts", null);
                                                case 170:
                                                case 171:
                                                    return Pair.create("audio/vnd.dts.hd", null);
                                            }
                                    }
                                } else {
                                    str = "audio/eac3";
                                }
                            } else {
                                str = "audio/ac3";
                            }
                        } else {
                            return Pair.create("audio/mpeg", null);
                        }
                    }
                    str = "audio/mp4a-latm";
                } else {
                    str = "video/hevc";
                }
            } else {
                str = "video/avc";
            }
        } else {
            str = "video/mp4v-es";
        }
        c4655jo.m23687w(12);
        c4655jo.m23687w(1);
        int m25201d = m25201d(c4655jo);
        byte[] bArr = new byte[m25201d];
        c4655jo.m23681q(bArr, 0, m25201d);
        return Pair.create(str, bArr);
    }
}
