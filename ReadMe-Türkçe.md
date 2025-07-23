# 🏥 Basit Hastane Otomasyonu

Java Swing ile geliştirilmiştir.

## 🔎 Proje Hakkında

Bu proje, kliniklerle ilgili bilgilerin (doktor adı, hasta sayısı gibi) eklenip silinebileceği basit bir hastane otomasyon sistemidir. Ayrıca yoğun ve yoğun olmayan kliniklerin sayısını belirler, toplam hasta sayısını ve toplam klinik sayısını hesaplar.

## 📌 Proje Özeti

Basit Hastane Otomasyonu sistemi, kliniklerin yönetilmesini ve doktor-hasta ilişkilerinin takip edilmesini sağlar. Klinikler eklenir ve doktor adı ile hasta sayısı gibi bilgiler girilir. Bu veriler veritabanında saklanır ve analiz edilerek yoğun veya yoğun olmayan klinikler belirlenir.

## 🚀 Temel Özellikler

- Klinik ekleme ve silme  
- Klinik adı, doktor adı ve hasta sayısı girme  
- Toplam klinik ve hasta sayısını hesaplama  
- Yoğun ve yoğun olmayan klinikleri listeleme  

---

## ⚙️ Gereksinimler

Projeyi çalıştırmak için aşağıdaki programların ve kütüphanelerin kurulması gerekir:

### Kütüphaneler:
- `rs2xml.jar`  
- `mysql-connector-j-8.3.0.jar`

### Programlar:
- **Eclipse IDE** – Java tabanlı projeyi geliştirmek ve çalıştırmak için  
- **XAMPP** – Apache ve MySQL sunucularını başlatmak için  

---

## 🛠️ Kurulum

Projeyi yerel olarak çalıştırmak için şu adımları izleyin:

### XAMPP Kurulumu:

1. XAMPP’i indirip yükleyin.  
2. XAMPP Kontrol Panelini açın ve **Apache** ile **MySQL** servislerini başlatın.  
3. `MySQL Admin` butonuna tıklayarak phpMyAdmin’i açın ve `hastane` adında bir veritabanı oluşturun.  

### Eclipse Kurulumu:

1. Eclipse IDE’yi indirip kurun.  
2. Projeyi Eclipse’e aktarın.  
3. `rs2xml.jar` ve `mysql-connector-j-8.3.0.jar` dosyalarını projeye **Referenced Libraries** olarak ekleyin.  

---

## ▶️ Nasıl Çalıştırılır?

1. XAMPP üzerinden Apache ve MySQL servislerini başlatın.  
2. phpMyAdmin üzerinden `hastane` adlı veritabanını oluşturun.  
3. Eclipse’i açın ve şu dosyaların aynı pakette olduğundan emin olun:  
   - `Anasayfa.java`  
   - `PoliklinlikEkle.java`  
   - `myJDBC.java`  
4. `Anasayfa.java` dosyasına sağ tıklayıp **Run As > Java Application** seçin.  
5. Uygulama artık kullanıma hazır.  

---

## 🖱️ Kullanım

- Klinik bilgisi eklemek için **PoliklinlikEkle** butonuna tıklayın.  
- Doktor adı, klinik adı ve hasta sayısı gibi bilgileri sırayla girin.  
- Girilen tüm veriler veritabanına kaydedilir.  
- Sağ tarafta sonuçlar, sol tarafta ise girilen verilerin listesi otomatik olarak gösterilir.  

---

## 🤝 Katkı Sağlamak

Projeye katkıda bulunmak istiyorsanız şu adımları izleyin:

1. Depoyu forklayın  
2. Yeni bir dal oluşturun: `git checkout -b ozellik-adi`  
3. Değişikliklerinizi commit'leyin: `git commit -m 'Yeni özellik eklendi'`  
4. Dalınızı push’layın: `git push origin ozellik-adi`  
5. Bir pull request açın  

---

## 📄 Lisans

Bu proje herhangi bir özel lisans altında değildir. Dilediğiniz gibi kullanabilir ve değiştirebilirsiniz.
