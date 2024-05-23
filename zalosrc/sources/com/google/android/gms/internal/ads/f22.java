package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class f22 {

    /* renamed from: a */
    private final C4808ns f19934a;

    /* renamed from: b */
    private final Context f19935b;

    /* renamed from: c */
    private final i12 f19936c;

    /* renamed from: d */
    private final zzcgv f19937d;

    /* renamed from: e */
    private final String f19938e;

    /* renamed from: f */
    private final rv2 f19939f;

    /* renamed from: g */
    private final zzg f19940g = zzt.zzo().m22936h();

    public f22(Context context, zzcgv zzcgvVar, C4808ns c4808ns, i12 i12Var, String str, rv2 rv2Var) {
        this.f19935b = context;
        this.f19937d = zzcgvVar;
        this.f19934a = c4808ns;
        this.f19936c = i12Var;
        this.f19938e = str;
        this.f19939f = rv2Var;
    }

    /* renamed from: c */
    private static final void m21867c(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C5256zu c5256zu = (C5256zu) arrayList.get(i11);
            if (c5256zu.m28643e0() == 2 && c5256zu.m28636L() > j11) {
                j11 = c5256zu.m28636L();
            }
        }
        if (j11 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j11));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void m21868a(boolean z11, SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2;
        String str3;
        if (z11) {
            this.f19935b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        int i11 = 2;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21374s7)).booleanValue()) {
            qv2 m25905b = qv2.m25905b("oa_upload");
            m25905b.m25907a("oa_failed_reqs", String.valueOf(x12.m27800a(sQLiteDatabase, 0)));
            m25905b.m25907a("oa_total_reqs", String.valueOf(x12.m27800a(sQLiteDatabase, 1)));
            m25905b.m25907a("oa_upload_time", String.valueOf(zzt.zzB().mo105913a()));
            m25905b.m25907a("oa_last_successful_time", String.valueOf(x12.m27801b(sQLiteDatabase, 2)));
            if (this.f19940g.zzP()) {
                str = "";
            } else {
                str = this.f19938e;
            }
            m25905b.m25907a("oa_session_id", str);
            this.f19939f.mo22194a(m25905b);
            ArrayList m27802c = x12.m27802c(sQLiteDatabase);
            m21867c(sQLiteDatabase, m27802c);
            int size = m27802c.size();
            for (int i12 = 0; i12 < size; i12++) {
                C5256zu c5256zu = (C5256zu) m27802c.get(i12);
                qv2 m25905b2 = qv2.m25905b("oa_signals");
                if (this.f19940g.zzP()) {
                    str2 = "";
                } else {
                    str2 = this.f19938e;
                }
                m25905b2.m25907a("oa_session_id", str2);
                C5070uu m28637M = c5256zu.m28637M();
                if (m28637M.m27057J()) {
                    str3 = String.valueOf(m28637M.m27059L() - 1);
                } else {
                    str3 = "-1";
                }
                String obj = q83.m25671b(c5256zu.m28639S(), new y43() { // from class: com.google.android.gms.internal.ads.e22
                    @Override // com.google.android.gms.internal.ads.y43
                    public final Object apply(Object obj2) {
                        return ((EnumC4809nt) obj2).name();
                    }
                }).toString();
                m25905b2.m25907a("oa_sig_ts", String.valueOf(c5256zu.m28636L()));
                m25905b2.m25907a("oa_sig_status", String.valueOf(c5256zu.m28643e0() - 1));
                m25905b2.m25907a("oa_sig_resp_lat", String.valueOf(c5256zu.m28635K()));
                m25905b2.m25907a("oa_sig_render_lat", String.valueOf(c5256zu.m28634J()));
                m25905b2.m25907a("oa_sig_formats", obj);
                m25905b2.m25907a("oa_sig_nw_type", str3);
                m25905b2.m25907a("oa_sig_wifi", String.valueOf(c5256zu.m28644f0() - 1));
                m25905b2.m25907a("oa_sig_airplane", String.valueOf(c5256zu.m28640b0() - 1));
                m25905b2.m25907a("oa_sig_data", String.valueOf(c5256zu.m28641c0() - 1));
                m25905b2.m25907a("oa_sig_nw_resp", String.valueOf(c5256zu.m28633I()));
                m25905b2.m25907a("oa_sig_offline", String.valueOf(c5256zu.m28642d0() - 1));
                m25905b2.m25907a("oa_sig_nw_state", String.valueOf(c5256zu.m28638R().m21815b()));
                if (m28637M.m27056I() && m28637M.m27057J() && m28637M.m27059L() == 2) {
                    m25905b2.m25907a("oa_sig_cell_type", String.valueOf(m28637M.m27058K() - 1));
                }
                this.f19939f.mo22194a(m25905b2);
            }
        } else {
            ArrayList m27802c2 = x12.m27802c(sQLiteDatabase);
            C4331av m22182F = C4515fv.m22182F();
            m22182F.m20246r(this.f19935b.getPackageName());
            m22182F.m20248u(Build.MODEL);
            m22182F.m20249v(x12.m27800a(sQLiteDatabase, 0));
            m22182F.m20245q(m27802c2);
            m22182F.m20251x(x12.m27800a(sQLiteDatabase, 1));
            m22182F.m20247s(x12.m27800a(sQLiteDatabase, 3));
            m22182F.m20252y(zzt.zzB().mo105913a());
            m22182F.m20250w(x12.m27801b(sQLiteDatabase, 2));
            final C4515fv c4515fv = (C4515fv) m22182F.m25898n();
            m21867c(sQLiteDatabase, m27802c2);
            this.f19934a.m24993b(new InterfaceC4771ms() { // from class: com.google.android.gms.internal.ads.c22
                @Override // com.google.android.gms.internal.ads.InterfaceC4771ms
                /* renamed from: a */
                public final void mo20788a(C4514fu c4514fu) {
                    c4514fu.m22180z(C4515fv.this);
                }
            });
            C4923qv m26191F = C4960rv.m26191F();
            m26191F.m25901q(this.f19937d.f32031q);
            m26191F.m25903s(this.f19937d.f32032r);
            if (true == this.f19937d.f32033s) {
                i11 = 0;
            }
            m26191F.m25902r(i11);
            final C4960rv c4960rv = (C4960rv) m26191F.m25898n();
            this.f19934a.m24993b(new InterfaceC4771ms() { // from class: com.google.android.gms.internal.ads.d22
                @Override // com.google.android.gms.internal.ads.InterfaceC4771ms
                /* renamed from: a */
                public final void mo20788a(C4514fu c4514fu) {
                    C4960rv c4960rv2 = C4960rv.this;
                    C5144wt c5144wt = (C5144wt) c4514fu.m22173r().m26779m();
                    c5144wt.m27714r(c4960rv2);
                    c4514fu.m22178x(c5144wt);
                }
            });
            this.f19934a.m24994c(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START);
        }
        x12.m27805f(sQLiteDatabase);
        return null;
    }

    /* renamed from: b */
    public final void m21869b(final boolean z11) {
        try {
            this.f19936c.m23109a(new ju2() { // from class: com.google.android.gms.internal.ads.b22
                @Override // com.google.android.gms.internal.ads.ju2
                public final Object zza(Object obj) {
                    f22.this.m21868a(z11, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e11) {
            yk0.zzg("Error in offline signals database startup: ".concat(String.valueOf(e11.getMessage())));
        }
    }
}
