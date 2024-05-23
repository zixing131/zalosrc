package p171fx;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import me0.AbstractC23122k6;

/* renamed from: fx.g */
/* loaded from: classes4.dex */
public abstract class AbstractC19166g {

    /* renamed from: a */
    private static Context f95256a;

    /* renamed from: b */
    private static final Map f95257b = Collections.synchronizedMap(new HashMap());

    /* renamed from: A */
    public static void m100547A(long j11) {
        SharedPreferences.Editor edit = f95256a.getSharedPreferences("zam_preferences", 0).edit();
        edit.putLong("LAST_TIME_NETWORK_USAGE_BG", j11);
        edit.apply();
    }

    /* renamed from: B */
    public static void m100548B(long j11) {
        SharedPreferences.Editor edit = f95256a.getSharedPreferences("zam_preferences", 0).edit();
        edit.putLong("pref_last_system_info_dump_time", j11);
        edit.apply();
    }

    /* renamed from: C */
    public static void m100549C(long j11) {
        SharedPreferences.Editor edit = f95256a.getSharedPreferences("zam_preferences", 0).edit();
        edit.putLong("TIMESTAMP_NETWORK_USAGE", j11);
        edit.apply();
    }

    /* renamed from: D */
    public static void m100550D(long j11) {
        SharedPreferences.Editor edit = f95256a.getSharedPreferences("zam_preferences", 0).edit();
        edit.putLong("TOTAL_NETWORK_USAGE_BG", j11);
        edit.apply();
    }

    /* renamed from: a */
    public static String m100551a() {
        return f95256a.getSharedPreferences("zam_preferences", 0).getString("pref_app_build_id", null);
    }

    /* renamed from: b */
    public static int m100552b() {
        return f95256a.getSharedPreferences("zam_preferences", 0).getInt("pref_aquery_img_cache_config", -1);
    }

    /* renamed from: c */
    public static long m100553c() {
        return f95256a.getSharedPreferences("zam_preferences", 0).getLong("pref_last_core_flow_dump_time", 0L);
    }

    /* renamed from: d */
    public static long m100554d() {
        return f95256a.getSharedPreferences("zam_preferences", 0).getLong("pref_last_db_dump_time", 0L);
    }

    /* renamed from: e */
    public static long m100555e() {
        return f95256a.getSharedPreferences("zam_preferences", 0).getLong("pref_last_disk_dump_time", 0L);
    }

    /* renamed from: f */
    public static long m100556f() {
        return f95256a.getSharedPreferences("zam_preferences", 0).getLong("pref_last_worker_dump_time", 0L);
    }

    /* renamed from: g */
    public static long m100557g() {
        return f95256a.getSharedPreferences("zam_preferences", 0).getLong("ref_last_img_cache_track_dump_time", 0L);
    }

    /* renamed from: h */
    public static long m100558h() {
        return f95256a.getSharedPreferences("zam_preferences", 0).getLong("pref_last_clean_log_time", 0L);
    }

    /* renamed from: i */
    public static long m100559i() {
        return f95256a.getSharedPreferences("zam_preferences", 0).getLong("pref_last_upload_log_time", 0L);
    }

    /* renamed from: j */
    public static long m100560j() {
        return f95256a.getSharedPreferences("zam_preferences", 0).getLong("pref_last_network_dump_time", 0L);
    }

    /* renamed from: k */
    public static long m100561k() {
        return f95256a.getSharedPreferences("zam_preferences", 0).getLong("LAST_TIME_NETWORK_USAGE_BG", 0L);
    }

    /* renamed from: l */
    public static long m100562l() {
        return f95256a.getSharedPreferences("zam_preferences", 0).getLong("pref_last_system_info_dump_time", 0L);
    }

    /* renamed from: m */
    public static long m100563m() {
        return f95256a.getSharedPreferences("zam_preferences", 0).getLong("TIMESTAMP_NETWORK_USAGE", 0L);
    }

    /* renamed from: n */
    public static boolean m100564n() {
        return f95256a.getSharedPreferences("zam_preferences", 0).getBoolean("read_from_user", false);
    }

    /* renamed from: o */
    public static long m100565o() {
        return f95256a.getSharedPreferences("zam_preferences", 0).getLong("TOTAL_NETWORK_USAGE_BG", 0L);
    }

    /* renamed from: p */
    public static void m100566p(Context context) {
        f95256a = (Context) AbstractC23122k6.m118609a(context);
    }

    /* renamed from: q */
    public static void m100567q(long j11) {
        SharedPreferences.Editor edit = f95256a.getSharedPreferences("zam_preferences", 0).edit();
        edit.putLong("pref_last_db_dump_time", j11);
        edit.apply();
    }

    /* renamed from: r */
    public static void m100568r(long j11) {
        SharedPreferences.Editor edit = f95256a.getSharedPreferences("zam_preferences", 0).edit();
        edit.putLong("pref_last_network_dump_time", j11);
        edit.apply();
    }

    /* renamed from: s */
    public static void m100569s(String str) {
        SharedPreferences.Editor edit = f95256a.getSharedPreferences("zam_preferences", 0).edit();
        edit.putString("pref_app_build_id", str);
        edit.apply();
    }

    /* renamed from: t */
    public static void m100570t(int i11) {
        SharedPreferences.Editor edit = f95256a.getSharedPreferences("zam_preferences", 0).edit();
        edit.putInt("pref_aquery_img_cache_config", i11);
        edit.apply();
    }

    /* renamed from: u */
    public static void m100571u(long j11) {
        SharedPreferences.Editor edit = f95256a.getSharedPreferences("zam_preferences", 0).edit();
        edit.putLong("pref_last_core_flow_dump_time", j11);
        edit.apply();
    }

    /* renamed from: v */
    public static void m100572v(long j11) {
        SharedPreferences.Editor edit = f95256a.getSharedPreferences("zam_preferences", 0).edit();
        edit.putLong("pref_last_disk_dump_time", j11);
        edit.apply();
    }

    /* renamed from: w */
    public static void m100573w(long j11) {
        SharedPreferences.Editor edit = f95256a.getSharedPreferences("zam_preferences", 0).edit();
        edit.putLong("pref_last_worker_dump_time", j11);
        edit.apply();
    }

    /* renamed from: x */
    public static void m100574x(long j11) {
        SharedPreferences.Editor edit = f95256a.getSharedPreferences("zam_preferences", 0).edit();
        edit.putLong("ref_last_img_cache_track_dump_time", j11);
        edit.apply();
    }

    /* renamed from: y */
    public static void m100575y(long j11) {
        SharedPreferences.Editor edit = f95256a.getSharedPreferences("zam_preferences", 0).edit();
        edit.putLong("pref_last_clean_log_time", j11);
        edit.apply();
    }

    /* renamed from: z */
    public static void m100576z(long j11) {
        SharedPreferences.Editor edit = f95256a.getSharedPreferences("zam_preferences", 0).edit();
        edit.putLong("pref_last_upload_log_time", j11);
        edit.apply();
    }
}
