# SlothPlugin

Sloth to świetny plugin na twój serwer. Dzięki module konfiguracji, będzie działał tak, jak TY chcesz.

# Spis Treści

1. [Dokumentacja](#docs)
    1. [Instalacja](#installation)
    2. [Konfiguracja](#konfiguracja)
    3. [Komendy](#commands)
3. [Pomoc](#helpcenter)
2. [Licencja](#license)

# [Dokumentacja](#docs)

## [Instalacja](#installation)

Aby zainstalować plugin wejdź w folder plugin/versions a nastepnie wybierz wersję. Na razie dostępna jest tylko wersja 1.16.5

W folderze znajdziesz plik jar - pobierz go

Aby zamocować plugin na swoim serwerze wklej plik jar w folder plugins na swoim hostingu

Za niedługo dostępna będzie instalacja z naszej strony www



## [Konfiguracja](#konfiguracja)

Kiedy pierwszy raz odpalisz plugin na swoim serwerze stworzy się folder `SlothPlugin`

Wejdź w ten folder, pojawią się wtedy 2 pliki: `config.yml` oraz `pluginconfig.yml`

Wejdź w plik `pluginconfig.yml`, wyświetli ci się mnóstwo możliwości, oczywiście możesz je edytować

Teraz czas na twoją wyobraźnię. Skonfiguruj plugin jak chcesz, do własnych potrzeb.


Wyjaśnienia każdej opcji w pliku `pluginconfig.yml`:

& `JoinMessage` - Wiadomość do wyświetlania kiedy ktoś dołączy na serwer.

& `LeaveMessage` - Wiadomość do wyświetlania kiedy ktoś wyjdzie z serwera.

& `StrikeCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `strike`

& `TntCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `tnt`

& `CraftingCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `crafting`

& `FeedCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `feed`

& `FlyOnCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `fly` i opcja lotu zostanie **włączona**

& `FlyOffCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `fly` i opcja lotu zostanie **wyłączona**

& `GodOnCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `god` i opcja god zostanie **włączona**

& `GodOffCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `god` i opcja god zostanie **wyłączona**

& `HealCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `heal`

`MissingPermissionsMessage` - Wiadomość do wyświetlania gdy użytkownik nie będzie miał permisji do wykonania komendy

Aby zapisać konfiguracje bez przeładowywania serwera, użyj komendy `reloadconfig` (Komendę możesz wywołać tylko przez konsolę)


Legenda:

`&` - Możesz użyć [formatowania tekstu](https://minecraft.fandom.com/pl/wiki/Kody_formatowania). 

Przykład: `JoinMessage: '&lWitaj na serwerze '`


# [Komendy](#commands)

`heal` - Ulecz się

Wymagane permisje: `slothplugin.heal`

`feed` - Spraw aby twój pasek głodu był pełny

Wymagane permisje: `slothplugin.feed`

`god` - Ustaw tryb god

Wymagane permisje: `slothplugin.god`

`fly` - Włącz możliwość latania

Wymagane permisje: `slothplugin.fly`

`crafting` - Otwórz crafting table

Wymagane permisje: `slothplugin.crafting`

`strike` - Zespawnuj błyskawicę

Wymagane permisje: `slothplugin.strike`

`stats` - Zobacz swoje statystyki

Wymagane permisje: Brak wymaganych permisji

`reloadconfig` - Przeładuj pliki konfiguracji

Wymagane permisje: Komenda możliwa do wywołania **tylko przez konsolę**

`tnt` - Zespawnuj tnt

Wymagane permisje: `slothplugin.tnt`

`floatingtext` - Stwórz lewitujący tekst

Wymagane permisje: `slothplugin.floatingtext`

Wymagane argumenty: `text`

# [Pomoc](#helpcenter)

Indywidualną pomoc możesz uzyskać na naszym serwerze discord.

# [Licencja](#license)

Cały kod podlega licencji Apache-2.0