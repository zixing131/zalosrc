package p673y8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y8.q */
/* loaded from: classes.dex */
public class C30829q {

    /* renamed from: a */
    private final SharedPreferences f142294a;

    public C30829q(Context context, String str) {
        this.f142294a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    private synchronized void m149914a() {
        try {
            long j11 = this.f142294a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f142294a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f142294a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f142294a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 - 1).commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: d */
    private synchronized String m149915d(long j11) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j11).toInstant();
            zoneOffset = ZoneOffset.UTC;
            atOffset = instant.atOffset(zoneOffset);
            localDateTime = atOffset.toLocalDateTime();
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(dateTimeFormatter);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j11));
    }

    /* renamed from: e */
    private synchronized String m149916e(String str) {
        for (Map.Entry<String, ?> entry : this.f142294a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    private synchronized void m149917h(String str) {
        try {
            String m149916e = m149916e(str);
            if (m149916e == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f142294a.getStringSet(m149916e, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f142294a.edit().remove(m149916e).commit();
            } else {
                this.f142294a.edit().putStringSet(m149916e, hashSet).commit();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: m */
    private synchronized void m149918m(String str, String str2) {
        m149917h(str2);
        HashSet hashSet = new HashSet(this.f142294a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f142294a.edit().putStringSet(str, hashSet).commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m149919b() {
        try {
            SharedPreferences.Editor edit = this.f142294a.edit();
            for (Map.Entry<String, ?> entry : this.f142294a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    edit.remove(entry.getKey());
                }
            }
            edit.remove("fire-count");
            edit.commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized List m149920c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f142294a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    arrayList.add(AbstractC30830r.m149927a(entry.getKey(), new ArrayList((Set) entry.getValue())));
                }
            }
            m149926l(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    /* renamed from: f */
    synchronized boolean m149921f(long j11, long j12) {
        return m149915d(j11).equals(m149915d(j12));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void m149922g() {
        String m149915d = m149915d(System.currentTimeMillis());
        this.f142294a.edit().putString("last-used-date", m149915d).commit();
        m149917h(m149915d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized boolean m149923i(long j11) {
        return m149924j("fire-global", j11);
    }

    /* renamed from: j */
    synchronized boolean m149924j(String str, long j11) {
        if (this.f142294a.contains(str)) {
            if (!m149921f(this.f142294a.getLong(str, -1L), j11)) {
                this.f142294a.edit().putLong(str, j11).commit();
                return true;
            }
            return false;
        }
        this.f142294a.edit().putLong(str, j11).commit();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized void m149925k(long j11, String str) {
        String m149915d = m149915d(j11);
        if (this.f142294a.getString("last-used-date", "").equals(m149915d)) {
            String m149916e = m149916e(m149915d);
            if (m149916e == null) {
                return;
            }
            if (m149916e.equals(str)) {
                return;
            }
            m149918m(str, m149915d);
            return;
        }
        long j12 = this.f142294a.getLong("fire-count", 0L);
        if (j12 + 1 == 30) {
            m149914a();
            j12 = this.f142294a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f142294a.getStringSet(str, new HashSet()));
        hashSet.add(m149915d);
        this.f142294a.edit().putStringSet(str, hashSet).putLong("fire-count", j12 + 1).putString("last-used-date", m149915d).commit();
    }

    /* renamed from: l */
    synchronized void m149926l(long j11) {
        this.f142294a.edit().putLong("fire-global", j11).commit();
    }
}
