package com.zing.zalo.zbrowser.cache;

import android.content.Context;
import com.google.gson.C6743d;
import com.google.gson.reflect.TypeToken;
import com.zing.zalo.leveldb.exception.LevelDBException;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalocore.CoreUtility;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me0.AbstractC23044d5;

/* loaded from: classes7.dex */
public class MiniProgramDataStorageManager {

    /* renamed from: f */
    private static MiniProgramDataStorageManager f86029f;

    /* renamed from: g */
    private static Map f86030g;

    /* renamed from: a */
    private String f86031a;

    /* renamed from: b */
    private int f86032b = 5242880;

    /* renamed from: c */
    private int f86033c = 7889400;

    /* renamed from: d */
    private Map f86034d;

    /* renamed from: e */
    private ExecutorService f86035e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zbrowser.cache.MiniProgramDataStorageManager$a */
    /* loaded from: classes7.dex */
    public class C16896a {

        /* renamed from: a */
        public long f86038a;

        /* renamed from: b */
        public long f86039b;

        public C16896a(long j11, long j12) {
            this.f86038a = j11;
            this.f86039b = j12;
        }
    }

    private MiniProgramDataStorageManager(String str) {
        if (str != null) {
            this.f86031a = str;
        }
        f86030g = new ConcurrentHashMap();
        m90350q();
        this.f86035e = Executors.newSingleThreadExecutor();
    }

    /* renamed from: b */
    private File m90340b() {
        try {
            File file = new File(this.f86031a);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(this.f86031a, "properties.o");
            file2.createNewFile();
            return file2;
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m90349p() {
        String m90347m;
        if (this.f86034d == null && (m90347m = m90347m()) != null) {
            Map m90346l = m90346l(m90347m);
            this.f86034d = m90346l;
            if (m90346l == null) {
                this.f86034d = new ConcurrentHashMap();
                m90351t();
            }
            boolean z11 = false;
            for (Map.Entry entry : this.f86034d.entrySet()) {
                C16896a c16896a = (C16896a) entry.getValue();
                if (c16896a != null && (c16896a.f86038a / 1000) + c16896a.f86039b < System.currentTimeMillis() / 1000) {
                    m90343h(new File(this.f86031a, (String) entry.getKey()));
                    this.f86034d.remove(entry.getKey());
                    z11 = true;
                }
            }
            if (z11) {
                m90351t();
            }
        }
    }

    /* renamed from: d */
    private void m90342d(String str) {
        String m90347m;
        if (str != null && this.f86034d == null && (m90347m = m90347m()) != null) {
            Map m90346l = m90346l(m90347m);
            this.f86034d = m90346l;
            if (m90346l == null) {
                this.f86034d = new ConcurrentHashMap();
                m90351t();
            }
            for (Map.Entry entry : this.f86034d.entrySet()) {
                if (((String) entry.getKey()).equals(str)) {
                    C16896a c16896a = (C16896a) entry.getValue();
                    if (c16896a != null && (c16896a.f86038a / 1000) + c16896a.f86039b < System.currentTimeMillis() / 1000) {
                        m90343h(new File(this.f86031a, (String) entry.getKey()));
                        this.f86034d.remove(entry.getKey());
                        m90351t();
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    private void m90343h(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                m90343h(file2);
            }
        }
        file.delete();
    }

    /* renamed from: j */
    public static MiniProgramDataStorageManager m90344j(String str) {
        if (f86029f == null) {
            f86029f = new MiniProgramDataStorageManager(str);
        }
        return f86029f;
    }

    /* renamed from: k */
    private String m90345k(Map map) {
        return new C6743d().m34531p(map, new TypeToken<Map<String, C16896a>>() { // from class: com.zing.zalo.zbrowser.cache.MiniProgramDataStorageManager.1
        }.getType());
    }

    /* renamed from: l */
    private Map m90346l(String str) {
        try {
            return (Map) new C6743d().m34525i(str, new TypeToken<Map<String, C16896a>>() { // from class: com.zing.zalo.zbrowser.cache.MiniProgramDataStorageManager.2
            }.getType());
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: m */
    private String m90347m() {
        try {
            File m90340b = m90340b();
            if (m90340b == null) {
                return null;
            }
            Scanner scanner = new Scanner(m90340b);
            StringBuilder sb2 = new StringBuilder();
            while (scanner.hasNextLine()) {
                sb2.append(scanner.nextLine());
            }
            scanner.close();
            return sb2.toString();
        } catch (Exception e11) {
            System.out.println("An error occurred.");
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: o */
    private C16902f m90348o(String str) {
        m90342d(str);
        if (f86030g == null) {
            f86030g = new ConcurrentHashMap();
        }
        m90352u(str);
        if (f86030g.containsKey(str)) {
            return (C16902f) f86030g.get(str);
        }
        long currentTimeMillis = System.currentTimeMillis();
        C16902f c16902f = new C16902f(this.f86031a, str, this.f86032b);
        f86030g.put(str, c16902f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("init: ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        return c16902f;
    }

    /* renamed from: q */
    public static void m90350q() {
        Context appContext = CoreUtility.getAppContext();
        EnumC16739a enumC16739a = EnumC16739a.f84888e0;
        AbstractC23044d5.m118231d(appContext, enumC16739a);
        if (AbstractC23044d5.m118229b(enumC16739a)) {
        } else {
            throw new LevelDBException("Leveldb Native load error !");
        }
    }

    /* renamed from: t */
    private void m90351t() {
        try {
            File m90340b = m90340b();
            if (m90340b != null) {
                String m90345k = m90345k(this.f86034d);
                FileOutputStream fileOutputStream = new FileOutputStream(m90340b);
                fileOutputStream.write(m90345k.getBytes());
                fileOutputStream.close();
            }
        } catch (IOException e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("File write failed: ");
            sb2.append(e11.toString());
        }
    }

    /* renamed from: u */
    private void m90352u(String str) {
        if (this.f86034d == null) {
            this.f86034d = new ConcurrentHashMap();
        }
        if (this.f86034d.containsKey(str) && this.f86034d.get(str) != null) {
            ((C16896a) this.f86034d.get(str)).f86038a = System.currentTimeMillis();
        } else {
            this.f86034d.put(str, new C16896a(System.currentTimeMillis(), this.f86033c));
        }
        m90351t();
    }

    /* renamed from: e */
    public synchronized void m90353e() {
        try {
            Map map = f86030g;
            if (map != null) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    ((C16902f) ((Map.Entry) it.next()).getValue()).m90448c();
                }
            }
            m90343h(new File(this.f86031a));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: f */
    public synchronized void m90354f(String str) {
        if (str != null) {
            m90343h(new File(this.f86031a, str));
            m90348o(str).m90447b();
        }
    }

    /* renamed from: g */
    public synchronized void m90355g(String str) {
        try {
            if (f86030g != null && str != null) {
                m90348o(str).m90448c();
                f86030g.remove(str);
            }
            m90351t();
            if (f86030g.size() == 0) {
                this.f86035e.execute(new Runnable() { // from class: com.zing.zalo.zbrowser.cache.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        MiniProgramDataStorageManager.this.m90349p();
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: i */
    public synchronized Map m90356i(String str, List list) {
        HashMap hashMap;
        hashMap = new HashMap();
        C16902f m90348o = m90348o(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            hashMap.put(str2, m90348o.m90450f(str2));
        }
        return hashMap;
    }

    /* renamed from: n */
    public synchronized long m90357n(String str) {
        if (str != null) {
            return m90348o(str).m90451h();
        }
        return -1L;
    }

    /* renamed from: r */
    public synchronized List m90358r(String str, Map map) {
        ArrayList arrayList;
        C16902f m90348o = m90348o(str);
        arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (!m90348o.m90452p((String) entry.getKey(), (String) entry.getValue())) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    public synchronized List m90359s(String str, List list) {
        ArrayList arrayList;
        C16902f m90348o = m90348o(str);
        arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!m90348o.m90449e(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }
}
