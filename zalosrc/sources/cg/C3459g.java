package cg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.ETC1Util;
import com.zing.zalo.utils.cryptology.AESUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23041d2;
import me0.AbstractC23238v2;
import p620wt.AbstractC29238m;

/* renamed from: cg.g */
/* loaded from: classes3.dex */
public class C3459g {

    /* renamed from: e */
    static final List f14549e = new ArrayList();

    /* renamed from: f */
    static final List f14550f = new ArrayList();

    /* renamed from: a */
    boolean f14551a = false;

    /* renamed from: b */
    final List f14552b = new ArrayList();

    /* renamed from: c */
    final List f14553c = new ArrayList();

    /* renamed from: d */
    final Context f14554d;

    private C3459g(Context context) {
        this.f14554d = context;
    }

    /* renamed from: b */
    public static C3459g m17426b(Context context) {
        C3459g c3459g = new C3459g(context);
        c3459g.f14552b.addAll(f14549e);
        c3459g.f14553c.addAll(f14550f);
        return c3459g;
    }

    /* renamed from: a */
    public C3459g m17427a(String str) {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            this.f14552b.add(file);
        }
        return this;
    }

    /* renamed from: c */
    public Bitmap m17428c(String str) {
        Bitmap decodeStream;
        Bitmap decodeFile;
        for (int size = this.f14552b.size() - 1; size >= 0; size--) {
            File file = new File((File) this.f14552b.get(size), str);
            if (file.exists() && file.isFile() && (decodeFile = BitmapFactory.decodeFile(file.getPath())) != null) {
                return decodeFile;
            }
        }
        for (int size2 = this.f14553c.size() - 1; size2 >= 0; size2--) {
            try {
                InputStream open = this.f14554d.getAssets().open(AbstractC23041d2.m118205d((String) this.f14553c.get(size2), str));
                decodeStream = BitmapFactory.decodeStream(open);
                open.close();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (decodeStream != null) {
                return decodeStream;
            }
        }
        return null;
    }

    /* renamed from: d */
    public ETC1Util.ETC1Texture m17429d(String str) {
        ETC1Util.ETC1Texture createTexture;
        for (int size = this.f14552b.size() - 1; size >= 0; size--) {
            try {
                File file = new File((File) this.f14552b.get(size), str);
                if (file.exists() && file.isFile()) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        ETC1Util.ETC1Texture createTexture2 = ETC1Util.createTexture(fileInputStream);
                        fileInputStream.close();
                        if (createTexture2 != null) {
                            return createTexture2;
                        }
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                        break;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        for (int size2 = this.f14553c.size() - 1; size2 >= 0; size2--) {
            try {
                InputStream open = this.f14554d.getAssets().open(AbstractC23041d2.m118205d((String) this.f14553c.get(size2), str));
                createTexture = ETC1Util.createTexture(open);
                open.close();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            if (createTexture != null) {
                return createTexture;
            }
        }
        return null;
    }

    /* renamed from: e */
    public String m17430e(String str) {
        byte[] m89287a;
        String m119725j;
        byte[] m89287a2;
        String m119725j2;
        int size = this.f14552b.size();
        while (true) {
            size--;
            if (size >= 0) {
                File file = new File((File) this.f14552b.get(size), str);
                if (file.exists() && file.isFile()) {
                    try {
                        if (!this.f14551a) {
                            str = AbstractC23041d2.m118196C(file.getPath());
                            return str;
                        }
                        byte[] m119724i = AbstractC23238v2.m119724i(file);
                        if (m119724i != null && (m89287a2 = AESUtils.m89287a("9C5773D9FF7A61F2AF3DD421DE144281", m119724i)) != null && (m119725j2 = AbstractC23238v2.m119725j(m89287a2)) != null) {
                            return m119725j2;
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            } else {
                for (int size2 = this.f14553c.size() - 1; size2 >= 0; size2--) {
                    try {
                        InputStream open = this.f14554d.getAssets().open(AbstractC23041d2.m118205d((String) this.f14553c.get(size2), str));
                        if (!this.f14551a) {
                            String m146001e = AbstractC29238m.m146001e(open);
                            open.close();
                            if (m146001e != null) {
                                return m146001e;
                            }
                        } else {
                            byte[] m146000d = AbstractC29238m.m146000d(open);
                            open.close();
                            if (m146000d != null && (m89287a = AESUtils.m89287a("9C5773D9FF7A61F2AF3DD421DE144281", m146000d)) != null && (m119725j = AbstractC23238v2.m119725j(m89287a)) != null) {
                                return m119725j;
                            }
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
                return null;
            }
        }
    }

    /* renamed from: f */
    public byte[] m17431f(String str) {
        byte[] m17395f;
        for (int size = this.f14552b.size() - 1; size >= 0; size--) {
            try {
                File file = new File((File) this.f14552b.get(size), str);
                if (file.exists() && file.isFile()) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        byte[] m17395f2 = AbstractC3454b.m17395f(fileInputStream);
                        fileInputStream.close();
                        if (m17395f2 != null) {
                            return m17395f2;
                        }
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                        break;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        for (int size2 = this.f14553c.size() - 1; size2 >= 0; size2--) {
            try {
                InputStream open = this.f14554d.getAssets().open(AbstractC23041d2.m118205d((String) this.f14553c.get(size2), str));
                m17395f = AbstractC3454b.m17395f(open);
                open.close();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            if (m17395f != null) {
                return m17395f;
            }
        }
        return null;
    }

    /* renamed from: g */
    public void m17432g(boolean z11) {
        this.f14551a = z11;
    }
}
